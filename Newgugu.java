// this file requires NewguguInput.java
import java.util.Scanner;

public class Newgugu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String userinput = sc.nextLine();
		sc.close();
		
		int[] calc = NewguguInput.input(userinput);
		
		NewguguInput.print(calc);
		
		
	}

}
