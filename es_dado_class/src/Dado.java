public class Dado {
    private int faccie;

    public Dado(){
        this.faccie = 6;
    }

    public Dado(int faccie){
        if(faccie < 2 || faccie == 3)
            this.faccie = 6;
        else
            this.faccie = faccie;
    }

    public int lancia(int faccie){
        int num = (int)(Math.random() * faccie) + 1;

        return num;
    }

    @Override
    public String toString(){
        return "Faccie: " + this.faccie + ", Numero randomico: " + lancia(this.faccie);
    }
}