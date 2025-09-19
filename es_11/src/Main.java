import java.util.Scanner;

//es 11
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double d;

        System.out.println("Inserisci un numero tra un milardo e due miliardi: ");
        double n = in.nextDouble();

        System.out.println("Inserisci un numero tra un milardo e due miliardi: ");
        double n1 = in.nextLong();

        double somma = n+n1;
        double prodotto = n*n1;

        System.out.println("Somma: " + somma);

        if (n > n1){
            d = n - n1;
            System.out.println("differenza: " + d);
        }else {
            d = n1 - n;
            System.out.println("differenza: " + d);
        }

        System.out.println("prodotto: " + prodotto);
    }
}