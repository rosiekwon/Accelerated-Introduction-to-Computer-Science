package labs.lab3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class exercise1 {

	public static void main(String[] args)throws IOException {
	    File file = new File("src/labs/lab3/grades.csv");//read input from the file 
	    Scanner input = new Scanner(file);
		
	    int[] grade = new int[14];//create an array of 14 integer values 
	    for(int i=0;i<grade.length; i++) {
	    	String grades = input.nextLine();
	    	int comma =grades.indexOf(',');	//find the comma which is located before the numbers 
	    	int percentage = ((grades.charAt(comma+1)-'0')*10+(grades.charAt(comma+2)-'0'));//convert string to number
	    	grade[i]= percentage;//store the value in the array
	    }
		double total =0;
		for (int i=0; i<grade.length; i++) {//find the total value 
			total = total+ grade[i];
		}
		System.out.println("Average: " + (total/grade.length));//compute the average and print it out
		input.close();
	}

}
