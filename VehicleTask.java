abstract class MyVehicle {
    abstract void move();
}

class MyCar extends MyVehicle {
    @Override
    void move() {
        System.out.println("Az autó négy keréken gurul.");
    }
}

class MyBicycle extends MyVehicle {
    @Override
    void move() {
        System.out.println("A bicikli két keréken gurul.");
    }
}

public class VehicleTask {
    public static void main(String[] args) {
        MyVehicle[] vehicles = { new MyCar(), new MyBicycle() };

        for (MyVehicle v : vehicles) {
            v.move();
        }
    }
}