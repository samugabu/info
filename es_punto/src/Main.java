//es 8 pag 32

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("punto 1:");
        double x = in.nextDouble();

        System.out.println("punto 2:");
        double y = in.nextDouble();

        Punto p = new Punto(x, y);

        System.out.println("Punto o Segmento (1 o 2): ");
        int dec = in.nextInt();

        if(dec == 1){
            while (true){
                System.out.println("Classe punto");
                System.out.println("0, esci");
                System.out.println("1, distanza");
                System.out.println("2, punto medio");
                System.out.println("3, ruota");
                System.out.println("4, tostring");
                int scelta = in.nextInt();

                switch (scelta){
                    case 0:
                        break;

                    case 1:
                        System.out.println("x: ");
                        double x1 = in.nextDouble();
                        System.out.println("y: ");
                        double y1 = in.nextDouble();

                        Punto p1 = new Punto(x1, y1);
                        System.out.println(p.distanza(p1));

                    case 2:
                        System.out.println("x: ");
                        double x2 = in.nextDouble();
                        System.out.println("y: ");
                        double y2 = in.nextDouble();

                        Punto p2 = new Punto(x2, y2);
                        System.out.println(p.puntomedio(p2));

                    case 3:
                        System.out.println("Non disponibile");
                        break;

                    case 4:
                        p.toString();
                }
            }
        }

        if(dec == 2) {

        }
    }
}