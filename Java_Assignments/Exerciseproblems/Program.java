
public class Program {

	public static void main(String[] args) {
		
		//Assigning values using objects -> create the objects first then assign
//		Student obj=new Student();
//		obj.roll_no=2;
//		obj.name="John";
//		obj.phone_no="234561769";
//		obj.address="Mumbai";
//		System.out.println("Name:"+ obj.name + "| Roll no: "+ obj.roll_no + "| Phone no: "+ obj.phone_no + "|Address: " + obj.address );
//		
//		
//		Student obj1=new Student();
//		obj1.roll_no=2;
//		obj1.name="John";
//		obj1.phone_no="234561769";
//		obj1.address="Mumbai";
//		System.out.println("Name:"+ obj1.name + "| Roll no: "+ obj1.roll_no + "| Phone no: "+ obj1.phone_no + "|Address: " + obj1.address );
//		
		
		
		//Using constructor
//		Student s1=new Student(3,"Sam","36879829","Mumbai");
//		System.out.println("Name:"+ s1.name + "| Roll no: "+ s1.roll_no + "| Phone no: "+ s1.phone_no + "|Address: " + s1.address );
//	
		//using method
		Student obj=new Student();
		obj.setdata(2, "john", "36847935", "pune");
		System.out.println("Name:"+ obj.name + "| Roll no: "+ obj.roll_no + "| Phone no: "+ obj.phone_no + "|Address: " + obj.address );
	
		
		
		//AreaOfTriangle
		Triangle t1=new Triangle(3,4,5);
		System.out.println("Area is Triangle : " + 0.5*(t1.side1*t1.side2));
		
		//Perimeter Of Triangle
//		Triangle t2=new Triangle(3,4,5);
		System.out.println("Perimeter of Triangle : " + (t1.side1+t1.side2+t1.side3));
	
		
		
//		//Area of rectangle
//		Rectangle r1=new Rectangle(4,5);
//		System.out.println("Area of Rectangle 1: " + r1.area());
//		
//		
//        Rectangle r2 = new Rectangle(5, 8);
//        System.out.println("Area of Rectangle 2: " + r2.area());
//		
		
		
		//operations on Two numbers
//		System.out.println("Enetr the first Number");
//		int num1=ConsoleInput.getInt();
//		
//		System.out.println("Enetr the second Number");
//		int num2=ConsoleInput.getInt();
//		
//		TwoNumbers c1=new TwoNumbers(num1,num2);
//		
//		int resultsum=c1.sumofTwo();
//		int resultdiff=c1.subofTwo();
//		int resultprod=c1.product();
//		
//		System.out.println("sum is : " +resultsum);
//		System.out.println("difference is "+ resultdiff);
//		System.out.println("product is : " + resultprod);
		
		
		
		//complex number
//		System.out.println("Enter real part of first number");
//		int r1 = ConsoleInput.getInt();
//		
//		System.out.println("Enter imaginary part of first number");
//		int i1 = ConsoleInput.getInt();
//		
//		System.out.println("Enter real part of second number");
//		int r2 = ConsoleInput.getInt();
//		
//		System.out.println("Enter imaginary part of second number");
//		int i2 = ConsoleInput.getInt();
//		
//		// Creating first complex number
//		Complex c1 = new Complex(r1, i1); 
//		
//		// Creating second complex number
//		Complex c2 = new Complex(r2, i2);
//		
//		// Addition
//		Complex resultSum = c1.sum(c2); 
//		// Difference
//		Complex resultDiff = c1.difference(c2);
//		// Product 
//		Complex resultProduct = c1.product(c2);
//	
//		// Displaying results
//		System.out.println("Sum = " + resultSum.real + " + " + resultSum.imaginary + "i");
//		System.out.println("Difference = " + resultDiff.real + " + " + resultDiff.imaginary + "i");
//		System.out.println("Product = " + resultProduct.real + " + " + resultProduct.imaginary + "i");
//		
		
		//Creating three Employee objects
		Employee e1=new Employee("Robert", 1994, 50000, "64C- WallsStreat");
		Employee e2=new Employee("Sam", 2000, 60000, "68D- WallsStreat");
		Employee e3=new Employee("John", 1999, 55000, "26B- WallsStreat");
		
		System.out.println("Name\tYear of joining\tAddress");
		System.out.println(e1.name + "\t" + e1.yearOfJoining + "\t\t" + e1.address);
		System.out.println(e2.name + "\t" + e2.yearOfJoining + "\t\t" + e2.address);
		System.out.println(e3.name + "\t" + e3.yearOfJoining + "\t\t" + e3.address);
		
		
		
		//salary 
		Emp ee1=new Emp();
		ee1.getInfo(2300, 8);
		System.out.println("salary is : " + ee1.salary +" | workhour is : " + ee1.workhour);
		ee1.addsal();
		ee1.addwork();
		System.out.println("Final salary = $" + ee1.salary);
		
	}

	
}
