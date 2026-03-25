interface Message {
    void showMessage();
}

public class Uzenet {

    public static void greet() {
        Message msg = new Message() {
            @Override
            public void showMessage() {
                System.out.println("Hello from the inner world!");
            }
        };

        msg.showMessage();
    }

    public static void main(String[] args) {
        greet();
    }
}