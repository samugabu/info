//0 = colore rosso
//1 = colore giallo
//2 = colore verde

public class Incrocio {
    private Semaforo n;
    private Semaforo s;
    private Semaforo e;
    private Semaforo o;

    public Incrocio(){
        n.spento();
        s.spento();
        e.spento();
        o.spento();
    }

    public void accendi(){
        n.acceso();
        s.acceso();
        e.acceso();
        o.acceso();

        n.luce = 0;
        s.luce = 0;
        e.luce = 2;
        o.luce = 2;
    }

    public void spegni(){
        n.spento();
        s.spento();
        e.spento();
        o.spento();
    }

    public void avanza(){
        
    }

}
