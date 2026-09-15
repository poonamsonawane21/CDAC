
public class Manager extends Employee {
	private float hrf;
	
	
	//our employee currently has a parametrized constructor.therfore when we crete a manger ,we will need to call Employee constructor from manager constructor
	Manager(String n,String a,int ag,String g,float salary,float h){
		super(n,a,ag,g,salary); //suoer is used to call the parent class constructor
		hrf=h;
	}
	/*Why are we using super()?
	Because the common data belongs to the Employee class, and Employee already has a constructor to initialize that data.
	We don't want to write the same initialization code again in Manager.*/
	
	
	//getter ans setter for hrf
	public float getHrf() {
	    return hrf;
	}
	public void setHrf(float h) {
	    hrf = h;
	}
	
	//Employee class already has display() method but manager has one extra field-hrf
	//so manger needs its own display()method
	//this is called method overriding
	@Override
	public void display() {
		super.display();   //call the dispaly method from Employee class
		System.out.println("HRF : "+ hrf);
	}
 	
	
}

