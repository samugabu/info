import java.util.Scanner;

//array es4
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] a = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Valore");

            a[i] = in.nextInt();

            if(a[i] < 0){
                System.out.println("Errore");
                break;
            }
        }

        for (int i = 10; i >= 0; i++) {
            System.out.print(a[i] + ", ");
        }
    }
}