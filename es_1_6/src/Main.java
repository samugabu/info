import java.util.Scanner;

//esercizi 1, 2, 3, 4, 5
public class Main {
    public static void main(String[] args) {
        //es1
        Scanner in = new Scanner(System.in);

        System.out.println("Inserisci una variabile intera: ");
        int n = in.nextInt();

        System.out.println("Variabile " + n);

        //es2
        System.out.println("Inserisci una variabile float: ");
        float n1 = in.nextFloat();

        System.out.println("Variabile " + n1);

        //es3
        System.out.println("Inserisci una variabile float: ");
        double nd = in.nextDouble();

        System.out.println("Variabile " + nd);

        //es4
        int n2 = in.nextInt();
        float n3 = in.nextInt();
        double n4 = in.nextDouble();

        System.out.println("Numeri in ordine inverso: " + n4 + ", " + n3 +", " + n2);

        //es5
        int num = in.nextInt();

        int num1, num2, num3;
        num1 = num + 10;
        num2 = num + 100;
        num3 = num + 100;

        System.out.println("Numero: " + num1 + ", " + num2 + ", " + num3);

        //es6
        System.out.println("Numero intero: ");
        int numero = in.nextInt();

        int numero1;
        int numero2;
        int numero3;

        numero1 = numero*100;
        numero2 = numero%10;
        numero3 = numero2*3;

        System.out.println("Numeri: " + numero1 + ", " + numero2 + ", " + numero3);
    }
}