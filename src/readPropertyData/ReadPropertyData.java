package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyData {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./data/config.properties");
		
		//read data from property file 
		Properties prop = new Properties();
		prop.load(fis); //make the property file read
		
		String password=prop.getProperty("password");
		System.out.println(password);
	}
}
