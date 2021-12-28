package com.ujoonnee.java.gugu;

import java.util.Scanner;

public class Newgugu {

	public static void main(String[] args) {
		
		// input x,y
		Scanner sc = new Scanner(System.in);
		String userinput = sc.nextLine();
		sc.close();
		
		int[] calc = NewguguInput.input(userinput);
		
		NewguguInput.print(calc);
		
		
	}

}
