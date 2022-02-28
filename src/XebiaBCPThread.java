

import com.xebia.bcp7.training.global.vo.XebiaJavaBean;

public class XebiaBCPThread implements Runnable {

	public void run() {

		XebiaCreator.getXebiaJavaBean().setTraineeId(1);
		XebiaCreator.getXebiaJavaBean().setTraineeName("Kushagra");
		System.out.println("XebiaBCPThread:" + XebiaCreator.getXebiaJavaBean().getTraineeName());
		XebiaCreator.getXebiaJavaBean().setTraineeId(1);
		XebiaCreator.getXebiaJavaBean().setTraineeName("Kushagra");
		System.out.println("XebiaBCPThread:" + XebiaCreator.getXebiaJavaBean().getTraineeName());
		XebiaCreator.getXebiaJavaBean().setTraineeId(1);
		XebiaCreator.getXebiaJavaBean().setTraineeName("Kushagra");
		System.out.println("XebiaBCPThread:" + XebiaCreator.getXebiaJavaBean().getTraineeName());
		XebiaCreator.getXebiaJavaBean().setTraineeId(1);
		XebiaCreator.getXebiaJavaBean().setTraineeName("Kushagra");
		System.out.println("XebiaBCPThread:" + XebiaCreator.getXebiaJavaBean().getTraineeName());
		XebiaCreator.getXebiaJavaBean().setTraineeId(1);
		XebiaCreator.getXebiaJavaBean().setTraineeName("Kushagra");
		System.out.println("XebiaBCPThread:" + XebiaCreator.getXebiaJavaBean().getTraineeName());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread xThread = new Thread(new XebiaBCPThread());
		Thread sThread = new XebiaSpeedThread();

		xThread.start();
		sThread.start();
	}
}

class XebiaCreator {

	private static XebiaCreator xebiaCreator = new XebiaCreator();
	XebiaJavaBean xebiaJavaBean = new XebiaJavaBean();

	public static XebiaJavaBean getXebiaJavaBean() {

		return xebiaCreator.xebiaJavaBean;
	}

}

class XebiaSpeedThread extends Thread {

	public void run() {

		XebiaCreator.getXebiaJavaBean().setTraineeId(2);
		XebiaCreator.getXebiaJavaBean().setTraineeName("Ishita");
		System.out.println("XebiaSpeedThread:" + XebiaCreator.getXebiaJavaBean().getTraineeName());

		XebiaCreator.getXebiaJavaBean().setTraineeId(2);
		XebiaCreator.getXebiaJavaBean().setTraineeName("Ishita");
		System.out.println("XebiaSpeedThread:" + XebiaCreator.getXebiaJavaBean().getTraineeName());

		XebiaCreator.getXebiaJavaBean().setTraineeId(2);
		XebiaCreator.getXebiaJavaBean().setTraineeName("Ishita");
		System.out.println("XebiaSpeedThread:" + XebiaCreator.getXebiaJavaBean().getTraineeName());

		XebiaCreator.getXebiaJavaBean().setTraineeId(2);
		XebiaCreator.getXebiaJavaBean().setTraineeName("Ishita");
		System.out.println("XebiaSpeedThread:" + XebiaCreator.getXebiaJavaBean().getTraineeName());

		XebiaCreator.getXebiaJavaBean().setTraineeId(2);
		XebiaCreator.getXebiaJavaBean().setTraineeName("Ishita");
		System.out.println("XebiaSpeedThread:" + XebiaCreator.getXebiaJavaBean().getTraineeName());
	}
}
