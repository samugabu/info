import java.util.Scanner;

//es13
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci n: ");
        int n = in.nextInt();
        System.out.println("Inserisci m: ");
        int m = in.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }
}