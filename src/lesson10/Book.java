package lesson10;

public class Book implements Printable {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void printBooks(Printable[] printable) {
        for (Printable printable1 : printable) {
            if (printable1 instanceof Book) {
                printable1 .print();
            }
        }
    }

    @Override
    public void print() {
        System.out.println("Печатаю " + name);
    }

    public static void main(String[] args) {
        Printable[] massive = new Printable[2];
        massive[0] = new Book("Booky");
        massive[1] = new Magazine("Maggy");
        for (Printable printable : massive) {
            printable.print();
        }
        printBooks(massive);
        Magazine.printMagazines(massive);
    }
}