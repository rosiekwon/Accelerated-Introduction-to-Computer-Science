// Eunjin Kwon, CS201, 01242020, exercise 1

package labs.lab1;

import java.util.Scanner;

public class exercise1 {

	public static void main(String[] args) {      
		Scanner input = new Scanner(System.in);//declare a Scanner object that will read from the keyboard                
		System.out.println("Enter your name:");//prompt user for the

		String name = input.nextLine();
		
		System.out.println(name);
		
		input.close();

	}

}
