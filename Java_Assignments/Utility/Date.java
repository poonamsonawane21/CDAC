
public class Date {
	private int day;
	private int month;
	private int year;
	
	//set the date
	public void setDate(int dd,int mm,int yy) {
		year=yy;
		if(mm<1 || mm>12) // check month
			month=1;
		else
			month=mm;
		
		//months having 31 days
		if(month==1|| month==3 || month==5) {
			if(dd<1 ||dd>31)
				day=1;
			else
				day=dd;
		}
		
		//months having 30 days
		else if(month==4||month==6||month==9||month==11) {
			if(dd<1 ||dd>30)
				day=1;
			else
				day=dd;
		}
		
		//check leap year
		
		else {
			//feb has 29 days
			if((year%400==0)||(year%4==0 && year%100!=0)){
				if(dd<1||dd>29) 
					day=1;
				else
					day=dd;
			}
			//feb has 28 days
			else {
				if(dd<1|| dd>28) 
					day=1;
				else 
					day=dd;
			}
		}
	}
	
	
	
	//To add days
	public void addDays(int days) {
		while(days>0) {
			//find max days in current months
			int maxDays;
			if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
				maxDays=31;
				
			}
			else if(month==4||month==6||month==9||month==11) {
				maxDays=30;
			}
			else {
				//for feb
				if((year%400==0)||(year%4==0 && year%100!=0)) {
					maxDays=29;
					
				}
				else {
					maxDays=28;
				}
			}
			
			//move days
			day++;
			if(day>maxDays) {
				day=1;
				month++;
			
				if(month>12) {
					month=1;
					year++;
				}
			}
			days--;
		}
	}
	
	
	
	// To add months
	public void addMonths(int months) {
	    month = month + months;
	    // If month goes beyond December
	    while(month > 12) {
	        month = month - 12;
	        year++;
	    }

	    // Check whether current day is valid
	    // for the new month

	    int maxDays;
	    if(month == 1 || month == 3 || month == 5 ||month == 7 || month == 8 || month == 10 || month == 12) {
	        maxDays = 31;
	    }
	    else if(month == 4 || month == 6 ||month == 9 || month == 11) {
	        maxDays = 30;
	    }
	    else {
	        // February
	        if((year % 400 == 0)||(year % 4 == 0 && year % 100 != 0)) {
	            maxDays = 29;
	        }
	        else {
	            maxDays = 28;
	        }
	    }

	    // If day is greater than maximum days
	    // of the new month
	    if(day > maxDays) {
	        day = maxDays;
	    }
	}
	
	
	// To add years
	public void addYears(int years) {
	    year = year + years;

	    // Check leap year case
	    // Example: 29/2/2024 + 1 year

	    if(month == 2 && day == 29) {
	        if(!((year % 400 == 0) ||(year % 4 == 0 && year % 100 != 0))) {
	            day = 28;
	        }
	    }
	}
	
	//Getter
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	
}
