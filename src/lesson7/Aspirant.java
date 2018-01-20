package lesson7;

public class Aspirant extends Student {
    private String scienceWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scienceWork) {
        super(firstName, lastName, group, averageMark);
        this.scienceWork = scienceWork;
    }

    public String getScienceWork() {
        return scienceWork;
    }

    public void setScienceWork(String scienceWork) {
        this.scienceWork = scienceWork;
    }

    public double getScholarship() {
        if (getAverageMark() == 5) {
            return 200;
        }
        return 180;
    }

    public static void main(String[] args) {
        Student student = new Student("Вово", "Утин", "НА", 5);
        Aspirant aspirant1 = new Aspirant("Вова1", "Утин1", "НА1", 4, "работа а");
        Student aspirant2 = new Aspirant("Вова2", "Утин2", "НА2", 3, "работа а");
        Student[] students = {student, aspirant1, aspirant2};
        System.out.println(aspirant1.getFirstName());
        System.out.println(aspirant1.getLastName());
        System.out.println(aspirant1.getGroup());
        System.out.println(aspirant1.getAverageMark());
        System.out.println(aspirant1.getScienceWork());

        System.out.println(aspirant2.getFirstName());
        System.out.println(aspirant2.getLastName());
        System.out.println(aspirant2.getGroup());
        System.out.println(aspirant2.getAverageMark());
        for (Student student1 : students) {
            System.out.println(student1.getScholarship());
        }
    }
}

