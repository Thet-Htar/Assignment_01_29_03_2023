/*
 *<h2>AssignmentOperatorClass</h2>
 *<p>
 *Getting input from user and print out addition 
 *</p>
 *
 *@author(Hnaung Thet Htar Wai)
 *
 */


package operators;

import java.util.Scanner;

public class AssignmentOperator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print( " Enter first number: " );
		double first = scan.nextInt();
		
		System.out.print( " Enter second number smaller than first number " );
		double second = scan.nextInt();
		
		first += second;
		
		System.out.print(" First number after adding second number is : " +  first );
	}

}
