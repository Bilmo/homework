package lesson11;

public class DoublDemo {
    public static void main(String[] args) {
        Double double1 = 25.5;
        Double double2 = 45.4;
        Double double3 = 65.5;
        Double double4 = Double.valueOf("666");
        Double double5 = Double.parseDouble("565.6");
        String double6 = Double.toString(656.6);

        System.out.println(double1);
        System.out.println(double2);
        System.out.println(double3);
        System.out.println(double4);
        System.out.println(double5);
        System.out.println(double6);

        System.out.println(double1.byteValue());
        System.out.println(double1.shortValue());
        System.out.println(double1.intValue());
        System.out.println(double1.longValue());
        System.out.println(double1.floatValue());
        System.out.println(double1.doubleValue());
    }
}
