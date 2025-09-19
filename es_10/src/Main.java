import java.util.Scanner;

//es 10
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long d;

        System.out.println("Inserisci un numero tra un milardo e due miliardi: ");
        long n = in.nextLong();

        System.out.println("Inserisci un numero tra un milardo e due miliardi: ");
        long n1 = in.nextLong();

        long somma = n+n1;
        long prodotto = n*n1;

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