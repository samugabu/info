public class Punto {
    private double x;
    private double y;
    private int angolo;

    public Punto(){
        this.x = 0;
        this.y = 0;
    }

    public Punto(Punto p){
        this.x = p.x;
        this.y = p.y;
    }

    public Punto(double x, double y){
        x = this.x;
        y = this.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distanza(Punto b){

        double n = this.x - b.x;
        double p1 = Math.pow(n, 2);
        double n1 = this.y - b.y;
        double p2 = Math.pow(n1, 2);

        double d = p1 + p2;

        double dist = Math.sqrt(d);
        return dist;
    }

    public String puntomedio(Punto b){
        double puntom_x = (x + this.x)/2;
        double puntom_y = (y + this.y)/2;

        return "Il punto medio: " + puntom_x + ", " + puntom_y;
    }

    public void ruota(double angolo){
        double r = Math.toRadians(angolo);

        double nuovoX = x * Math.cos(r) - y * Math.sin(r);
        double nuovoY = x * Math.sin(r) + y * Math.cos(r);

        this.x = nuovoX;
        this.y = nuovoY;
    }

    @Override
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}
