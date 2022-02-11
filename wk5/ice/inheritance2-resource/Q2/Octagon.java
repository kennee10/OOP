import java.lang.Math;

public class Octagon implements Shape {
    private double side;

    public Octagon(double side) {
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public double getArea() {
        return Math.pow(side,2) * (2+2*Math.sqrt(2));
    }

    public double getPerimeter() {
        return side * 8;
    }

    public String toString() {
        return "return what string?";
    }

    public static void main(String[] args) {
        Octagon my_oct = new Octagon(12);
        System.out.println(my_oct.getArea());
        System.out.println(my_oct.getPerimeter());
    }
}
