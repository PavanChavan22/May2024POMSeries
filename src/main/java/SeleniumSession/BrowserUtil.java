package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {
	
	WebDriver driver;
	
	/**
	 * This Method is Used to Initialize the Driver on the Basis of given Browser Name
	 * @param browserName
	 * @return this returns driver 
	 */
	public WebDriver initDriver(String browserName) {
		System.out.println("Browser Name"+ browserName );
		
		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "firefox":
			driver=new FirefoxDriver();
			break;
		case "edge":
			driver=new EdgeDriver();
			break;
		case "safari":
			driver=new SafariDriver();
			break;
		default:
			System.out.println("Please Pass the Right Browser--->>");
			throw new BrowserException("====INVALID Browser====");
		}
		return driver; //What is type of Driver that is WebDriver
		
	}
	
	public void launchUrl(String url) {
		if(url.indexOf("http") != 0 || url.length() == 0){ //https://google.com
			throw new BrowserException("http(s) is Missing in url");
		}
		driver.get(url);
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public String getPageUrl() {
		return driver.getCurrentUrl();
	}
	
	public void quitBrowser() {
		 driver.quit();
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	
}
