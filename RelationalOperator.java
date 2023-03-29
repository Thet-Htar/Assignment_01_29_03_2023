/*
 *<h2>Relational Operator Class</h2>
 *<p>
 * Getting two numbers from users and test using realtional operator
 *</p>
 *
 *@author(Hnaung Thet Htar Wai)
 *
 */
package operators;

import java.util.Scanner;

public class RelationalOperator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print( " Enter first number: " );
		int first = scan.nextInt();
		
		System.out.print( " Enter second number:" );
		int second = scan.nextInt();
		
		if( first == second ) {
			System.out.print( " First number is similar to second number.");
		}else if( first > second ) {
			System.out.print( " First number is larger than second number.");
		}else {
			System.out.print( " First number is smaller than second number.");
		}
	}

}
