import java.util.ArrayList;
import java.util.List;

public class Szamszuro {
    public static void main(String[] args) {
        List<Integer> szamok = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            szamok.add(i);
        }

        for (int i = 0; i < szamok.size(); i++) {
            if (szamok.get(i) % 2 == 0) {
                szamok.remove(i);
                i--; // hogy ne ugorjon át elemet
            }
        }

        System.out.println("A listában maradt számok:");
        for (int szam : szamok) {
            System.out.println(szam);
        }
    }
}