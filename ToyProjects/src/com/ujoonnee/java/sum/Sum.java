package com.ujoonnee.java.sum;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		
		System.out.println("두 수를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		
		System.out.printf("%d와 %d의 합은 %d입니다.",a,b,a+b);
		

	}

}