abstract class Anim{
	abstract void Eating();
}


public class AbstractClassEx extends Anim {

	//Defining the abstract class method
	void Eating() {
		System.out.println("Eating...");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating an object to access the method
		Anim an=new AbstractClassEx();
		an.Eating();
	}

}
