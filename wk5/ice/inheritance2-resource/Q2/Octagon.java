public class Octagon {
    private double side;

    public Octagon(double side) {
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public double getArea() {
        return side*side * (2+2); // !!complete this
    }
}
