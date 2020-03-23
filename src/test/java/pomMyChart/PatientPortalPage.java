package pomMyChart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PatientPortalPage {
	
	WebDriver driver;
	
	@Before 
	public void CallDriver() {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shapbnil\\Desktop\\Selenium\\chromedriver.exe");
	driver = new ChromeDriver();
	
	}
	
	@After()
		public void tearDown() {
		driver.quit();
	}
	
	
	@Given("^open browser$")
	public void open_browser() throws Throwable {
		driver.get("https://mychart.utsouthwestern.edu/mychart/Authentication/Login?");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@When("^user enter username$")
	public void user_enter_username() throws Throwable {
		driver.findElement(By.id("Login")).sendKeys("Mahmud");
	}

	@And("^user enter password$")
	public void user_enter_password() throws Throwable {
		driver.findElement(By.id("Password")).sendKeys("Mahmud");
	}

	@Then("^Click on SignIn Button$")
	public void click_on_SignIn_Button() throws Throwable {
		  driver.findElement(By.id("submit"));
		  
	}


}
