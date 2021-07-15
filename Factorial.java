package displas;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) { 
		Scanner obj = new Scanner(System.in);
		int  fact=1,x=1;
		System.out.println("Enter a number :");
		//	      int number= 4;
		int number=obj.nextInt();

		for( x=1;x<=number;x++){    
			fact=fact*x;   
		}    
		System.out.println("Factorial of "+number+" is: "+fact);    
	}						  

}
