package myway2automation.rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
	
	
	public static void main(String args[]) throws IOException {
		
		Properties config= new Properties();
		Properties prop = new Properties();
		FileInputStream fin = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resource\\prorties\\config.properties");
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resource\\prorties\\config.properties");
		config.load(fin);
		prop.load(fis);

}
}