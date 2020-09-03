package pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SupportLibraries.BaseClass;
import SupportLibraries.InvokeBrowser;

public class GooglePage extends BaseClass{
	
	public WebDriver driver = null;
	
	public GooglePage(){
		driver=InvokeBrowser.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	
	public void openBrowser() throws Exception{
		String url = getPropertiesFromConfig("ApplicationUrl");
		driver.get(url);
	}

	@FindBy(xpath = "//*[@class='gLFyf gsfi']")
	WebElement searchLocator;
	
	@FindBy(xpath = "//*[contains(text(),'Home | JPMorgan')]")
	WebElement Toplink;
	
	@FindBy(xpath = "//*[@id='top']/div[2]/a/img")
	WebElement JpmcLogo;

	public void searchKeyword(String KeyWord) throws InterruptedException{
		searchLocator.sendKeys(KeyWord);
		searchLocator.sendKeys(Keys.ENTER);	
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	public void navigateJPMCPage() throws InterruptedException {
		Toplink.click();
		Thread.sleep(10000);
		boolean logo=JpmcLogo.isDisplayed();
		if (logo) {
			System.out.println("JPMC LOGO IS DISPLYED");
			assert true;
		} else {
			System.out.println("JPMC LOGO IS NOT DISPLYED ::: due to reloading issue r clicked wrong URL");
			assert false;
		}
		driver.quit();
	}
}
