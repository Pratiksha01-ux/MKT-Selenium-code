package programs;

import java.util.Arrays;
import java.util.Scanner;

public class toCharArray {
	public static void main(String[]args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a word");
	    String input = sc.next();
		  
		String [] c = input.split("");
		System.out.println(Arrays.toString(c));
		
		
	}

}


