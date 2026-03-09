class CoffeeMachine {

    private double price;

    public void setPrice(double price) {

        if (price < 0) {
            System.out.println("Az ár nem lehet negatív!");
        } else {
            this.price = price;
        }
    }

    public double getPrice() {
        return price;
    }
}

public class BiztonsagosKavefozo {

    public static void main(String[] args) {

        CoffeeMachine cm = new CoffeeMachine();

        cm.setPrice(150);
        System.out.println("A kávéfőző ára: " + cm.getPrice());

        //cm.setPrice(-50); // hibás érték tesztelése
    }
}