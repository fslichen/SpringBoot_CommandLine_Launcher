package evolution;

public class ApplicationLauncher {
	public static void main(String[] args) {
		String[] arguments = new String[1];
		arguments[0] = "--server.port=8001";// Overrides application.properties
		Application.main(arguments);
	}
}
