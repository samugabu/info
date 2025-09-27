//es classi/struct

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("La potenza: ");
        int pot = in.nextInt();

        LampadinaIntelligente lamp = new LampadinaIntelligente(pot);
        System.out.println("Nome lamp: ");
        String n = in.next();

        lamp.setNome(n);

        System.out.println("Colore lamp: ");
        String c = in.next();

        lamp.setColore(c);

        System.out.println("Decidi se la lampadina è accesa o spenta (on/off): ");
        String state = in.next();

        if(state.equals("on"))
            lamp.stato = true;
        else
            lamp.stato = false;

        System.out.println(lamp);
    }
}
