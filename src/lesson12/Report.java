package lesson12;

public class Report {
    public static void main(String[] args) {
        Employee builder = new Employee("Мистер один", 569.65);
        Employee policeman = new Employee("Мистер два", 659.56);
        Employee[] employees = {builder, policeman};

        generateReport(employees);
    }

    public static void generateReport(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.printf("%S получает %2$.2f и премию %2$.2f%n",
                    employee.getFullName(), employee.getSalary());
        }
    }
}