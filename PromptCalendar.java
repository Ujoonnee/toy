import java.util.*;

public class PromptCalendar {
	
	public String name() {
		return "Calendar";
	}

	public void main(Scanner sc) {
		
		
		PromptCalProcess cal = new PromptCalProcess();

		while (true) {
			// input
			System.out.println("Please enter the year.");
			System.out.print("year > ");
			int year = sc.nextInt();
			if (year == 0) {	// to exit Calendar
				break;
			}
			System.out.println("Please enter the month.");
			System.out.print("month > ");
			int month = sc.nextInt();
			
			if (month == 0) {	// to exit Calendar
				break;
			} else {
				if (month > 0 && month < 13) {
					
					int day = cal.firstDay(year, month); 
		
					System.out.printf("\n" + "%13d년%3d월\n", year, month);
					// additional %4s for blank between Fr, Sa
					System.out.printf("%4s%4s%4s%4s%4s%4s%4s%4s\n","Su","Mo","Tu","We","Th","Fr","Sa", ""
					+ "\n-------------------------------");
		
					cal.printCalendar(year, month, day);
				} else {
					System.err.println("Wrong month.\n"); // repeat Calendar from the beginning
					continue;
				}
			}
		}
	}

}
