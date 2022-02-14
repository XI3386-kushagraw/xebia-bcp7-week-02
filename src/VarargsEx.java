
public class VarargsEx {
	
	public void getData(String... values) {
		for(String val:values) {
			System.out.println(val);
		}
	}
	
	public static void demonstrate() {
		VarargsEx vx=new VarargsEx();
		vx.getData("apple","mango","pear","Strawberry");
		
		String[] str = new String[]{"apple","samsung","vivo","oppo"};
		vx.getData(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demonstrate();
	}

}
