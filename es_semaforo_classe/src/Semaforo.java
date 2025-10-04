//0 = colore rosso
//1 = colore giallo
//2 = colore verde

public class Semaforo {
    public int luce;
    private boolean acceso;

    public Semaforo(){
        this.acceso = false;
    }

    public void acceso() {
        luce = 0;
        this.acceso = true;
    }

    public void spento() {
        this.acceso = false;
    }

    public void toggle(){
        if(acceso)
            acceso = false;
        else
            acceso = true;
    }

    public void avanza(){
        if(acceso) {
            if(luce == 2)
                luce = 1;
            else if(luce == 1)
                luce = 0;
            else if(luce == 0)
                luce = 2;
        }
    }

    public boolean isAcceso() {
        return acceso;
    }

    public String getColore(){
        String colore = "";
        String s;

        if(luce == 0)
            colore = "rosso";
        if(luce == 1)
            colore = "giallo";
        if(luce == 2)
            colore = "verde";

        if(!acceso)
            return "Il semaforo è spento";
        else
            return "Il colore del semaforo è: " + colore;
    }

    @Override
    public String toString(){
        String colore = "";

        if(luce == 0)
            colore = "rosso";
        if(luce == 1)
            colore = "giallo";
        if(luce == 2)
            colore = "verde";

        if(!acceso)
            return "Il semaforo è spento";
        else
            return "Il semaforo è acceso su: " + colore;
    }
}
