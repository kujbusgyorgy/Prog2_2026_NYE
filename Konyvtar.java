class Library {
    private String[] bookTitles;

    public Library(String[] bookTitles) {
        this.bookTitles = bookTitles;
    }

    class BookIterator {
        private int index = 0;

        public boolean hasNext() {
            return index < bookTitles.length;
        }

        public String nextTitle() {
            if (hasNext()) {
                return bookTitles[index++];
            } else {
                return null;
            }
        }
    }

    public BookIterator getIterator() {
        return new BookIterator();
    }
}

public class Konyvtar {
    public static void main(String[] args) {
        String[] books = {"Egri csillagok", "A Pál utcai fiúk", "Toldi"};
        Library library = new Library(books);

        Library.BookIterator iterator = library.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.nextTitle());
        }
    }
}