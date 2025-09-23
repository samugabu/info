import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

//es12
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci un numero n:");
        int n = in.nextInt();
        System.out.println("Inserire un carattere: ");
        String c = in.next();

        for (int i = 0; i < n; i++) {
            System.out.println(c.charAt(0));
        }
    }
}