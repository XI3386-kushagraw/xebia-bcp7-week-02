
public class AutoBoxingEx {

	Integer it = new Integer(50);

	public void setValue(int it) {
	}

	public Integer getValue() {
		return it;
	}

	public Float getFloat() {
		return 6.0f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AutoBoxingEx ex = new AutoBoxingEx();
		ex.setValue(new Integer(5));
		int q = ex.getValue();
		System.out.println(q);
	}

}
