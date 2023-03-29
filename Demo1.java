/*
 *<h2>Testing Demo Class</h2>
 *<p>
 *Getting birth year from user and print out current age
 *</p>
 *
 *@author(Hnaung Thet Htar Wai)
 *
 */
package operators;

import java.util.Scanner;

public class Demo1 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		final int currentYear = 2023;
		
		System.out.print("Enter your birth Year:");
		int birthYear = scan.nextInt();
		
		int currentAge = currentYear - birthYear;
		
		System.out.println( "Your current Age is " + currentAge );	
	}
}
