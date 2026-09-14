
public class Rectangle1 {

    int length;
    int breadth;

    Rectangle1(int l, int b) {
        length = l;
        breadth = b;
    }

    public void area() {
        System.out.println("Area of Rectangle : " + length * breadth);
    }

    public void perimeter() {
        System.out.println("Perimeter of Rectangle : "
                + (2 * (length + breadth)));
    }

    // MAIN METHOD
    public static void main(String[] args) {

        Rectangle1 r = new Rectangle1(10, 5);
        r.area();
        r.perimeter();

        Square1 s = new Square1(5);
        s.area();
        s.perimeter();
    }
}

class Square1 extends Rectangle1 {

    Square1(int side) {
        super(side, side);
    }

    @Override
    public void area() {
        System.out.println("Area of Square : " + length * breadth);
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter of Square : "
                + (2 * (length + breadth)));
    }
}
