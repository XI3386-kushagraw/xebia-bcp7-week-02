/**
 * 
 */

/**
 * @author Sumith.Puri
 *
 */
public class XebiaRaceConditions implements Runnable {

	public XebiaCommonObject xebiaCommonObj;

	public void run() {

		xebiaCommonObj.add();
		xebiaCommonObj.subtract();
		System.out.println("XebiaRaceConditions:" + xebiaCommonObj.print());

		xebiaCommonObj.subtract();
		System.out.println("XebiaRaceConditions:" + xebiaCommonObj.print());

		xebiaCommonObj.subtract();
		System.out.println("XebiaRaceConditions:" + xebiaCommonObj.print());

		xebiaCommonObj.subtract();
		xebiaCommonObj.subtract();
		System.out.println("XebiaRaceConditions:" + xebiaCommonObj.print());

		xebiaCommonObj.add();
		System.out.println("XebiaRaceConditions:" + xebiaCommonObj.print());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		XebiaCommonObject xebiaCommonObj = new XebiaCommonObject();
		XebiaRaceConditions xebiaRaceConditions = new XebiaRaceConditions();
		xebiaRaceConditions.xebiaCommonObj = xebiaCommonObj;
		XebiaSpeedsThread xebiaSpeedThread = new XebiaSpeedsThread();
		xebiaSpeedThread.xebiaCommonObj = xebiaCommonObj;

		Thread xThread = new Thread(xebiaRaceConditions);
		Thread sThread = new Thread(xebiaSpeedThread);

		xThread.start();
		sThread.start();
	}
}

class XebiaCommonObject {

	private int inconsistentInt = 5;

	public void add() {
		inconsistentInt++;
	}

	public void subtract() {
		inconsistentInt--;
	}

	public int print() {
		return inconsistentInt;
	}
}

class XebiaSpeedsThread extends Thread {

	XebiaCommonObject xebiaCommonObj;

	public void run() {

		xebiaCommonObj.subtract();
		xebiaCommonObj.subtract();
		System.out.println("XebiaSpeedsThread:" + xebiaCommonObj.print());
		xebiaCommonObj.subtract();
		xebiaCommonObj.subtract();
		System.out.println("XebiaSpeedsThread:" + xebiaCommonObj.print());
		xebiaCommonObj.add();
		xebiaCommonObj.subtract();
		System.out.println("XebiaSpeedsThread:" + xebiaCommonObj.print());
		xebiaCommonObj.subtract();
		System.out.println("XebiaSpeedsThread:" + xebiaCommonObj.print());
	}

}
