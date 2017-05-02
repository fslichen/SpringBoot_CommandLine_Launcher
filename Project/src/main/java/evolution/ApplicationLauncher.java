package evolution;

public class ApplicationLauncher {
	public static void main(String[] args) {
		String[] arguments = new String[1];
		if (System.currentTimeMillis() % 2 == 0) {
			System.out.println("Use port number from application.properties.");
			arguments[0] = "";
		} else {
			System.out.println("Use port number from command line.");
			arguments[0] = "--server.port=8001";// Overrides application.properties
		}
		Application.main(arguments);
	}
}
