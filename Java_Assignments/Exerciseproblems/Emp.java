
public class Emp {
	int salary;
	int workhour;
	
	void getInfo(int s,int h) {
		salary=s;
		workhour=h;
	}
	void addsal() {
		if(salary<500) 
			 salary=salary+10;
	}	
	void addwork() {
		if(workhour>6) 
			salary=salary+5;
		
	}
		
	
}
