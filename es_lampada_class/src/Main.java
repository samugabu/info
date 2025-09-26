//es sulle classi/struct

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        LampadinaIntelligente lamp = new LampadinaIntelligente(20);
        System.out.println(lamp);

        System.out.println("Nome lamp: ");
        String n = in.next();

        lamp.setNome(n);

        System.out.println("Colore lamp: ");
        String c = in.next();

        lamp.setColore(c);
    }
}