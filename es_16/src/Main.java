import java.util.Scanner;

//es16
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Quanti numeri n vuoi inserire: ");
        int n = in.nextInt();
        
        int conta = 0;

        System.out.println("A float: ");
        float a = in.nextFloat();
        System.out.println("B float: ");
        float b = in.nextFloat();

        for (int i = 0; i < n; i++) {
            System.out.println("Numeri float: ");
            float f = in.nextFloat();
            
            if(f > a && f < b){
                conta++;
            }
        }

        System.out.println("I numeri compresi tra a e b sono: " + conta);
    }
}