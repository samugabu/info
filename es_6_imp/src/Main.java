import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Inserisci un numero intero: ");

        int n = in.nextInt();
        int d;

        d = n%10;

        System.out.println("Numero: " + n*100 + " Numero: " + d + " Numero: " + d/3);
    }
}