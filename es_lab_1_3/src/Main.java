import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //es1
        Scanner in = new Scanner(System.in);

        System.out.println("Quanti numeri vuoi inserire: ");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            if(i%2 != 0){
                System.out.print(i + ", ");
            }
        }

        //es2
        System.out.println("Numero 1:");
        int n1 = in.nextInt();
        System.out.println("Numero 2:");
        int n2 = in.nextInt();
        System.out.println("Numero 3:");
        int n3 = in.nextInt();

        if(n1 > n2 && n1 > n3){
            System.out.println("Il maggiore è numero 1: " + n1);
        }
        if(n3 > n1 && n3 > n2){
            System.out.println("Il maggiore è il numero 3: " + n3);
        }
        if (n2 > n1 && n2 > n3) {
            System.out.println("Il maggiore è il numero 2: " + n2);
        }

        //es3
        System.out.println("Inserisci una parola: ");
        String s = in.next();

        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }
}