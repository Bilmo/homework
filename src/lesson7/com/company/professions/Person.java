package lesson7.com.company.professions;

class Person {
    String fullName;

    public Person() {

    }

    public Person(String fullInfo) {
        this.fullName = fullInfo;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}