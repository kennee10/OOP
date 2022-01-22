public class ShirtTest {

    private String brand;
    private double price;
    private char color;

    public void Shirt(char colour, double price) {
        this.color = color;
        this.price = price;
        this.brand = "waterBrand";
    }

    public void Shirt(char colour, double price, String brand) {
        this.color = color;
        this.price = price;
        this.brand = brand;
    }

    public char getColour() {
        return this.color;
    }

    public void setColour(char color) {
        this.color = color;
    }

    public boolean isSameBrand(Shirt anotherShirt) {
        if (this.getColour() == anotherShirt.getColour()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Shirt shirt1 = new Shirt('R', 85.50, "SMUgger");
        Shirt shirt2 = new Shirt('B', 90.40, "SMUgger");
        Shirt shirt3 = new Shirt('G', 77.60);

        System.out.println("s1 same brand as s2:" + shirt1.isSameBrand(shirt2));
        System.out.println("s2 same brand as s3:" + shirt2.isSameBrand(shirt3));

        shirt2.setColour('R');
        System.out.println(shirt1);
        System.out.println(shirt2);
        System.out.println(shirt3);
    }
}
