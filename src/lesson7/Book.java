package lesson7;

public class Book {
    private String theTitleOfABook;
    private static int amount = 0;

    public Book(String theTitleOfABook) {
        this.theTitleOfABook = theTitleOfABook;
        amount++;
    }

    public String getTheTitleOfABook() {
        return theTitleOfABook;
    }

    public void setTheTitleOfABook(String theTitleOfABook) {
        this.theTitleOfABook = theTitleOfABook;
    }

    static int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (amount != book.amount) return false;
        return theTitleOfABook != null ? theTitleOfABook.equals(book.theTitleOfABook) : book.theTitleOfABook == null;
    }

    @Override
    public int hashCode() {
        int result = theTitleOfABook != null ? theTitleOfABook.hashCode() : 0;
        result = 31 * result + amount;
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "theTitleOfABook='" + theTitleOfABook + '\'' +
                ", amount=" + amount +
                '}';
    }
}