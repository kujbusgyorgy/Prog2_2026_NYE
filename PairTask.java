class MyPair<K, V> {
    private K key;
    private V value;

    public MyPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

public class PairTask {
    public static void main(String[] args) {
        MyPair<Integer, String> student = new MyPair<>(12345, "Kiss János");

        System.out.println("Hallgató azonosítója: " + student.getKey());
        System.out.println("Hallgató neve: " + student.getValue());
    }
}