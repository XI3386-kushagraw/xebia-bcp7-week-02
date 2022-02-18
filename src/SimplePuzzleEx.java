interface MyInt1{
	public static int num1=10;
	public default void hello1(){
		System.out.println("Hello Int1");
	}
}
interface MyInt2{
	public static int num2=100;
	public default void hello1() {
		System.out.println("Hello Int2");
	}
}
public class SimplePuzzleEx implements MyInt1,MyInt2 {

	public void hello1() {
	      System.out.println("This is the implementation of the display method");
	}
	
	public void show() {
		MyInt1.super.hello1();
		MyInt2.super.hello1();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimplePuzzleEx e = new SimplePuzzleEx();
		e.show();
	}

}
