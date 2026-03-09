class Kavefozo {

    private String marka;
    private double ar;
    private double mennyiseg;
    private double kapacitas;

    public Kavefozo(String marka, double ar, double kapacitas) {
        this.marka = marka;
        this.kapacitas = kapacitas;
        this.mennyiseg = kapacitas;
        setAr(ar);
    }

    public void setAr(double ar) {
        if (ar >= 0) {
            this.ar = ar;
        } else {
            System.out.println("Az ár nem lehet negatív!");
        }
    }

    public double getAr() {
        return ar;
    }

    public double getMennyiseg() {
        return mennyiseg;
    }

    public double vasarol(double dl) {
        if (dl > mennyiseg) {
            return -1;
        }
        mennyiseg -= dl;
        return dl * ar;
    }

    public double feltolt() {
        double betoltott = kapacitas - mennyiseg;
        mennyiseg = kapacitas;
        return betoltott;
    }

    public String toString() {
        return "Marka: " + marka +
               ", Ar: " + ar +
               ", Mennyiseg: " + mennyiseg +
               ", Kapacitas: " + kapacitas;
    }
}

public class BiztonsagosKavefozo {

    public static void main(String[] args) {

        Kavefozo kf = new Kavefozo("Omnia", 500, 1000);

        System.out.println(kf);

        double fizetendo = kf.vasarol(10);
        if (fizetendo == -1) {
            System.out.println("Nincs eleg kave a tartalyban!");
        } else {
            System.out.println("Fizetendo osszeg: " + fizetendo);
        }

        System.out.println("Maradek kave: " + kf.getMennyiseg());

        double feltoltott = kf.feltolt();
        System.out.println("Feltoltott mennyiseg: " + feltoltott);

        System.out.println(kf);
    }
}