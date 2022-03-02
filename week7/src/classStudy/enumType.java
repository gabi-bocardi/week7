package classStudy;

import java.util.Scanner;

public class enumType {


	
	public static void main(String[] args) {
		//enum is a Class
		//you can create your own data types thorough enum
		
		
		//QUESTION  === ENUM WITHIN A CLASS;
		
		Day today;
		today = Day.TUE;
		
		Scanner inp = new Scanner (System.in);
		
		System.out.println("What day is today?Enter only first 3 characters.");
		String newDay = inp.nextLine().toUpperCase(); 
		
		//array of enum
		
		for (Day d:Day.values()) {
			System.out.print(d+" ");
		}
		System.out.println();
		//convert to a enum type to be compared
		Day userInp = Day.valueOf(newDay);
		
		switch (userInp) {
		case SUN:
			System.out.println("It is Sunday!");
			break;
		case MON:
			System.out.println("It's Monday!");
			break;
		default: 
			System.out.println("It's invalid!");
	
			
		}
	}
}
