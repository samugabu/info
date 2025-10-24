//array

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        int[] a;
//        a = new int[3];
//
//        a[1] = 7;

        int[] a, pari, dispari;
        a = new int[10];
        pari = new int[10];
        dispari = new int[10];

        System.out.println("Quanti valori voui inserire (max 10): ");
        int N = in.nextInt();
        int i_pari = 0, i_disapri = 0;
        for (int i = 0; i < N; i++) {
            System.out.println("Valore: ");
            a[i] = in.nextInt();

            if(a[i] % 2 == 0){
                pari[i_pari] = a[i];
                i_pari++;
            }

            if(a[i] % 2 != 0){
                dispari[i_disapri] = a[i];
                i_disapri++;
            }

        }

        for (int i = 0; i < i_pari; i++) {
            System.out.print(pari[i] + ", ");
        }
        System.out.println();

        for (int i = 0; i < i_disapri; i++) {
            System.out.print(dispari[i] + ", ");
        }
        System.out.println();

        for (int i = 0; i < N; i++) {
            System.out.print(a[i] + ", ");
        }
    }
}