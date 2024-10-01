package SeleniumSession;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingConcept {

	public static void main(String[] args) {
		
		//1.Valid but Local--Only for Specific
		//ChromeDriver driver = new ChromeDriver();
		
		//2.Recommended & Valid-- Local
//		WebDriver driver = new ChromeDriver();
//		driver= new  FirefoxDriver();
		
		//3.Recommended & Valid for Remote Machine(Cloud,AWS,Server Machine)Grid
		//WebDriver driver = new RemoteWebDriver(remoteAddress,capabilities);
		
		//4.Valid But Not Recommended
		//SearchContext driver =new ChromeDriver();
		
		//5.Recommended & Valid
//		  RemoteWebDriver driver = new ChromeDriver();
//		  driver= new FirefoxDriver();
//		  driver = new EdgeDriver();
		  
		//6.Valid but Not Recommended (only For Edge/Chrome)
		//ChromiumDriver driver = new ChromeDriver();
		
		//7.Valid but Not Recommended
		//SearchContext driver= new RemoteWebDriver(remoteAddress,capabilities);
		
		//8.
		
		
		
		

	}

}
