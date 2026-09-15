
public class SalesPerson extends Employee{
	private float commission;
	
	SalesPerson(String n, String a, int ag, String g, float salary, float c) {
        super(n, a, ag, g, salary);
        commission = c;
    }
	
	public float getCommission() {
	    return commission;
	}
	public void setCommission(float c) {
	    commission = c;
	}
	
	@Override
	public void display() {
	    super.display();
	    System.out.println("Commission: " + commission);
	}
}
