public class szamologep {

    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Használat: java szamologep <művelet> <szám1> <szám2>");
            return;
        }

        String muvelet = args[0].toLowerCase();
        double a = Double.parseDouble(args[1]);
        double b = Double.parseDouble(args[2]);
        double eredmeny;

        switch (muvelet) {
            case "osszeadas":
                eredmeny = a + b;
                break;

            case "kivonas":
                eredmeny = a - b;
                break;

            case "szorzas":
                eredmeny = a * b;
                break;

            case "osztas":
                if (b == 0) {
                    System.out.println("0-val nem lehet osztani!");
                    return;
                }
                eredmeny = a / b;
                break;

            default:
                System.out.println("Ismeretlen művelet!");
                return;
        }

        System.out.println("Eredmény: " + eredmeny);
    }
}