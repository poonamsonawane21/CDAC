
public class Program {
	public static void main(String[] args) {
		System.out.println("Enetr the first Number");
		float num1=ConsoleInput.getFloat();
		
		System.out.println("Enetr the second Number");
		float num2=ConsoleInput.getFloat();
		
		Calculator objCalculator=new Calculator();
		
		float result=objCalculator.add(num1, num2);
		
		System.out.println(result);
	}
}
