// mod1
// 1 normale
// 2 orario
// 3 sveglia

//mod 2
//1 pre le ore
//2 èer i minuti

import javax.print.attribute.standard.OrientationRequested;

public class OrologioDigitale {
    private int mod;
    private int mod2;
    private int oreOrologio;
    private int minOrologio;
    private int oreSveglia;
    private int minSveglia;
    private boolean svegliaAttiva;

    public OrologioDigitale(){
        oreOrologio = 0;
        minOrologio = 0;
        mod = 1;
    }

    public OrologioDigitale(int oreOrologio, int minOrologio){
        if(oreOrologio < 0 || oreOrologio > 60)
            oreOrologio = 0;
        if(minOrologio < 0 || minOrologio < 60)
            minOrologio = 0;
    }

    public void impostaOrario(){
        if(mod != 2){
            mod = 2;
        } else if(mod == 2){
            mod = 1;
        }
    }

    public void impostaSveglia(){
        if(mod != 3){
            mod = 3;
        } if(mod == 3){
            mod = 1;
        }
    }

    public void toggleSveglia(){
        if(mod == 3){
            mod = 2;
            svegliaAttiva = false;
        }
        if(mod != 3){
            mod = 2;
            svegliaAttiva = true;
        }
    }

    public void aumenta(){
        if(mod2 == 1) {
            if (mod == 2) {
                oreOrologio++;
                if (oreOrologio > 23) {
                    oreOrologio = 0;
                }
            }
            if (mod == 3) {
                oreSveglia++;
                if (oreSveglia > 23) {
                    oreSveglia = 0;
                }
            }
        }
        if(mod2 == 2){
            if (mod == 2) {
                minOrologio++;
                if (minOrologio > 59) {
                    oreOrologio++;
                    minOrologio = 0;
                    if(oreOrologio > 23){
                        oreOrologio = 0;
                    }
                }
            }
            if (mod == 3) {
                minSveglia++;
                if (minSveglia > 59) {
                    oreSveglia++;
                    minSveglia = 0;
                    if(oreSveglia > 23){
                        oreSveglia = 0;
                    }
                }
            }
        }
    }

    public void diminuisci(){
        if(mod2 == 1) {
            if (mod == 2) {
                oreOrologio--;
                if (oreOrologio < 0) {
                    oreOrologio = 23;
                }
            }
            if (mod == 3) {
                oreSveglia--;
                if (oreSveglia < 0) {
                    oreSveglia = 23;
                }
            }
        }
        if(mod2 == 2){
            if (mod == 2) {
                minOrologio--;
                if (minOrologio < 0) {
                    oreOrologio--;
                    minOrologio = 59;
                    if(oreOrologio < 0){
                        oreOrologio = 23;
                    }
                }
            }
            if (mod == 3) {
                minSveglia--;
                if (minSveglia < 0) {
                    oreSveglia--;
                    minSveglia = 59;
                    if(oreSveglia < 0){
                        oreSveglia = 23;
                    }
                }
            }
        }
    }

    public void toggleMinuti(){
        if(mod2 == 1)
            mod2 = 2;
        if(mod == 2)
            mod = 1;
    }

    @Override
    public String toString(){
        String s = "";
        String sa = "";
        String m2 = "";
        String oo1 = "";
        String ov2 = "";
        String mo1 = "";
        String mv2 = "";

        if(mod == 1)
            s = "normale";
        if(mod == 2)
            s = "mod orologio";
        if(mod == 3)
            s = "mod sveglia";
        if(mod2 == 1)
            m2 = "regolazione ore";
        if(mod == 2)
            m2 = "regolazione minuti";
        if(!svegliaAttiva)
            sa = "disattiva";
        if(svegliaAttiva)
            sa = "atttiva";

        if(oreOrologio < 10)
            oo1 = "0" + oreOrologio;
        else oo1 = "" + oreOrologio;

        if(oreSveglia < 10)
            ov2 = "0" + oreSveglia;
        else ov2 = "" + oreSveglia;

        if(minOrologio < 10)
            mo1 = "0" + minOrologio;
        else mo1 = "" + minOrologio;

        if(minSveglia < 10)
            mv2 = "0" + minSveglia;
        else mv2 = "" + minSveglia;

        return "Orologio in modalità: " + s + ", " + m2 + "\n" +
                "Orario corrente: " + oo1 + ":" + mo1 + "\n" +
                "Sveglia corrente: " + ov2 + ":" + mv2 + ", " + sa;
    }
}
