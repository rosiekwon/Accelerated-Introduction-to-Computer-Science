package labs.lab2;

import java.io.IOException;
import java.util.Scanner;

public class exercise2 {

	public static void main(String[] args)throws IOException {
		Scanner input = new Scanner(System.in);//declare a Scanner object that will read from the keyboard
		double total=0;  //define the variable total for summation of grades.
		double grade=0; //define the variable grade and set it 0
		int totalnum=0; //totalnum is the variable for the number of grade. 
		do {
		System.out.println("Enter your grade(when you finished entering grades enter -1):");//prompt the user for grades
		grade =Double.parseDouble(input.nextLine());
		if (grade == -1) { //when user enter -1, break statement terminates the loop immediately
			break;
			}
		total = grade + total; //add the value of the grade and store it in the total variable
		totalnum =totalnum + 1;//count the number of grade
		}while(true); 
		
		
		System.out.println(total/totalnum);//computes the average
}
	
	/* grade1 10 | grade2 30 | grade3 50 | expect average 30   | average 30.0
	 * grade1 20 | grade2 30 | grade3 50 | expect average 33.3 | average 33.333
	 * grade1 15 | grade2 50 | grade3 70 | expect average 45   | average 45.0
	 */
}
