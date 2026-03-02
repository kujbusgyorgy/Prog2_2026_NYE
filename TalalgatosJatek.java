import java.util.Random;
import java.util.Scanner;

public class TalalgatosJatek {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int gepSzama = random.nextInt(100) + 1; // 1-100
        int tipp = 0;

        System.out.println("Gondoltam egy számra 1 és 100 között.");

        while (tipp != gepSzama) {

            System.out.print("Tippelj: ");
            tipp = scanner.nextInt();

            if (tipp < gepSzama) {
                System.out.println("Nagyobb!");
            } else if (tipp > gepSzama) {
                System.out.println("Kisebb!");
            } else {
                System.out.println("Gratulálok! Eltaláltad! ");
            }
        }

        scanner.close();
    }
}