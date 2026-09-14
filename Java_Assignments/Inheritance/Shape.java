
public class Shape {
	
	public void show() {
		System.out.println("this is shape");
	}
	
	public static void main(String[] args) {
		Square2 obj=new Square2();
		obj.show();
		obj.showw();
		obj.showww();

	}

}

class Rectangle2 extends Shape{
	public void showw() {
		System.out.println("this is rectangular shape");
	}
}


class Circle extends Shape{
	public void showww() {
		System.out.println("this is circular shape");
	}
}

class Square2 extends Rectangle2{
	public void showww() {
		System.out.println("Square is rectangular");
	}
}



