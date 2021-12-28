package com.ujoonnee.java.planner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Planner {

	public static void main(String[] args) throws IOException {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 일정 만들기 2. 일정 불러오기");
		int menu = sc.nextInt();
		
		System.out.println("날짜 (yymmdd)");
		String fileName = sc.next() + ".txt";
		String filePath = "/Users/ujoonnee/eclipse-workspace/ToyProjects/src/Planner/" + fileName ;
		
		if (menu == 1) {
			
			// writing files
	
			File file = new File(filePath) ;
			
			System.out.println("1. 새로 작성 2. 내용 추가");
			int number = sc.nextInt();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
			System.out.println("내용");
			String content = "\n" + br.readLine();
			
			if (number == 1) {
				FileWriter fw = new FileWriter(file);
				fw.write(content) ;
				fw.flush() ;
				fw.close();
				
			} else if (number == 2) {
				FileWriter fw = new FileWriter(file, true);
				fw.write(content) ;
				fw.flush() ;
				fw.close();
				
			}
		} else if (menu == 2) {
			
			// reading file
			File readFile = new File(filePath);
			BufferedReader fileReader = new BufferedReader(new FileReader(readFile));
			String line;
			while ((line = fileReader.readLine()) != null) {
				System.out.println(line);
			}
			sc.close();
			fileReader.close();
		}
		
	}

}
