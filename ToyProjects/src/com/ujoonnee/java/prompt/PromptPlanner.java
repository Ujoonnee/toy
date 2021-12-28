package com.ujoonnee.java.prompt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.util.Scanner;

public class PromptPlanner {
	
	public String name() {
		return "Planner";
	}

	static Scanner sc = new Scanner(System.in);


	public void main(Scanner sc) throws IOException {
		
		while(true) {
			System.out.println("1. Create schedule 2. Load schedule 3. Delete schedule 0. Exit");
			int menu = sc.nextInt();
			if (menu == 0) {
				break;
				
			} else if (menu < 1 || menu > 3) {
				System.err.println("Wrong input\n");
				continue;
				
			} else {
			
				System.out.println("Date (yymmdd)");
				String fileName = sc.next() + ".txt";
				String filePath = "/Users/ujoonnee/eclipse-workspace/ToyProjects/src/Planner/" + fileName ;
				
				if (menu == 1) {
					writePlan(filePath);
					
				} else if (menu == 2) {
					readPlan(filePath);
					
				} else if (menu == 3) {
					deletePlan(filePath);
					
				}
			}
		}
		
	}
	public static void writePlan(String filePath) throws IOException {
	
		File file = new File(filePath) ;
		
		System.out.println("1. New schedule 2. Add schedule");
		int number = sc.nextInt();
		if (number < 1 || number > 2) {
			System.err.println("Wrong input");
			
		} else { 
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
			System.out.println("Content >\n");
			String content = br.readLine() + "\n";
			
			if (number == 1) {
				FileWriter fw = new FileWriter(file);
				fw.write(content) ;
				fw.flush() ;
				fw.close();
				System.out.println("Schedule created.\n");
				
			} else if (number == 2) {
				FileWriter fw = new FileWriter(file, true);
				fw.write(content) ;
				fw.flush() ;
				fw.close();
			}
		}
	}
	
	public static void readPlan(String filePath) throws IOException {
		try {
			File readFile = new File(filePath);
			BufferedReader fileReader = new BufferedReader(new FileReader(readFile));
			String line;
			while ((line = fileReader.readLine()) != null) {
				System.out.println(line);
			}
			System.out.println();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("There is no schedule.\n");
		}

	}
	
	public static void deletePlan(String filePath) throws IOException {
		try {
			Path path = Paths.get(filePath);
			Files.delete(path);
			System.out.println("Schedule deleted.\n");
			
		} catch (NoSuchFileException e) {
			System.out.println("There is no schedule .\n");
		}
	}
	
}
