//array es 5

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] a = new int[50];
        int[] appoggio = new int[50];

        System.out.println("Quanti elementi vuoi inserire: ");
        int N = in.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Valore: ");
            a[i] = in.nextInt();
        }

        for (int i = N - 1; i >= 0; i--) {
            appoggio[i] = a[N - 1 - i];
        }

        for (int i = 0; i < N; i++) {
            System.out.print(appoggio[i] + ", ");
        }

    }
}