package properties;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) {
		try {
			// create FileInputStream class object
			FileInputStream fis = new FileInputStream(".\\config1.properties");
			// create java.util.Properties class object
			Properties prop = new Properties();
			// load the properties file
			prop.load(fis);
			// read the properties from the properties file
			String url = prop.getProperty("url");
			String username = prop.getProperty("username", "admin");
			String password = prop.getProperty("password");
			String email = prop.getProperty("email");
			String browser = prop.getProperty("browser", "chrome");
			System.out.println("url = " + url + "\nusername = " + username + "\npassword = " + password + "\nemail  = "
					+ email + "\nbrowser = " + browser);
		} catch (Exception e) {

		}

	}

}
