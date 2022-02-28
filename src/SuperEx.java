class Hello {
	public void turbo() {
		System.out.println("Ruf Ruf...");
	}
}

public class SuperEx extends Hello {

	public void turbo() {
		System.out.println("Suf Suf...");
	}

	public void callingAll() {
		super.turbo(); // Calling parent class method by using super keyword
		turbo(); // calling child class keyword
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperEx c = new SuperEx();
		c.callingAll();
	}

}
