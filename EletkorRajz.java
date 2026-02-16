import java.util.Scanner;

public class EletkorRajz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int eletkor;
        do {
            System.out.print("Hány éves vagy? (1-20 között): ");
            eletkor = sc.nextInt();
        } while (eletkor < 1 || eletkor > 20);

        // Csillagok
        for (int i = 0; i < eletkor; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Függőleges vonalak
        for (int i = 0; i < eletkor; i++) {
            System.out.print("|");
        }
        System.out.println();

        // Vízszintes vonalak
        for (int i = 0; i < eletkor; i++) {
            System.out.print("-");
        }
        System.out.println();

        sc.close();
    }
}
