package com.ujoonnee.java.calendar;

public class CalProcess {
	

	public boolean leapYear(int year) {
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
		
		int step1 = (year-1) % 400;	// postpone 0
		int step2q = step1 / 100;		// quotient
		
		if (step2q == 1) {
			step2q = 5;
		} else if(step2q == 2) {  
			step2q = 3;
		} else if(step2q == 3) {
			step2q = 1;	
		} 
		
		int step2r = step1 % 100;	// remainder
		int step3r = (step2r / 4) * 2 + (step2r - (step2r / 4));		// year procedure ends
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
		
		int step5 = (step2q + step4r + monthToDays) % 7 + 1;
		
		return step5;
	}
	
	
	public void printCalendar(int year, int month, int day) {

		// condition for not putting space when the first day is Sunday
		if (day != 0) {
			for (int i = 0; i < day; i++) {
				System.out.printf("%4s", " ");
			}  
		}
		
		// opening new line for the case that the first day is Saturday
		if (day == 6) {
			System.out.printf("%4d\n", 1);
		} else {
			System.out.printf("%4d", 1);
		}

		for (int i = 2; i < getDays(year, month) + 1; i++) {

			System.out.printf("%4d", i);
			if ((i + day) % 7 == 0 && i == getDays(year, month)) {
				System.out.println("\n");
			} else if ((i + day) % 7 == 0) {
				System.out.println();
			} else if (i == getDays(year, month)) {
				System.out.println("\n");
			}
		}

	}

}