import java.util.Scanner;

//esercizi 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11
public class Main {
    public static void main(String[] args) {
        //es1
        Scanner in = new Scanner(System.in);

        System.out.println("Inserisci una variabile intera: ");
        int n = in.nextInt();

        System.out.println("Variabile " + n);

        //es2
        Scanner in1 = new Scanner(System.in);

        System.out.println("Inserisci una variabile float: ");
        float n1 = in1.nextFloat();

        System.out.println("Variabile " + n1);

        //es3
        Scanner ind = new Scanner(System.in);

        System.out.println("Inserisci una variabile float: ");
        double nd = ind.nextDouble();

        System.out.println("Variabile " + nd);

        //es4
        Scanner in2 = new Scanner(System.in);
        int n2 = in2.nextInt();
        float n3 = in2.nextInt();
        double n4 = in2.nextDouble();

        System.out.println("Numeri in ordine inverso: " + n4 + ", " + n3 +", " + n2);

        //es5
        Scanner in3 = new Scanner(System.in);
        int num = in3.nextInt();

        System.out.println(num+10 + "," + num+100 + ", " + num+1000);


        //es6

    }
}