public class WebClient {
    static class Config {
        static int timeout = 5000;
        static String url = "https://example.com";
    }

    public void connect() {
        System.out.println("Connecting to: " + Config.url);
        System.out.println("Timeout: " + Config.timeout + " ms");
    }

    public static void main(String[] args) {
        WebClient client = new WebClient();
        client.connect();
    }
}