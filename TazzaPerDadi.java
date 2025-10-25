import java.util.ArrayList;
import java.util.List;

public class TazzaPerDadi {
    private int num_dadi;
    private List<Dado> dadi;

    public TazzaPerDadi(int num_dadi){
        this.num_dadi = num_dadi;
        this.dadi = new ArrayList<>();
    }

    public TazzaPerDadi(int N, int F){
        num_dadi = N;
        dadi = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            dadi.add(new Dado(F));
        }
    }

    public boolean Add(Dado d){
        if (dadi.size() < num_dadi) {
            dadi.add(d);
            return true;
        }
        return false;
    }

    public int Quanti(){
        return dadi.size();
    }

    public int Size(){
        return num_dadi;
    }

    public boolean IsEmpty(){
        if(dadi.isEmpty())
            return false;
        else return true;
    }

    //non ho capito
//    public int GetMassimo(){
//    }

    public int GetMinimo() {
        return dadi.size();
    }

    public int Lancia(){
        int somma = 0;
        Dado d = new Dado();

        for (int i = 0; i < dadi.size(); i++) {
            somma += d.lancia();
        }
        return somma;
    }
}
