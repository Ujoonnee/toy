public class PromptCalProcess {
	

	public boolean leapYear(int year) {

		/*
		 * leap year calculation
		 * 
		 * every 4th year is a leap year.
		 * every 100th year is not a leap year.
		 * every 400th year is a leap year.
		 */
		
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
			return true;
		else
			return false;
	}
	
	
	public int getDays(int year, int month) {
		
		int[] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		if (leapYear(year))
			months[1] = 29;
		
		return months[month - 1];
	}
	
	
	public int firstDay(int year, int month) {
		
		 /*
		 * get first day by calculating postponed days.
		 * 1 leap year = put off 2 days
		 *  non leap year = put off 1 day
		 * Criterion day = 0001.01.01 Monday
		 * if 7(0) days postponed, the day of the date will be Monday.
		 * 
		 * 
		 * ex1 ) 401.01.01
		 * 400 years = 97 leap years + 303 non leap years = 97 * 2 + 303 days postponed
		 * 497 % 7 = 0, 0 postponed days.
		 * 401.01.01 is Monday.
		 * 
		 * ex2 ) 2021.12.25
		 * 1. convert years into days
		 * 2020 = 400 * 5 + 20
		 * 20 = 5 leap year + 15 non leap year
		 * 366 * 5 + 365 * 15 = 7305
		 * 7305 % 7 = 4
		 * 
		 * Jan to Dec 24
		 * 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 24 = 358
		 * 358 % 7 = 1
		 * 
		 * sum of postponed days = 4 + 1 = 5
		 * 6 % 7 = 5
		 * 
		 * 2021.12.25 is Saturday.
		 */
		
		int step1 = (year-1) % 400;		// 400 years
		int step2q = step1 / 100;		
		
		if (step2q == 1) {				// 100 years
			step2q = 5;
		} else if(step2q == 2) {		// 200 years
			step2q = 3;
		} else if(step2q == 3) {		// 300 years
			step2q = 1;	
		} 
		
		// 10 units of years
		int step2r = step1 % 100;	
		int step3r = (step2r / 4) * 2 + (step2r - (step2r / 4));
		int step4r = step3r % 7;
		
		// all months to days
		int monthToDays = 0;
		if (month == 0) {
			monthToDays = 0;
		} else {
			for (int i = 1; i < month; i++) {
				monthToDays += getDays(year, i);
			}
		}
		// no need to calculate remained days to get the first day.
		// + 1 for correction due to the first day of this calendar.
		int step5 = (step2q + step4r + monthToDays) % 7 + 1; 	
		
		return step5;
	}
	
	
	public void printCalendar(int year, int month, int day) {

		// put space except when the first day is Sunday
		if (day != 0) {
			for (int i = 0; i < day; i++) {
				System.out.printf("%4s", " ");
			}  
		}
		
		// opening new line for the case of Saturday for the first day.
		if (day == 6) {
			System.out.printf("%4d\n", 1);
		} else {
			System.out.printf("%4d", 1);
		}
		
		int calMonth = getDays(year, month); // prevent using getDays method repeatedly in the loop
		
		for (int i = 2; i < calMonth + 1; i++) {

			System.out.printf("%4d", i);
			if ((i + day) % 7 == 0 && i == calMonth) {
				System.out.println("\n");
			} else if ((i + day) % 7 == 0) {
				System.out.println();
			} else if (i == calMonth) {
				System.out.println("\n");
			}
		}

	}

}
