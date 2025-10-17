public class Angolo {
    private int gradi;
    private int primi;
    private int secondi;

    public Angolo() {
        gradi = 0;
        primi = 0;
        secondi = 0;
    }

    public Angolo(int gradi, int primi, int secondi) {
        secondi = ((secondi % 60) + 60) % 60;
        int min = secondi / 60;

        primi = ((primi + min) % 60 + 60) % 60;
        int gradi2 = (primi + min) / 60;

        gradi = ((gradi + gradi2) % 360 + 360) % 360;

        this.gradi = gradi;
        this.primi = primi;
        this.secondi = secondi;
    }

    public Angolo(double angoloDecimale) {
        angoloDecimale = ((angoloDecimale % 360) + 360) % 360;

        gradi = (int) angoloDecimale;
        double parteDecimale = angoloDecimale - gradi;

        double minutiTot = parteDecimale * 60;
        primi = (int) minutiTot;

        double secondiTot = (minutiTot - primi) * 60;
        secondi = (int) Math.round(secondiTot);

        if (secondi >= 60) {
            secondi -= 60;
            primi++;
        }
        if (primi >= 60) {
            primi -= 60;
            gradi = (gradi + 1) % 360;
        }
    }

    public int getGradi() {
        return gradi;
    }

    public int getPrimi() {
        return primi;
    }

    public int getSecondi() {
        return secondi;
    }

    public Angolo somma(Angolo a) {
        int g = this.gradi + a.gradi;
        int p = this.primi + a.primi;
        int s = this.secondi + a.secondi;
        return new Angolo(g, p, s);
    }

    public Angolo differenza(Angolo a) {
        int tot1 = this.gradi * 3600 + this.primi * 60 + this.secondi;
        int tot2 = a.gradi * 3600 + a.primi * 60 + a.secondi;

        int diff = tot1 - tot2;
        diff = ((diff % (360 * 3600)) + (360 * 3600)) % (360 * 3600);

        int g = diff / 3600;
        int p = (diff % 3600) / 60;
        int s = diff % 60;
        return new Angolo(g, p, s);
    }

    public double getRadianti() {
        double totaleGradi = gradi + primi / 60.0 + secondi / 3600.0;
        return Math.toRadians(totaleGradi);
    }

    @Override
    public String toString() {
        return gradi + "° " + primi + "’ " + secondi + "”";
    }
}

