package exceptions;

public class TestCustomException {

	public void launchBrowser(String broweserName) throws InvalidBrowserException {
		broweserName = broweserName.toLowerCase();
		if (broweserName.equals("chrome")) {
			System.out.println("launching chrome browser");
		} else if (broweserName.equals("firefox")) {
			System.out.println("launching firefox browser");
		} else {
			throw new InvalidBrowserException("Browser name must be either chrome or firefox, not " + broweserName);
		}
	}

	public static void main(String[] args) {
		TestCustomException tc = new TestCustomException();
		try {
			tc.launchBrowser("safari");
		} catch (InvalidBrowserException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("browser launched");
	}

}
