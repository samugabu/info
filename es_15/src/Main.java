import java.util.Scanner;

//es15
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Quanti numeri vuoi inserire: ");
        int n = in.nextInt();

        float somma = 0;
        float media;

        for (int i = 0; i < n; i++) {
            System.out.println("Numeri float: ");
            float f = in.nextFloat();

            if(f > 100){
                somma += f;
            }
        }

        media = somma/n;

        System.out.println("La media è: " + media);
    }
}