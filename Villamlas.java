import java.util.Scanner;

public class Villamlas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double masodperc;
        do {
            System.out.print("Hány másodperc telt el a villámlás és a dörgés között? ");
            masodperc = sc.nextDouble();
        } while (masodperc < 0);

        double tavolsag = masodperc * 300;
        System.out.println("A villámlás távolsága: " + tavolsag + " méter");

        sc.close();
    }
}
