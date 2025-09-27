//es dado

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Numero faccie: ");
        int faccie = in.nextInt();

        Dado d = new Dado(faccie);

        System.out.println("Per lanciare premere l: ");
        String l = in.next();

        if(l.equals("l"))
            d.lancia(faccie);

        System.out.println(d);
    }
}