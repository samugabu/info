import java.util.Objects;

public class Segmento {
    private Punto p1;
    private Punto p2;

    public Segmento(Punto a, Punto b){
        p1 = a;
        p2 = b;
    }

    public Segmento(Segmento s){
        this.p1 = s.p1;
        this.p2 = s.p2;
    }

    public boolean interseca(Segmento d){
        double x1 = p1.getX();
        double y1 = p1.getY();

        double x2 = p2.getX();
        double y2 = p2.getY();

        double x3 = d.p1.getX();
        double y3 = d.p1.getY();

        double x4 = d.p2.getX();
        double y4 = d.p2.getY();

        double r = (x1 - x2)*(y1 - y2) - (x3 - x4)*(y3 - y4);

        if(r == 0)
            return false;
        else
            return true;
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Segmento)){
            return false;
        }

        Segmento s = (Segmento) o;

        if(p1.getX() != s.p1.getX() || p2.getY() != s.p2.getY())
            return false;
        else
            return true;
    }

    @Override
    public String toString(){
        return "{(" + p1.getX() + ", " + p1.getY() + "), " + "(" + p2.getX() + ", " + p2.getY() + ")}.";
    }
}
