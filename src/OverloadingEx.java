
class Area{
	public Area(int a) {
		System.out.println("Square area is:- "+a*a);
	}
	public Area(int a,int b) {
		System.out.println("Rectangle area is:- "+a*b);
	}
}

public class OverloadingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Area a = new Area(4);
		Area b = new Area(5,6);
	}

}
