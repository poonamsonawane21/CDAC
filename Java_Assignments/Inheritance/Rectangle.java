//using super
public class Rectangle {
	
	int length;
	int breadth;
	
	Rectangle(int l,int b){
		length=l;
		breadth=b;
	}
	
	public void area() {
		System.out.println("Area of rectangle : " +length*breadth);
	}
	
	public void perimeter() {
		System.out.println("Perimeter of Rectangle :" + (2*(length+breadth)));
	}
	
	
	public static void main(String[] args) {
		 // Rectangle object
        Rectangle r = new Rectangle(10, 5);

        r.area();
        r.perimeter();


        // Square object
        Square s = new Square(5);

        s.area();
        s.perimeter();
	}

	}
	
	 class Square extends Rectangle{
		Square(int side){
			super(side,side);//calling rectangle constructor
		}
	

}
