
import java.util.Scanner;

public class EvenOdd {
	
	
	static int num;
	
	
	

	public static void main(String[] args) {
		
		System.out.print("\nOdd/Even Checking Tool\n");
		
		Scanner read = new Scanner(System.in);
		System.out.print("\nEnter number: ");
		num = read.nextInt();
		
        
		if(num % 2 == 0) {
			System.out.println("\n" + num + " " + "is even!");
			System.exit(0);
		}
		else if(num % 2 == 1) {
			System.out.println("\n" + num + " " + "is odd!");
			System.exit(0);
		}
		else {
			System.out.println("Invalid value entered!");
			System.exit(0);
		}
	
	}

  }
