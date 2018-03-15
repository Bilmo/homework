package lesson7;

import java.util.Arrays;

public class Reader {
    private String fullName;
    private String libraryCardNumber;
    private String faculty;
    private String dateOfBirth;
    private String phoneNumber;

    public Reader(String fullName, String libraryCardNumber, String faculty, String dateOfBirth, String phoneNumber) {
        this.fullName = fullName;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public Reader() {

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLibraryCardNumber() {
        return libraryCardNumber;
    }

    public void setLibraryCardNumber(String libraryCardNumber) {
        this.libraryCardNumber = libraryCardNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Reader reaser = (Reader) o;

        if (fullName != null ? !fullName.equals(reaser.fullName) : reaser.fullName != null) return false;
        if (libraryCardNumber != null ? !libraryCardNumber.equals(reaser.libraryCardNumber) : reaser.libraryCardNumber != null)
            return false;
        if (faculty != null ? !faculty.equals(reaser.faculty) : reaser.faculty != null) return false;
        if (dateOfBirth != null ? !dateOfBirth.equals(reaser.dateOfBirth) : reaser.dateOfBirth != null) return false;
        return phoneNumber != null ? phoneNumber.equals(reaser.phoneNumber) : reaser.phoneNumber == null;
    }

    @Override
    public int hashCode() {
        int result = fullName != null ? fullName.hashCode() : 0;
        result = 31 * result + (libraryCardNumber != null ? libraryCardNumber.hashCode() : 0);
        result = 31 * result + (faculty != null ? faculty.hashCode() : 0);
        result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "fullName='" + fullName + '\'' +
                ", libraryCardNumber='" + libraryCardNumber + '\'' +
                ", faculty='" + faculty + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public void readerLibraryCardPrint() {
        String libraryCardInfo = "ФИО: " + fullName + "\nНомер читательского билета: "
                + libraryCardNumber + "\nФакультет: "
                + faculty + "\nДень рождения: " + dateOfBirth +
                "\nНомер телефона: " + phoneNumber + "\n ";
        System.out.println(libraryCardInfo);
    }

    public String readerLibraryCardOut() {
        String libraryCardInfo = "ФИО : " + fullName + "\nНомер читательского билета: "
                + libraryCardNumber + "\nФакультет: "
                + faculty + "\nДень рождения:" + dateOfBirth +
                "\nНомер телефона: " + phoneNumber + "\n ";
        return libraryCardInfo;
    }

    public static void arrayReaderLibraryCard(String... readerCard) {
        String[] cardArray = new String[readerCard.length];
        for (int i = 0; i < readerCard.length; i++) {
            cardArray[i] = readerCard[i];
        }
        System.out.println(Arrays.toString(cardArray));
    }
}