package lesson7;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Reader readerCard1 = new Reader("James Bond", "007", "\tspecial agent",
                "07.07.1983", "666999666");
        Reader readerCard2 = new Reader("Lucky Hero", "963", "HeroAcademy",
                "09.03.1639", "999666999");
        Book book1 = new Book("The Dark Tower");
        Book book2 = new Book("1922");
        Book book3 = new Book("Some book");
        Reader readerCard3 = fillInReaderCard();
        Reader.arrayReaderLibraryCard(readerCard1.readerLibraryCardOut(), readerCard2.readerLibraryCardOut(),
                readerCard3.readerLibraryCardOut());
        takeBook(Book.getAmount());
        takeBook(book1, book2, book3);
        takeBook(book1.getTheTitleOfABook(), book2.getTheTitleOfABook(), book3.getTheTitleOfABook());
        returnBook(Book.getAmount());
        returnBook(book1, book2, book3);
        returnBook(book1.getTheTitleOfABook(), book2.getTheTitleOfABook(), book3.getTheTitleOfABook());
    }

    public static Reader fillInReaderCard() {
        Scanner getInfo = new Scanner(System.in);
        System.out.println("Как вас величают?:");
        String fullName = getInfo.nextLine();
        String ticketNumber = "666";
        System.out.println("Введите ваш факультет:");
        String speciality = getInfo.nextLine();
        System.out.println("Введите дату рождения (число.месяц.год):");
        String birthDate = getInfo.nextLine();
        System.out.println("Введите ваш номер телефона:");
        String phoneNumber = getInfo.nextLine();
        Reader readerCard3 = new Reader(fullName, ticketNumber, speciality, birthDate, phoneNumber);
        return readerCard3;
    }

    public static void takeBook(int amount) {
        System.out.println("Было взято " + amount + " книг");
    }

    public static void takeBook(String... names) {
        System.out.println("Было взято " + names.length + " книг");
    }

    public static void takeBook(Book... books) {
        System.out.println("Было взято " + books.length + " книг");
    }

    public static void returnBook(int amount) {
        System.out.println("Было возвращено " + amount + " книг");
    }

    public static void returnBook(String... names) {
        System.out.println("Было возвращено " + names.length + " книг");
    }

    public static void returnBook(Book... books) {
        System.out.println("Было возвращено " + books.length + " книг");
    }
}