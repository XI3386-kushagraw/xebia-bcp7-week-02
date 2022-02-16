//import java.io.*;

public class MultiExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a[]=new int[5];
			a[5]=30/0;
		}
		catch(ArrayIndexOutOfBoundsException | ArithmeticException e) {
			System.out.println("Multiple Catch");
		}
	}

}
