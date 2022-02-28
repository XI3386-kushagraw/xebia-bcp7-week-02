class OutClass {
	int x = 8;

	class InClass {
		int y = 9;
	}
}

public class InnerClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutClass o = new OutClass();
		OutClass.InClass i = o.new InClass();

		System.out.println("Sum is:- " + (o.x + i.y));
	}

}
