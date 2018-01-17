package lesson8;

public class Circle extends Shape {
    private int x, y;

    public Circle(String color, int x, int y) {
        super(color);
        this.x = x;
        this.y = y;
    }

    public Circle(int x, int y) {
        super("red");
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Рисуем круг +" + getColor());
    }

    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle("yellow", 3, 4);
        shapes[1] = new Circle("red", 4, 4);
        for (Shape shape : shapes) {
            shape.draw();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Circle circle = (Circle) o;

        if (x != circle.x) return false;
        return y == circle.y;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + x;
        result = 31 * result + y;
        return result;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                "} " + super.toString();
    }
}
