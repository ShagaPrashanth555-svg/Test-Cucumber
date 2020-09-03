package SupportLibraries;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class BaseClass {

	public static String getPropertiesFromConfig(String stKey)
	{
		String configData = null;
		try {
			File file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Settings.properties");
			FileInputStream fis = new FileInputStream(file);
			Properties properties = new Properties();
			properties.load(fis);
			configData = properties.getProperty(stKey);
		} catch (Exception e) {
			System.out.println("getPropertiesFroConfig() method not executed"+e);
		}
		return configData;
	}
	
}
