public class Semaforo {
    private boolean acceso;
    private String colore;

    public Semaforo() {
        acceso = false;
        colore = "";
    }

    public void accendi() {
        acceso = true;
        colore = "VERDE";
    }

    public void spegni() {
        acceso = false;
        colore = "";
    }

    public void toggle() {
        if (acceso) {
            spegni();
        } else {
            accendi();
        }
    }

    public void avanza() {
        if (!acceso) return;

        switch (colore) {
            case "VERDE":
                colore = "GIALLO";
                break;
            case "GIALLO":
                colore = "ROSSO";
                break;
            case "ROSSO":
                colore = "VERDE";
                break;
        }
    }

    public boolean isAcceso() {
        return acceso;
    }

    public String getColore() {
        if (acceso) {
            return colore;
        } else {
            return "";
        }
    }

    @Override
    public String toString() {
        if (acceso) {
            return "Il semaforo è acceso sul " + colore;
        } else {
            return "Il semaforo è spento";
        }
    }
}
