/*
 *<h2>Testing Demo Class</h2>
 *<p>
 *Getting two numbers from users and doing arithmetic operation
 *</p>
 *
 *@author(Hnaung Thet Htar Wai)
 *
 */
package operators;

import java.util.Scanner;
public class Demo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double first , second ;
		
		System.out.print("Enter first number:");
		first = scan.nextDouble();
		
		System.out.print("Enter second number:");
		second = scan.nextDouble();
		
		double addition = first + second ;
		double subtract = first - second ;
		double multiplication = first * second ;
		double division = first / second ;
		
		System.out.println( "The addition of first and second is : " + addition );
		System.out.println( "The subtraction of first and second is : " + subtract );
		System.out.println( "The multiplication of first and second is : " + multiplication );
		System.out.println( "The division of first and second is : " + division );
	}

}
