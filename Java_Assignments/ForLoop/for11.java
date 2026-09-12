
public class for11 {

	public static void main(String[] args) {
		System.out.println("odd numbers from 1 to 1000");

		for(int temp1=0;temp1<=1000;temp1++) {

			if(temp1%2!=0) {
				System.out.println(temp1);
			}
		}
		for11 obj=new for11();
		obj.for12();
		obj.for13();
		obj.for14();
		obj.for15();
		obj.for16();
		obj.for17();
		obj.for18();

	}
	public void for12() {
		System.out.println("even numbers from 1 to 500");

		for(int temp1=0;temp1<=500;temp1++) {
			if(temp1%2==0) {
				System.out.println(temp1);
			}
		}
		
	}
	
	public void for13() {
		System.out.println("Every 7th number");

		for(int temp1=1;temp1<=200;temp1=temp1+7) {
			System.out.println(temp1);
			
		}
		
	}
	
	public void for14() {
		System.out.println("-------Pattern-1---------");
		for(int row=1;row<5;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void for15() {
		System.out.println("-------Pattern-2---------");
		for(int row=5;row>=1;row--) {
			for(int col=1;col<=row;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void for16() {
		System.out.println("-------Pattern-3---------");
		int num=1;
		for(int row=1;row<=4;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
		
	}
	
	public void for17() {
		System.out.println("-------Pattern-4---------");
		int num=1;
		for(int row=1;row<=6;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(col + " ");
				
			}
			System.out.println();
		}
		
	}
	
	public void for18() {
		System.out.println("-------Pattern-5---------");
		int num=1;
		for(int row=6;row>=1;row--) {
			for(int col=1;col<=row;col++) {
				System.out.print(col + " ");
				num++;
			}
			System.out.println();
		}
		
	}
	
	
	
	
	
	
	

}



