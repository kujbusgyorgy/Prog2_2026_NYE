public class Auto {
    String marka;
    String model;
    int evjarat;

    public Auto(String marka, String model, int evjarat){

        this.marka=marka;
        this.model=model;
        this.evjarat=evjarat;
    }
    

    public void displayInfo(){

        System.out.println("Márka: " +marka);
        System.out.println("Modell: "+model);
        System.out.println("Evjarat: "+evjarat);
    }

    public void startEngine(){
        System.out.println("Az auto indul");
    }

    public void stopEngine()
    {
        System.out.println("Az auto megall.");
    }



    public static void main(String[] args) {
    Auto a = new Auto("Skoda", "Fabia", 2005);

    a.displayInfo();
    a.startEngine();
    a.stopEngine();
}


}
