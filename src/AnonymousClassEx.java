
class AnonymousEx{
	public void display() {
		System.out.println("AnonymousExample");
	}
}

class AnonymousDemo{
	public void createClass(){
		AnonymousEx ax=new AnonymousEx() {
			public void display() {
				System.out.println("Inside Anonymous Example");
			}
		};
		ax.display();
	}
}

public class AnonymousClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonymousDemo ae=new AnonymousDemo();
		ae.createClass();
	}

}
