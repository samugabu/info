public class Ascensore {
    private int piani;
    private int piano_attuale;
    private boolean porte_aperte;
    private final int MAX = 20;

    public Ascensore(int piani){
        if(piani < 2){
            piani = 2;
        }

        piano_attuale = 0;
        porte_aperte = false;
    }

    public int getPiano() {
        return piano_attuale;
    }

    public int getPiani() {
        return piani;
    }

    public void apri(){
        porte_aperte = true;
    }

    public void chiudi(){
        porte_aperte = false;
    }

    public boolean sali(){
        if(!porte_aperte){
            piano_attuale++;
        }
        if(porte_aperte || piani > MAX){
            return false;
        }
        else
            return false;
    }

    public boolean scendi(){
        if(!porte_aperte){
            piano_attuale--;
        }
        if(porte_aperte || piani < 0){
            return false;
        }
        else
            return true;
    }

    public boolean vaialPiano(int dest){
        if(dest < 0 || dest > MAX || porte_aperte){
            return false;
        }else
            piani = dest;
            return true;
    }

    @Override
    public String toString(){
        String s;
        if(piano_attuale == 0){
            s = "Terra";
        } else
            s = "" + piano_attuale;

        return "L'ascensore serve: " + piani + ", attualmente è al piano: " + s + "e le porte sono: " + porte_aperte;
    }
}
