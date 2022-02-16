

public class StringInSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String day = "MONDAY";
		
		switch(day) {
		case "MONDAY": 
			System.out.println("Monday");
			break;
		case "TUESDAY":
			System.out.println("TUESDAY");
			break;
		case "WEDNESDAY":
			System.out.println("Wednesday");
			break;
		case "THURSDAY":
			System.out.println("Thursday");
			break;
		case "FRIDAY":
			System.out.println("Friday");
			break;
		case "SATURDAY":
			System.out.println("Saturday");
			break;
		case "SUNDAY":
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Not a valid");
			break;
		}
	}

}
