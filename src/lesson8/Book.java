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

    public static void printBook(Printable[] printable) {
        for (Printable printable1 : printable){
            if (printable1  instanceof  Book);
            Book book1 = (Book) printable1;
            book1.print();
        }
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
        printBook(massive);
        Magazine.printMagazine(massive);
    }
}