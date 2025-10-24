import java.util.Scanner;

//array es3
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] a = new int[10];

        for (int i = 0; i < 10; i++) {
            a[i] = (int)(Math.random() * 10) -1;

            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("-------------------");
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
    }
}