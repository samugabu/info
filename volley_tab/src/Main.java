import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Nome squadra in casa: ");
        String casa = in.nextLine();

        System.out.print("Nome squadra ospite: ");
        String ospite = in.nextLine();

        System.out.print("Chi inizia a battere? (1 = casa, 2 = ospiti): ");
        int servizio = in.nextInt();

        Tabellone partita = new Tabellone(casa, ospite, servizio);

        while (!partita.partitaFinita()) {
            System.out.println("\n" + partita);
            System.out.println("1. Punto casa");
            System.out.println("2. Punto ospiti");
            System.out.println("3. Esci");
            System.out.print("Scelta: ");

            int scelta = in.nextInt();

            switch (scelta) {
                case 1:
                    partita.puntoCasa();
                case 2:
                    partita.puntoOspiti();
                case 3:
                    System.out.println("Partita interrotta.");
            }
        }

        System.out.println("\nPartita conclusa!");
        System.out.println(partita);
    }
}
