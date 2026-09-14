
public class Parent {
	public static void main(String[] args) {
		Parent obj=new Parent();
		obj.method();
		
		subclass obj1=new subclass();
		obj1.method1();
		
		obj1.method();
		

	}
	public void method() {
		System.out.println("This is parent class");
	}
	
	
	


	
	

}
