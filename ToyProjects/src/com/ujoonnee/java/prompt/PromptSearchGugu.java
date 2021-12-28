package com.ujoonnee.java.prompt;

import java.util.Scanner;

public class PromptSearchGugu {
	
	public String name() {
		return "SearchGugu";
	}

	public void main(Scanner sc) {

		while(true) {
			
			System.out.println("Table number?\nType 0 to exit.");
			long x = sc.nextLong();
			int y = 1;
			if (x != 0) {
				System.out.println("Table number" + x);
				while (y < 10) {
					System.out.println(x + " * " + y + " = " + x * y);
					y++;
				}
			} else {
				break;
			}
		}
	}
}
