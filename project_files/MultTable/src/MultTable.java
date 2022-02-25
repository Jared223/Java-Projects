
// Program to generate multiplication table for given number - by Jared Pollack

import java.util.Scanner;

public class MultTable {
	
	static int num;
	static int limit;
	
	

	public static void main(String[] args) {
		
		System.out.println("Program to print multiplication table of given number!\n\n");
		
		Scanner read = new Scanner(System.in);
		System.out.print("Enter num: ");
		num = read.nextInt();
		
		System.out.print("\nEnter limit: ");
		limit = read.nextInt();
		
		
		
		if(num % 1 == 0) {
			
			for(int i = 0; i <= limit; i++) {
			System.out.println(num + " " + "*" + " " + i + " " + "=" + " " + num*i);
			
			
			}
			
			
		} else {
			System.out.println("Error. Invalid values!");
			System.exit(0);
		}
		
		
		

	}

}
