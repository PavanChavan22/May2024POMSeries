package SeleniumSession;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
	
		//open Chrome Browser
		ChromeDriver driver =new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		//EdgeDriver driver =new EdgeDriver();
		//Enter the url
		driver.get("https://www.google.com");
		//actual vs Expected: Validation CheckPoint
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Google")) {
			System.out.println("Title is correct");
		}else {
			System.out.println("Title is Not Correct");
		}
		//Automation Step + Validation/Assertion Point = Automation Testing
		//Close the Browser
		driver.quit();
		

	}

}
