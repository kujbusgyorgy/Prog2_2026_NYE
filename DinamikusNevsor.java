import java.util.ArrayList;
import java.util.List;

public class DinamikusNevsor {
    public static void main(String[] args) {
        List<String> nevsor = new ArrayList<>();

        nevsor.add("Anna");
        nevsor.add("Bence");
        nevsor.add("Csilla");
        nevsor.add("David");
        nevsor.add("Eszter");

        nevsor.remove(2); // a 3. név törlése

        System.out.println("A lista végső mérete: " + nevsor.size());
        System.out.println("A megmaradt nevek:");

        for (String nev : nevsor) {
            System.out.println(nev);
        }
    }
}