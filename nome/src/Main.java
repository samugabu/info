//nome cognome e tipo di email

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Inserisci il nome: ");
        String nome = in.next();
        System.out.println("Inserisci il cognome: ");
        String cognome = in.next();

        System.out.println("Inserisci il provaider: ");
        String f = in.next();

        System.out.println("Inserisci il nome: ");
        String nome1 = in.next();
        System.out.println("Inserisci il cognome: ");
        String cognome1 = in.next();

        System.out.println("Inserisci il provider: ");
        String f1 = in.next();

        String mail = nome + cognome + f;
        String mail1 = nome1 + cognome1 + f1;

        System.out.println(mail);
        System.out.println(mail1);

        if(mail.equals(mail1)){
            System.out.println("Le mail sono uguali");
        } else {
            System.out.println("Le mail sono diverse");
        }
    }
}