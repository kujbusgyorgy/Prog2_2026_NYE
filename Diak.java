public class Diak {
    String nev;
    double[] osztalyzatok;

    public Diak(String nev, double[] osztalyzatok) {
        this.nev = nev;
        this.osztalyzatok = osztalyzatok;
    }

    public double calculateAverage() {
        double osszeg = 0;

        for (int i = 0; i < osztalyzatok.length; i++) {
            osszeg = osztalyzatok[i]+osszeg;
        }

        return osszeg / osztalyzatok.length;
    }


    public static void main(String[] args) {
        double[] jegyek = {5, 4, 3, 5, 4, 2, 1, 1};

        Diak d = new Diak("Lakatos Ember", jegyek);

        System.out.println("Diák neve: " + d.nev);
        System.out.println("Átlag: " + d.calculateAverage());
    }
}