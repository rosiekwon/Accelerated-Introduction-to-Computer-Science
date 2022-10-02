// Eunjin Kwon, CS201, 01242020, exercise 4

package labs.lab1;

import java.util.Scanner;

public class exercise4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//declare a Scanner object that will read from the keyboard
		System.out.println("Enter the temperature(F):");//prompt the user for a temperature in Fahrenheit
		int temp = Integer.parseInt(input.nextLine());
		System.out.println("This temperature in Celcius is :"+ (temp-32)*5/9);//convert the Fahrenheit to Celsius
		
		System.out.println("Enter the temperature(C):");//prompt the user for a temperature in Celsius
		int temperature = Integer.parseInt(input.nextLine());
		System.out.println("This temperature in Faherenheit is :"+ (temperature*9/5+32));//convert the Celsius to Fahrenheit

		input.close();
		/*|temperature 0 (C)| expectation 32(F) actual 32(F)
		 *|temperature 10(F)| expectation -12(C) actual -12(C)
		 *|temperature 40(C)| expectation 104(F) actual 104(F)
		 *|temperature 30(F)| expectation -1(C) actual -1(C)
		 *|temperature -10 (C)| expectation 14(F) actual 14(F)
		 *|temperature -10(F)| expectation -23(C) actual -23(C)
		*/
	}

}
