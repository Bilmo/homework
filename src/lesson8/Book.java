package lesson8;

public class Book implements Printable {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Печатаю " + name);

    }

    public static void main(String[] args) {
        Printable[] massive = new Printable[2];
        massive[0] = new Book("Dom");
        massive[1] = new Magazine("Mood");
        for (Printable printable : massive) {
            printable.print();
        }
    }
}