package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {


	WebDriver driver;
	
	@BeforeMethod
	public void setupApplication() {
		
		Reporter.log("=====Browser Session Started=====", true);
		
		// open Chrome Browser
					System.setProperty("webdriver.chrome.driver", "C:\\Users\\shapbnil\\Desktop\\Selenium\\chromedriver.exe");
					driver = new ChromeDriver();
					driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
					driver.manage().window().maximize();
					
					Reporter.log("=====Application Started=====", true);
					
	}
	
	
	@AfterMethod
	public void closeApplication() {
		driver.quit();
		Reporter.log("=====Browser Session End=====", true);
		
		
	}

	
}
