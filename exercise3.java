// Eunjin Kwon, CS201, 01312020, exercise 3

package labs.lab2;

import java.io.IOException;
import java.util.Scanner;

public class exercise3 {

	public static void main(String[] args)throws IOException {
			Scanner input = new Scanner(System.in);//declare a Scanner object that will read from the keyboard
			int number=0; 
			/* 1. Say Hello - This should print "Hello" to console.
			 * 2. Addition - This should prompt the user to enter 2 numbers and return the sum of the two.
			 * 3. Multiplication - This should prompt the user to enter 2 numbers and return the product of the two.
			 * 4. Exit - Leave the program*/			
			do {
				System.out.println("Enter the number of menu(1.Say hello 2.Addition 3.Multipliation 4.Exit");
				number = Integer.parseInt(input.nextLine());
				if (number == 1){
					System.out.println("Hello");	
				}else if(number== 2){
					System.out.println("Enter the two numbers");
					int number1 = Integer.parseInt(input.nextLine()); //prompt the user to enter 2 numbers
					int number2 = Integer.parseInt(input.nextLine());
					System.out.println("The sum of the two number is " + (number1+number2));//compute the sum of the two numbers
				}else if(number== 3){
					System.out.println("Enter the two numbers");
					int number1 = Integer.parseInt(input.nextLine()); //prompt the user to enter 2 numbers
					int number2 = Integer.parseInt(input.nextLine());
					System.out.println("The product of the two number is " + (number1*number2));//compute the product of the two numbers 
				}
			}while(number != 4); //it would run until the user put number 4
			
	input.close();
	}
}


