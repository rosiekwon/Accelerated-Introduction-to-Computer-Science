// Eunjin Kwon, CS201, 02142020, exercise 2

package labs.lab3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class exercise2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);//declare a Scanner object that will read from the keyboard    
		int[] file = new int[50];//create an array of 50 integer values
		System.out.print("Enter an integer(enter Done to finish): ");//prompt the user to enter a number
		String in = input.nextLine();
		if (in.equalsIgnoreCase("Done")) {// check for exit condition.
		}else {
				for (int i=0; i<file.length; i++) {
					int value = Integer.parseInt(in);//convert string into integer
					file[i]=value; //store the value in the array 
					System.out.print("Enter an integer(enter Done to finish): ");
					in = input.nextLine();
					if (in.equalsIgnoreCase("Done")) {// check for exit condition.
						break;}	 
					}
				}
			
		System.out.print("Enter the name of your file: ");//prompt the user to enter the file name
        String fileName = input.nextLine();
        try {
        	FileWriter file1 =new FileWriter("src/labs/lab3/"+fileName);//construct a file
			file1.write(Arrays.toString(file));//convert array to string
			file1.flush();
			file1.close();//Releases resources allocated to the file1.
		} catch (IOException e) { // handling the exception by using Exception class    
			e.printStackTrace();
		}

		input.close();// close the file scanner
	}
	
}