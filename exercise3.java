// Eunjin Kwon, CS201, 02142020, exercise 3

package labs.lab3;

import java.io.IOException;

public class exercise3 {

	public static void main(String[] args) throws IOException{
		int[] a = {72, 101, 108, 108, 111, 32, 101, 118, 101, 114, 121, 111, 110, 101, 33, 32, 76, 111, 111, 107, 32, 97, 116, 32, 116, 104, 101, 115, 101, 32, 99, 111, 111, 108, 32, 115, 121, 109, 98, 111, 108, 115, 58, 32, 63264, 32, 945, 32, 8747, 32, 8899, 32, 62421};
		int min = a[0]; 
		
		for (int i=1; i<a.length; i++){ //method to get the minimum value
			if(a[i]< min){ //compare all the values in the array 
				min = a[i];//the smaller value would replace the minimum value
			}
		}
		System.out.println(min + " is the minimum value in this array");//print out the minimum value

	}

}
