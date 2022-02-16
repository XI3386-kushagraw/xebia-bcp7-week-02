interface Drawable{  
    public void draw();  
}  


public class LambdaFnEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Drawable d2 = ()->{
			System.out.println("Lambda Functions");
		};
		d2.draw();
        
	}

}
