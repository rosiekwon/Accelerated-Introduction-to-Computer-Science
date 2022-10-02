package labs.lab1;

import java.util.Scanner;

public class exercise2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//declare a Scanner object that will read from the keyboard
		System.out.println("Enter your age:");//prompt the user for user age
		int yourage = Integer.parseInt(input.nextLine());
		System.out.println("Enter you father's age:");//prompt the user for user's father age
		int fatherage = Integer.parseInt(input.nextLine());
		System.out.println(fatherage-yourage);//output subtraction of father age to user age
		
		System.out.println("Enter your birthyear:");//prompt the user for user birth year
		int birthyear = Integer.parseInt(input.nextLine());
		System.out.println(birthyear * 2);//output birth year multiplied by 2
		
		System.out.println("Enter your height(inches):");//prompt the user for user height
		Double height = Double.parseDouble(input.nextLine());
		System.out.println(height * 2.54 +"cm");//output conversion of user height in inches to cms 
		System.out.println("feet: "+ (int)(height/12) + " inches: " + (int)(height%12));//Convert user height in inches to feet and inches
		
		
		
		input.close();

	}

}
