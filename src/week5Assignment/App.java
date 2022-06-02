package week5Assignment;

public class App {

	public static void main(String[] args) {
		
		Logger asteriskLogger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger();
		
		asteriskLogger.log("Hello");
		asteriskLogger.error("myerror");
		
		
		spacedLogger.log("spaced");
		spacedLogger.error("spaceerror");

	}

}
