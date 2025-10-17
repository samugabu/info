public class TabelloneTennis {
    private String giocatore1;
    private String giocatore2;

    private int setGiocatore1;
    private int setGiocatore2;

    private int gameGiocatore1;
    private int gameGiocatore2;

    private int puntiGiocatore1; // 0, 1, 2, 3, 4 (dove 4 è "vantaggio")
    private int puntiGiocatore2;

    private boolean vantaggioGiocatore1 = false;
    private boolean vantaggioGiocatore2 = false;

    private int servizio; // 1 o 2
    private int tipoPartita; // 3 o 5

    private boolean partitaTerminata = false;

    private boolean tieBreak = false;
    private int tieBreakPunti1 = 0;
    private int tieBreakPunti2 = 0;

    public TabelloneTennis(String g1, String g2, int servizio, int tipoPartita) {
        this.giocatore1 = g1;
        this.giocatore2 = g2;

        if (servizio != 1 && servizio != 2)
            this.servizio = 1;
        else
            this.servizio = servizio;

        if (tipoPartita != 3 && tipoPartita != 5)
            this.tipoPartita = 3;
        else
            this.tipoPartita = tipoPartita;
    }

    public boolean aggiungiPunto(int giocatore) {
        if (partitaTerminata || (giocatore != 1 && giocatore != 2))
            return false;

        if (tieBreak) {
            if (giocatore == 1) tieBreakPunti1++;
            else tieBreakPunti2++;

            if (Math.max(tieBreakPunti1, tieBreakPunti2) >= 7 &&
                    Math.abs(tieBreakPunti1 - tieBreakPunti2) >= 2) {
                if (tieBreakPunti1 > tieBreakPunti2) setGiocatore1++;
                else setGiocatore2++;
                resetGame();
                tieBreak = false;
                cambioServizio();
                controllaFinePartita();
            } else {
                cambioServizio();
            }
            return true;
        }

        if (giocatore == 1) {
            if (puntiGiocatore1 == 3 && puntiGiocatore2 < 3) {
                vintoGame(1);
            } else if (puntiGiocatore1 == 3 && puntiGiocatore2 == 3) {
                if (vantaggioGiocatore1) {
                    vintoGame(1);
                } else if (vantaggioGiocatore2) {
                    vantaggioGiocatore2 = false;
                } else {
                    vantaggioGiocatore1 = true;
                }
            } else if (puntiGiocatore1 < 3) {
                puntiGiocatore1++;
            }
        } else {
            if (puntiGiocatore2 == 3 && puntiGiocatore1 < 3) {
                vintoGame(2);
            } else if (puntiGiocatore2 == 3 && puntiGiocatore1 == 3) {
                if (vantaggioGiocatore2) {
                    vintoGame(2);
                } else if (vantaggioGiocatore1) {
                    vantaggioGiocatore1 = false;
                } else {
                    vantaggioGiocatore2 = true;
                }
            } else if (puntiGiocatore2 < 3) {
                puntiGiocatore2++;
            }
        }

        return true;
    }

    private void vintoGame(int vincitore) {
        if (vincitore == 1) gameGiocatore1++;
        else gameGiocatore2++;

        puntiGiocatore1 = 0;
        puntiGiocatore2 = 0;
        vantaggioGiocatore1 = false;
        vantaggioGiocatore2 = false;

        if (Math.max(gameGiocatore1, gameGiocatore2) >= 6) {
            if (Math.abs(gameGiocatore1 - gameGiocatore2) >= 2) {
                if (gameGiocatore1 > gameGiocatore2) setGiocatore1++;
                else setGiocatore2++;
                resetGame();
                cambioServizio();
                controllaFinePartita();
                return;
            } else if (gameGiocatore1 == 6 && gameGiocatore2 == 6) {
                tieBreak = true;
            }
        }
        cambioServizio();
    }

    private void resetGame() {
        gameGiocatore1 = 0;
        gameGiocatore2 = 0;
        puntiGiocatore1 = 0;
        puntiGiocatore2 = 0;
        vantaggioGiocatore1 = false;
        vantaggioGiocatore2 = false;
        tieBreakPunti1 = 0;
        tieBreakPunti2 = 0;
    }

    private void cambioServizio() {
        if(servizio == 1)
            servizio = 2;
        else servizio = 1;
    }

    private void controllaFinePartita() {
        int setsToWin = tipoPartita / 2 + 1;
        if (setGiocatore1 == setsToWin || setGiocatore2 == setsToWin) {
            partitaTerminata = true;
        }
    }

    public String vittoria() {
        if (!partitaTerminata)
            return "";
        if (setGiocatore1 > setGiocatore2) {
            return "Ha vinto: " + giocatore1;
        } else {
            return "Ha vinto: " + giocatore2;
        }
    }

    private String getPunteggio(int punti, boolean vantaggio) {
        if (vantaggio)
            return "ADV";
        switch (punti) {
            case 0:
                return "0";
            case 1:
                return "15";
            case 2:
                return "30";
            case 3:
                return "40";
            default:
                return "";
        }
    }

    @Override
    public String toString() {
        String punteggio1, punteggio2;

        if (tieBreak) {
            punteggio1 = "" + tieBreakPunti1;
            punteggio2 = "" + tieBreakPunti2;
        } else {
            punteggio1 = getPunteggio(puntiGiocatore1, vantaggioGiocatore1);
            punteggio2 = getPunteggio(puntiGiocatore2, vantaggioGiocatore2);
        }

        String linea1 = giocatore1;
        if (servizio == 1) {
            linea1 += " *";
        }
        linea1 += " " + setGiocatore1 + " " + gameGiocatore1 + " " + punteggio1;

        String linea2 = giocatore2;
        if (servizio == 2) {
            linea2 += " *";
        }
        linea2 += " " + setGiocatore2 + " " + gameGiocatore2 + " " + punteggio2;

        return linea1 + "\n" +
                linea2;
    }
}

