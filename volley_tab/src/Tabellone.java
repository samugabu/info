// 1 = casa, 2 = ospiti

public class Tabellone {
    private String casa;
    private String ospiti;
    private int puntiCasa;
    private int puntiOspiti;
    private int setCasa;
    private int setOspiti;
    private int servizio; 
    private int setInCorso;

    public Tabellone(String casa, String ospiti, int servizio) {
        this.casa = casa;
        this.ospiti = ospiti;
        this.puntiCasa = 0;
        this.puntiOspiti = 0;
        this.setCasa = 0;
        this.setOspiti = 0;
        this.setInCorso = 1;

        if (servizio != 1 && servizio != 2)
            this.servizio = 1;
        else
            this.servizio = servizio;
    }

    public void puntoCasa() {
        puntiCasa++;
        servizio = 1;
        controllaFineSet();
    }

    public void puntoOspiti() {
        puntiOspiti++;
        servizio = 2;
        controllaFineSet();
    }

    private void controllaFineSet() {
        if (puntiCasa >= 25 || puntiOspiti >= 25) {
            if (puntiCasa - puntiOspiti >= 2 || puntiOspiti - punitCasa >= 2) {
                if (puntiCasa > puntiOspiti)
                    setCasa++;
                else
                    setOspiti++;

                puntiCasa = 0;
                puntiOspiti = 0;
                setInCorso++;

                if (servizio == 1)
                    servizio = 2;
                else servizio = 1;
            }
        }
    }

    public boolean partitaFinita() {
        return (setCasa == 3 || setOspiti == 3);
    }

    @Override
    public String toString() {
        String servizioCasa;
        if (servizio == 1) {
            servizioCasa = "*";
        } else {
            servizioCasa = " ";
        }

        String servizioOspiti;
        if (servizio == 2) {
            servizioOspiti = "*";
        } else {
            servizioOspiti = " ";
        }

        return casa + " - " + ospiti + "\n"
                + puntiCasa + " " + servizioCasa + "        "
                + puntiOspiti + " " + servizioOspiti + "\n"
                + "Set:  " + setCasa + "             " + setOspiti + "\n";

    }
}

