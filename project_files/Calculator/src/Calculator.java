
// Calculator - made by Jared N. Pollack

import java.util.Scanner;


public class Calculator {
	
	// DECLARATION OF STATIC VARIABLES
	static float num1, num2, result;
	static char op;
	static int choice;
	
	// CALCULATION FUNCTIONS
	public static float mult(float num1, float num2) {
		result = num1*num2;
		return result;
	}
	
	public static float divide(float num1, float num2) {
		result = num1/num2;
		return result;
	}
	
	public static float mod(float num1, float num2) {
		result = num1%num2;
		return result;
	}
	
	public static float add(float num1, float num2) {
		result = num1+num2;
		return result;
	}
	
	public static float sub(float num1, float num2) {
		result = num1-num2;
		return result;
	}
	
	// START FUNCTION
	
	public static void start() {
		
		System.out.println("\nEnter first number to get started!\n");
		
		Scanner read = new Scanner(System.in);
		System.out.print("NUM1: ");
		num1 = read.nextFloat();
		
		System.out.println("\nNow choose an operator!\n");
		
		System.out.print("OP (*|/|%|+|-): ");
		op = read.next().charAt(0);
		
		System.out.println("\nNow enter second number!\n");
		
		System.out.print("NUM2: ");
		num2 = read.nextFloat();
		
		// OP MATCH + ERROR CHECKING
		
		if(op == '*') {
			result = mult(num1, num2);
			System.out.println("\n" + num1 + " " + "*" + " " + num2 + " " + "=" + " " + result);
		}
		else if(op == '/') {
			result = divide(num1, num2);
			System.out.println("\n" + num1 + " " + "/" + " " + num2 + " " + "=" + " " + result);
		}
		else if(op == '%') {
			result = mod(num1, num2);
			System.out.println("\n" + num1 + " " + "%" + " " + num2 + " " + "=" + " " + result);
		}
		else if(op == '+') {
			result = add(num1, num2);
			System.out.println("\n" + num1 + " " + "+" + " " + num2 + " " + "=" + " " + result);
		}
		else if(op == '-') {
			result = sub(num1, num2);
			System.out.println("\n" + num1 + " " + "-" + " " + num2 + " " + "=" + " " + result);
		} else {
			System.out.println("Incompatible operator used!");
		}
		
		
		System.out.print("\nDo you want to calculate another query? (1/0): ");
		choice = read.nextInt();
		
		if(choice == 1) {
			start();
		} 
		else if(choice == 0) {
			System.out.println("Goodbye!");
			System.exit(0); // EXIT PROGRAM
		}
		else {
			System.out.println("Invalid choice! Exiting program!");
			System.exit(0);
		}
		
		
		
		
   }
	
	

	public static void main(String[] args) {
		
		// Welcome message
		System.out.println("Welcome to Jared's Calculator!\n");
		start(); // STARTS PROGRAM
		
  }

}
