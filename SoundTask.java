interface MySoundMaker {
    void makeSound();
}

class MyRadio implements MySoundMaker {
    @Override
    public void makeSound() {
        System.out.println("A rádió zenét játszik.");
    }
}

class MyDog implements MySoundMaker {
    @Override
    public void makeSound() {
        System.out.println("A kutya ugat.");
    }
}

public class SoundTask {

    public static void testSound(MySoundMaker sm) {
        sm.makeSound();
    }

    public static void main(String[] args) {
        MyRadio radio = new MyRadio();
        MyDog dog = new MyDog();

        testSound(radio);
        testSound(dog);
    }
}