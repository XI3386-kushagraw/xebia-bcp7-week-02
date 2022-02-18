class Hep{
	private int x;
	private int y;
	
	public Hep(int x,int y) {
//		This will not assign any values 
//		x=x;
//		y=y;
		
//		To assign value we use this where the variable names are same to give a reference
		this.x=x;
		this.y=y;
	}
	
	void print() {
		System.out.println("This is value of x:-  "+x+" and y:- "+y);
	}
	
	
}
public class ThisEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hep h=new Hep(1,2);
		h.print();
	}

}
