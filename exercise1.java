// Eunjin Kwon, CS201, 01312020, exercise 1

package labs.lab2;

import java.io.IOException;
import java.util.Scanner;

public class exercise1 {

	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);//declare a Scanner object that will read from the keyboard                
		System.out.println("Enter the number:");//prompt user for a number 
		int num = Integer.parseInt(input.nextLine());
		for (int i=0;i<num;i++){ //using for loop to repeat making the num rows 
			for(int j=0;j<=i;j++) {//using another loop for making j times of * in the row
			System.out.print("*");
			}
			System.out.println(" ");//print out (i-j) times with the space
		}
input.close();
	}
	

}
