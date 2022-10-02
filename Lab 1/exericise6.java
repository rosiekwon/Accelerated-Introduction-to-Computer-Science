// Eunjin Kwon, CS201, 01242020, exercise 6

package labs.lab1;

import java.util.Scanner;

public class exericise6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//declare a Scanner object that will read from the keyboard                
		System.out.println("Enter the inches:");// Prompt the user for inches
		double length = Double.parseDouble(input.nextLine());
		System.out.println(length*2.54+"cm");//Convert inches to centimeters
		
		input.close();
		/*inches: 12 | centimeters: 30.48
		 *inches: 30 | centimeters: 76.2
		 *inches: 4.5 | centimeters: 11.43
		 *inches: 25 | centimeters: 63.5
		 */
	}

}
