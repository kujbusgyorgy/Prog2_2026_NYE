import java.util.Scanner;

public class Homerseklet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Add meg az aktuális hőmérsékletet: ");
        int hom = sc.nextInt();

        if (hom < 0) {
            System.out.println("Fagypont alatti");
        } else if (hom < 30) {
            System.out.println("Átlagos");
        } else {
            System.out.println("Túl meleg");
        }

        sc.close();
    }
}
