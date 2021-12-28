package com.ujoonnee.java.calendar;

import java.util.*;

public class Calendar {

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		CalProcess cal = new CalProcess();

		// input
		while (true) {

			System.out.println("연도를 입력하세요.\n종료하려면 -1을 입력하세요.");
			System.out.print("year > ");
			int year = sc1.nextInt();

			if (year == -1) {
				break;
			}

			System.out.println("달을 입력하세요.");
			System.out.print("month > ");
			int month = sc1.nextInt();

			if (month == -1) {
				break;
			} else if (month > 12 || month < 1) {
				System.err.println("잘못 입력하셨습니다.\n");
				continue;
			}

			int day = cal.firstDay(year, month); 

			System.out.printf("\n" + "%13d년%3d월\n", year, month);
			System.out.println("   일  월   화  수   목  금   토" + "\n-------------------------------");

			cal.printCalendar(year, month, day);
		}

		sc1.close();
		sc2.close();

		System.out.println("종료");

	}

}