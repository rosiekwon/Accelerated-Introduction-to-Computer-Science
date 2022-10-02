// Eunjin Kwon, CS201, 01242020, exercise 3

package labs.lab1;

import java.util.Scanner;

public class exercise3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//declare a Scanner object that will read from the keyboard                
		System.out.println("Enter your first name:");//prompt user for user name 

		char initial = input.nextLine().charAt(0);
		System.out.println(initial);//output the user's initial to the screen
		
		input.close();
	}

}
