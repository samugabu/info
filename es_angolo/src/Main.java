//es 16 pag 40

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Angolo angolo = new Angolo();

        while (true) {
            System.out.println("\n=== MENU ANGOLO ===");
            System.out.println("1. Imposta angolo (gradi, primi, secondi)");
            System.out.println("2. Imposta angolo (decimale)");
            System.out.println("3. Mostra angolo");
            System.out.println("4. Mostra angolo in radianti");
            System.out.println("5. Somma con un altro angolo");
            System.out.println("6. Differenza con un altro angolo");
            System.out.println("0. Esci");
            System.out.print("Scelta: ");

            int scelta = input.nextInt();

            switch (scelta) {
                case 1:
                    System.out.print("Gradi: ");
                    int g = input.nextInt();
                    System.out.print("Primi: ");
                    int p = input.nextInt();
                    System.out.print("Secondi: ");
                    int s = input.nextInt();
                    angolo = new Angolo(g, p, s);
                    break;
                case 2:
                    System.out.print("Inserisci valore in decimale (0 <= x < 360): ");
                    double dec = input.nextDouble();
                    angolo = new Angolo(dec);
                    break;
                case 3:
                    System.out.println("Angolo: " + angolo);
                    break;
                case 4:
                    System.out.printf("Radianti: %.6f\n", angolo.getRadianti());
                    break;
                case 5:
                    System.out.println("Inserisci secondo angolo per la somma.");
                    System.out.print("Gradi: ");
                    g = input.nextInt();
                    System.out.print("Primi: ");
                    p = input.nextInt();
                    System.out.print("Secondi: ");
                    s = input.nextInt();
                    Angolo altro = new Angolo(g, p, s);
                    Angolo somma = angolo.somma(altro);
                    System.out.println("Risultato somma: " + somma);
                    break;
                case 6:
                    System.out.println("Inserisci secondo angolo per la differenza.");
                    System.out.print("Gradi: ");
                    g = input.nextInt();
                    System.out.print("Primi: ");
                    p = input.nextInt();
                    System.out.print("Secondi: ");
                    s = input.nextInt();
                    altro = new Angolo(g, p, s);
                    Angolo diff = angolo.differenza(altro);
                    System.out.println("Risultato differenza: " + diff);
                    break;
                case 0:
                    System.out.println("Uscita...");
                    input.close();
                    return;
                default:
                    System.out.println("Scelta non valida!");
            }
        }
    }
}
