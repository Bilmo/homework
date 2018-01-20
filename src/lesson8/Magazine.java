package lesson8;

public class Magazine implements Printable {
    private String name = "Dom";

    public Magazine(String name) {
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
        System.out.println("Штампую " + name);

    }
}