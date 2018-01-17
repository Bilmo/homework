package lesson8;

public class Rectangle extends Shape {
    private int x, y;

    public Rectangle(String color, int x, int y) {
        super(color);
        this.x = x;
        this.y = y;
    }

    public Rectangle(int x, int y) {
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
        shapes[1] = new Rectangle("red", 4, 4);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Rectangle rectangle = (Rectangle) o;

        if (x != rectangle.x) return false;
        return y == rectangle.y;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + x;
        result = 31 * result + y;
        return result;
    }
}
