public class Incrocio {
    private Semaforo nord, sud, est, ovest;

    public Incrocio() {
        nord = new Semaforo();
        sud = new Semaforo();
        est = new Semaforo();
        ovest = new Semaforo();
    }

    public void accendi() {
        nord.accendi();
        sud.accendi();
        est.accendi();
        ovest.accendi();

        nord.avanza();
        nord.avanza();

        sud.avanza();
        sud.avanza();
    }

    public void spegni() {
        nord.spegni();
        sud.spegni();
        est.spegni();
        ovest.spegni();
    }

    public boolean isAcceso() {
        return nord.isAcceso() && sud.isAcceso() && est.isAcceso() && ovest.isAcceso();
    }

    public String getColore(char direzione) {
        switch (direzione) {
            case 'N':
                return nord.getColore();
            case 'S':
                return sud.getColore();
            case 'E':
                return est.getColore();
            case 'O':
                return ovest.getColore();
        }
        return "";
    }

    public void avanza() {
    }

    @Override
    public String toString() {

    }
}
