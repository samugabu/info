//array es 2

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] s = new int[10];
        int a, b, m;

        System.out.println("A: ");
        a = in.nextInt();
        System.out.println("B: ");
        b = in.nextInt();

        m = (a+b)/2;

        for (int i = 0; i < 10; i++) {
            s[i] = (int)(Math.random() * (b - a + 1) + a);
            System.out.print(s[i] + ", ");
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            if(s[i] > a && s[i] < (m + 1)){
                System.out.print(s[i] + ", ");
            }
        }
    }
}