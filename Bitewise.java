package operators;

import java.util.Scanner;

public class Bitewise {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print( " Enter first number: " );
		int first = scan.nextInt();
		
		System.out.print( " Enter second number smaller than first number " );
		int second = scan.nextInt();
		
		System.out.println(" BitWise And : " + ( first & second));
		System.out.println(" BitWise OR : " + ( first | second));
		System.out.println(" BitWise XOR : " + ( first ^ second));
		System.out.println(" BitWise complement : " + ( ~second));
		System.out.println(" BitWise left Shift : " + ( first << 2 ));
		System.out.println(" BitWise left Shift : " + ( second >> 2 ));
	}

}
