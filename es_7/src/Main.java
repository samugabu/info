import java.util.Scanner;

//es 7, 8, 9
public class Main {
    public static void main(String[] args) {
        //es7
        Scanner in = new Scanner(System.in);

        System.out.println("Numero float: ");
        float num = in.nextFloat();

        int m = 1000000000;

        num /= m;

        System.out.println("Numero diviso per un miliardo: " + num);

        //es8
        System.out.println("Inseirsci un numero float: ");
        double n = in.nextDouble();

        double mi = 1e12;

        n /= mi;

        System.out.println("NUnero diviso per 1000 miliardi: " + n);

        //es9
        System.out.println("Numero float: ");
        float n1 = in.nextFloat();

        System.out.println("Numero int: ");
        int n2 = in.nextInt();

        System.out.println("Prodotto: " + n1 * n2);
    }
}