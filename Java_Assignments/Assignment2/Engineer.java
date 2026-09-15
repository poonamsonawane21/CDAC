
public class Engineer extends Employee {
	private float overtime;
	
	Engineer(String n, String a, int ag, String g, float salary, float ot) {
		super(n, a, ag, g, salary);
		overtime = ot;
	}
	
	public float getOvertime() {
	    return overtime;
	}
	public void setOvertime(float ot) {
	    overtime = ot;
	}
	
	@Override
	public void display() {
	    super.display();
	    System.out.println("Overtime: " + overtime);
	}
}
