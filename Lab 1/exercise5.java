// Eunjin Kwon, CS201, 01242020, exercise 5

package labs.lab1;

import java.util.Scanner;

public class exercise5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//declare a Scanner object that will read from the keyboard                
		System.out.println("Enter the length(inches):");// Prompt the user for the length in inches of a box
		double length = Double.parseDouble(input.nextLine());
		System.out.println("Enter the width(inches):");//Prompt the user for the width in inches of a box 
		double width = Double.parseDouble(input.nextLine());
		System.out.println("Enter the depth(inches):");//Prompt the user for the depth in inches of a box
		double depth = Double.parseDouble(input.nextLine());
		System.out.println("the amount of wood needed to make the box(square feet): " + (length*width*depth)/144);//Calculate the amount of wood (square feet) needed to make the box
		
		input.close();
		
		/* length 12 width 24 depth 36 | the amount of wood 72
		 * length 38 width 40 depth 50 | the amount of wood 527.77
		 * length 20 width 40 depth 60 | the amount of wood 333.33
		 * length 24 width 56 depth 72 | the amount of wood 672.0
		 * length 32 width 48 depth 12 | the amount of wood 128.0
		 */
		
	}

}
