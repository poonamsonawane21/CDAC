
public class Employee {
	
	//because we want encapsulation the fiels are private
	private String name;
	private String address;
	private int age;
	private String gender;
	private float basicSalary;
	
	//we need constructor to initialize this value
	Employee(String n,String a,int ag,String g,float salary){
		name=n;
		address=a;
		age=ag;
		gender=g;
		basicSalary=salary;
	}
	//getters-used to read the value  and setters- used to set or change the value
	//the fields are private,so other classes cannot diresctly access them
	//why we are using this->bcoz of encapsulaton-keeping data protected and accessng it through methods	
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name=n;
	}
	
	public String getAddress() {
	    return address;
	}
	public void setAddress(String a) {
	    address = a;
	}
	
	public int getAge() {
	    return age;
	}
	public void setAge(int ag) {
	    age = ag;
	}
	
	public String getGender() {
	    return gender;
	}
	public void setGender(String g) {
	    gender = g;
	}
	
	public float getBasicSalary() {
	    return basicSalary;
	}
	public void setBasicSalary(float salary) {
	    basicSalary = salary;
	}
		
	//Display - instead of writing print functon for every field,we create onoe dispaly function in emplyee
	//later manager,engineer,salesperson will inherit this display method.
	//we can override display() in each child class 
	public void display() {
		System.out.println("Name : "+name);
		System.out.println("Address: " + address);
		System.out.println("Age: " + age);
		System.out.println("Gender: " + gender);
	    System.out.println("Basic Salary: " + basicSalary);
	}
	


}
