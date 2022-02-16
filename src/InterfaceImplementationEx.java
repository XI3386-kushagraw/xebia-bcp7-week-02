class ConsoleMessage implements InterfaceEx
{
	public void init()
	{
		System.out.println("Overridden init method");
	}
	public void printMessage(String message)
	{
		System.out.println(message);
	}
}

class LoggerMessage implements InterfaceEx
{
	public void printMessage(String message)
	{
		System.out.println(message);
	}
}

public class InterfaceImplementationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterfaceEx consoleMessage = new ConsoleMessage();
		consoleMessage.printMessage("Console Message");
		consoleMessage.init();
		
		InterfaceEx loggerMessage = new LoggerMessage();
		loggerMessage.printMessage("Logger Message");
		loggerMessage.init();
		
		InterfaceEx.staticMethod();
	}

}
