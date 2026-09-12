
public class Program {

	public static void main(String[] args) {
		
		Date objDate=new Date();
		
		int choice;
		do {
			System.out.println("Menu");
			System.out.println("1.Set Date");
			System.out.println("2. Add Day");
			System.out.println("3. Add Months");
			System.out.println("4. Add Years");
			System.out.println("5. Display");
			System.out.println("6. Compare Dates");
			System.out.println("7. Exit");
			
			System.out.println("Enetr your choice");
			choice=ConsoleInput.getInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter the day");
				int day=ConsoleInput.getInt();
				
				System.out.println("Enter the month");
				int month=ConsoleInput.getInt();
				
				System.out.println("Enter the year");
				int year=ConsoleInput.getInt();
				
				objDate.setDate(day, month, year);
				break;
			
			case 2:
				System.out.println("Enter no of Days");
				int days=ConsoleInput.getInt();
				
				objDate.addDays(days);
				break;
				
			case 3:
				System.out.println("Enter no of months");
				int months=ConsoleInput.getInt();
				
				objDate.addMonths(months);
				break;
				
			case 4:
				System.out.println("Enter no of years");
				int years=ConsoleInput.getInt();
				
				objDate.addYears(years);
				break;
				
			case 5:
				System.out.println(objDate.getDay()+"/" + objDate.getMonth()+"/" + objDate.getYear());
				break;
				
			case 6:
				System.out.println("Compare Dates");
				break;
				
			case 7:
				System.out.println("Exiting...");
				break;
				
			default:
				System.out.println("Invalid choice");
			}
		
		}while(choice!=7);
		
	
		
		

	}

}
