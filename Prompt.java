import java.util.Scanner;

public class Prompt {
	
	static PromptCalendar cal = new PromptCalendar();
	static PromptSearchGugu gugu = new PromptSearchGugu();
	
	// to add more classes
	static String menu1 = "1. " + cal.name()+ " ";
	static String menu2 = "2. " + gugu.name()+ " ";
	static String menu3 = "";
	static String menu4 = "";
	static String menu5 = "";
	
	public static int menu() {

		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int output = 1;
		
		if (input == 1) {
			cal.main(sc);
			System.out.println("\nCalendar ended\n");
		} else if (input == 2) {
			gugu.main(sc);
			System.out.println("\nSearchGugu ended\n");
		} else if (input == 3) {
			
		} else if (input == 4) {
			
		} else if (input == 5) {
				
		} else if (input == 0) {
			output = 0;
		}
		return output;
	}
	
	public static void main(String[] args) {
		
		while(true) {
			System.out.println(menu1 + menu2 + menu3 + menu4 + menu5 + "0. exit");
			
			int repeat = menu();
				
			if (repeat == 1) {
				continue;
			} else if (repeat == 0) {
				System.out.println("Prompt ended");
				break;
			}
		}
	}
}
