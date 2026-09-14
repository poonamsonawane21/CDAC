
public class Member {
	
	private String Name;
	private int Age;
	private int phone_no;
	private String Address;
	private int Salary;
	
	

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public int getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}
	public void printsalary() {
		//Salary=s;
		System.out.println("Salary is : "+Salary);
	}
	
	
	public static void main(String[] args) {
		System.out.println("Enter name : ");
		String name=ConsoleInput.getString();
		
		System.out.println("Enter age : ");
		int age=ConsoleInput.getInt();
		
		System.out.println("Enter phone no : ");
		int no=ConsoleInput.getInt();
		
		System.out.println("Enter Address : ");
		String add=ConsoleInput.getString();
		
		System.out.println("Enter Salary : ");
		int salary=ConsoleInput.getInt();
		
		
		PrimeMembers obj=new PrimeMembers();
		
		  // Use setters to put values into object
        obj.setName(name);
        obj.setAge(age);
        obj.setPhone_no(no);
        obj.setAddress(add);
        obj.setSalary(salary);
        
        // Input for PrimeMembers
        System.out.println("Enter Joining Year : ");
        int year = ConsoleInput.getInt();

        System.out.println("Enter Joining Fees : ");
        int fees = ConsoleInput.getInt();

        System.out.println("Is Active : TRue or false???");
        boolean active = ConsoleInput.getBoolean();


        obj.setJoiningYear(year);
        obj.setJoiningFees(fees);
        obj.setActive(active);


        // Display everything
        obj.display();
		
		
	}
	
}	

	class PrimeMembers extends Member{
		private int JoiningYear;
		private int JoiningFees;
		private boolean isActive;
		
		public int getJoiningYear() {
			return JoiningYear;
		}
		public void setJoiningYear(int joiningYear) {
			JoiningYear = joiningYear;
		}
		public int getJoiningFees() {
			return JoiningFees;
		}
		public void setJoiningFees(int joiningFees) {
			JoiningFees = joiningFees;
		}
		public boolean isActive() {
			return isActive;
		}
		public void setActive(boolean isActive) {
			this.isActive = isActive;
		}
		
		  public void display() {

		        // Parent class fields
		        System.out.println("Name : " + getName());
		        System.out.println("Age : " + getAge());
		        System.out.println("Phone No : " + getPhone_no());
		        System.out.println("Address : " + getAddress());
		        System.out.println("Salary : " + getSalary());

		        // Child class fields
		        System.out.println("Joining Year : " + JoiningYear);
		        System.out.println("Joining Fees : " + JoiningFees);
		        System.out.println("Active : " + isActive);
		    }
	}


	
	
	

	








