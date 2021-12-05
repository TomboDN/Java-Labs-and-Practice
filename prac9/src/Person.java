public class Person {
    private final String fio;
    private final long inn;
    public Person(String fio, long inn) {
        this.fio = fio;
        this.inn = inn;
    }

    public String getFio() {
        return fio;
    }

    public long getInn() {
        return inn;
    }
}
