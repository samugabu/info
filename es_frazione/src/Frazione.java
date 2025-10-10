public class Frazione {
    private int num;
    private int den;

    public Frazione(){
        num = 0;
        den = 0;
    }

    public Frazione(int num, int den){
        this.num = num;

        if(den == 0){
            den = 1;
        }
    }

    public Frazione(Frazione f){
        this.num = f.num;
        this.den = f.den;
    }

    public void setDen(int den) {
        this.den = den;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public int getDen() {
        if(den == 0){
            return den;
        }
        return den;
    }

    public double todouble(){
        return num / den;
    }

    private static int calcolaMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    private void riduci(){
        int divisore = calcolaMCD(num, den);
        num = num / divisore;
        den = den / divisore;
    }

    public Frazione somma(Frazione a){
        Frazione f = new Frazione();
        f.num = this.num * a.den + this.den * a.num;
        f.den = this.den * a.den;

        f.riduci();
        return f;
    }

    public Frazione differenza(Frazione a){

    }

    public Frazione prodotto(Frazione a){

    }

    public Frazione quoziente(Frazione a{

    }

    @Override
    public boolean equals(){

    }

    @Override
    public String tostring(){

    }
}
