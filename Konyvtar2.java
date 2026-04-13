import java.util.ArrayList;
import java.util.List;

public class Konyvtar2 {
    public static void main(String[] args) {
        List<Book> library = new ArrayList<>();

        library.add(new Book("Egri csillagok", "Gárdonyi Géza"));
        library.add(new Book("Pál utcai fiúk", "Molnár Ferenc"));
        library.add(new Book("Az arany ember", "Jókai Mór"));

        Book talalt = findBookByTitle(library, "Pál utcai fiúk");

        if (talalt != null) {
            System.out.println("Megtalált könyv:");
            System.out.println(talalt);
        } else {
            System.out.println("Nincs ilyen könyv a listában.");
        }
    }

    public static Book findBookByTitle(List<Book> library, String title) {
        for (Book book : library) {
            if (book.title.equals(title)) {
                return book;
            }
        }
        return null;
    }
}