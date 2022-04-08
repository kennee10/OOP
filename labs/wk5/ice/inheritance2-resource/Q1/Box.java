public class Box {
    
    private int length;
    private int breadth;
    private int height;

    public Box(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Box clone() {
        Box b = new Box(length, breadth, height);
        return b;
    }

    public boolean equals(Object another) {
        if (!(another instanceof Box)) {
            return false;
        }

        Box b = (Box)another;
        if ((length == b.length) &&
            (breadth == b.breadth) &&
            (height == b.height)) {
                return true;
            } else {
                return false;
            }
    }

    public String toString() {
        String s = "height: " + height + ", breadth: " + breadth +", length: " + length;
        return s;
    }
}
