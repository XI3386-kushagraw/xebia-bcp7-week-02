class Animal11{
	public void Eating() {
		System.out.println("Parent class");
	}
}
public class OverridingEx extends Animal11{

	public void Eating() {
		System.out.println("Child Class");
	}
	
	public static void main(String[] args) {
		// TODO sAuto-generated method stub
		Animal11 e = new OverridingEx();
		e.Eating();
		e=new Animal11();
		e.Eating();
	}

}
