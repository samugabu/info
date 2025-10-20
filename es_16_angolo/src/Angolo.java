public class Angolo {
    private int g;
    private int p;
    private int s;

    public Angolo(){
        g = 0;
        p = 0;
        s = 0;
    }

    public Angolo(int g, int p, int s){
        if(g > 359)
            g -= 360;
        else if(g < 0)
            g += 360;

        if(p > 60)
            p -= 60;
        else if(p < 0)
            p += 60;

        if(s > 60)
            s -= 60;
        else if(s < 0)
            s += 60;
    }

    private void ContollaGradi(int g){
        if(g > 359)
            g -= 360;
        else if(g < 0)
            g += 360;
    }

    private void ContollaPrimi(int p){
        if(p > 60)
            p -= 60;
        else if(p < 0)
            p += 60;
    }

    private void ControllaSecondi(int s){
        if(s > 60)
            s -= 60;
        else if(s < 0)
            s += 60;
    }

    public Angolo(double d){
        this.g = (int) d;
        float ptd = (int) d - g;

        p = (int) (ptd * 0.6);

        ptd = (int) (p/0.6);
        s = (int) (ptd * 0.6);

    }

    public int getG() {
        return g;
    }

    public int getP() {
        return p;
    }

    public int getS() {
        return s;
    }

    public Angolo somma(Angolo a){
        g += a.g;
        ContollaGradi(g);

        p += a.p;
        ContollaPrimi(p);

        s += a.s;
        ControllaSecondi(s);

        return new Angolo(g, p, s);
    }

    public Angolo differenza(Angolo a){
        g -= a.g;
        ContollaGradi(g);

        p -= a.p;
        ContollaPrimi(p);

        s -= a.s;
        ControllaSecondi(s);

        return new Angolo(g, p, s);
    }

    public double GetRadianti(){
        return (g + (p/60) + (s/3600) * Math.PI/180);
    }
}
