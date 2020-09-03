package SupportLibraries;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InvokeBrowser extends BaseClass{
	public static String browser = getPropertiesFromConfig("Browser");
	public static WebDriver driver;
	public static WebDriverWait wait = null;
	public static WebDriver getDriver() {		
		switch(browser){
		case "Chrome":
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\chromedriver.exe");
			driver = new ChromeDriver() ;
			break;
		case "IE":
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\IEDriver.exe");
			driver = new InternetExplorerDriver();
			break;
		case "Firefox":
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\chromedriver.exe");
			driver = new FirefoxDriver() ;
			break;
		}
		wait = new WebDriverWait(driver, 30);
		driver.manage().window().maximize();
		 return driver;
	}
}
