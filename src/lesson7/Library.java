package lesson7;

public class Library {
    String fullName;
    String numbTicket;
    String faculty;
    String birthDate;
    String numbTelephone;

    public Library(String fullName, String numbTicket, String faculty, String birthDate, String numbTelephone) {
        this.fullName = fullName;
        this.numbTicket = numbTicket;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.numbTelephone = numbTelephone;
    }

    void takeBook(int quantity) {
        System.out.println(this.fullName + " взял " + quantity + " книгу");
    }

    void takeBook(String... title) {
        for (String tit : title) {
            System.out.println(this.fullName + " взял " + tit);
        }
    }

    void takeBook(Book... object) {
        for (Book ob : object) {
            System.out.println(this.fullName + " взял " + ob.name + " " + ob.author);
        }
    }

    void returnBook(int quantity) {
        System.out.println(this.fullName + " вернул " + quantity + " книгу");
    }

    void returnBook(String... title) {
        for (String tit : title) {
            System.out.println(this.fullName + " вернул " + tit);
        }
    }

    void returnBook(Book... object) {
        for (Book ob : object) {
            System.out.println(this.fullName + " вернуд " + ob.name + " " + ob.author);
        }
    }

    public static void main(String[] args) {
        Library[] user = new Library[3];

        user[0] = new Library("Алладин", "123a", "b1", "4.04.2003", "6987757");
        user[1] = new Library("Сэм", "4231d", "b2", "07.20.2015", "23644");
        user[2] = new Library("Боб", "21124c", "b3", "7.13.2236", "785166");

        for (Library a : user) {
            System.out.println(a.fullName + " " + a.numbTicket + " " + a.faculty + " " + a.birthDate + " " + a.numbTelephone);
        }

        System.out.println();

        user[0].takeBook(4);
        user[1].takeBook("\"Привет\"", "\"Дорогой\"");

        Book book = new Book("Любимый", "\"Жак\"");
        user[2].takeBook(book);

        System.out.println();

        user[0].returnBook(5);
        user[1].returnBook("\"Почему\"", "\"нет?\"");
        user[2].returnBook(book);
    }
}