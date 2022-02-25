// Leap year checker by Jared Pollack
import java.util.Scanner;

public class LeapYear {
	
	
	static int year;
	static boolean isLeap;
	
	
	
	public static int getYear() {
		Scanner read = new Scanner(System.in);
		System.out.print("\nEnter Year: ");
		year = read.nextInt();
		return year;
	}

	
	
	public static boolean isLeapYear(int year) {
		
		if(year % 4 != 0) {
			return false;
		} else if(year % 400 == 0) {
			return true;
		} else if(year % 100 == 0) {
			return false;
		} else {
			return true;
		}
	}
	
	
	

	
	public static void main(String[] args) {
		
		System.out.println("#####################");
		System.out.println("#    LEAP YEAR?     #");
		System.out.println("#                   #");
		System.out.println("#  By Jared Pollack #");
		System.out.println("#####################");
		
		year = getYear();
		isLeap = isLeapYear(year);
		
		if(isLeap == true) {
		System.out.println(year + " is a leap year!");
		System.exit(0);
		} 
		else {
			System.out.println(year + " is not a leap year!");
			System.exit(0);
		}
		

	}

}
