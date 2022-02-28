
public class TypeCastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * There are two types of type casting 1. Narrow/DownCasting(Manual) 2.
		 * Widening/Up-casting(Automatically)
		 */

		// Narrow/DownCasting

		// converting a larger type to a smaller size type
		// double -> float -> long -> int -> char -> short -> byte

		double myDouble = 9.78d;
		int myInt = (int) myDouble; // Manual casting: double to int
		// int myInt=myDouble This will give a typecast error

		System.out.println(myDouble); // Outputs 9.78
		System.out.println(myInt); // Outputs 9

		// Widening/Up-Casting

		// converting a smaller type to a larger type size
		// byte -> short -> char -> int -> long -> float -> double

		char a = 'A', b = 'b';
		int x = a; // Automatic typecasting will be done
		int y = b; // Automatic typecasting will be done

		System.out.println(x); // This will print the ascii value of character
		System.out.println(y); // This will print the ascii value of character
	}

}
