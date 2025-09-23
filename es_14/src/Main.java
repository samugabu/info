import java.util.Scanner;

//es14
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Quanti numeri vuoi inserire: ");
        int n = in.nextInt();

        float somma = 0;
        float media;

        for (int i = 0; i < n; i++) {
            System.out.println("Numero float: ");
            float f = in.nextFloat();
            
            somma += f;
        }

        media = somma/n;

        System.out.println("La media è: " + media);
    }
}