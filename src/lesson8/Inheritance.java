package lesson8;

class Student {
    private String firstName;
    private String lstName;
    private String group;
    private double averageMark;

    public Student(String firstName, String lstName, String group, double averageMark) {
        this.firstName = firstName;
        this.lstName = lstName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLstName() {
        return lstName;
    }

    public void setLstName(String lstName) {
        this.lstName = lstName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public int getScholarship() {
        return averageMark >= 5 ? 100 : 80;
    }
}

class Aspirant extends Student {
    private String scientificWork;

    public Aspirant(String firstName, String lstName, String group, double averageMark, String scientificWork) {
        super(firstName, lstName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    public String getScientificWork() {
        return scientificWork;
    }

    public void setScientificWork(String scientificWork) {
        this.scientificWork = scientificWork;
    }

    public int getScholarship() {
        return getAverageMark() >= 5 ? 200 : 180;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Student egor = new Aspirant("Петро", "Петров", "11-Ю", 15,
                "Теория чего-то");
        Student[] stdntArr = {egor, new Aspirant("Вася", "Мировой", "78-й",
                17,
                "Теория мира")};
        for (Student s : stdntArr) {
            s.getScholarship();
        }
    }
}