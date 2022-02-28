
public interface InterfaceEx {

	public static void staticMethod() {
		System.out.println(" Default static method");
	}

	public default void init() {
		System.out.println("Default init method");
	}

	public void printMessage(String message);

}
