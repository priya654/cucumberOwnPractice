package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTests {
	public static WebDriver driver;

	
	@Given("^User is on Home Page$")
	public void user_is_on_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:/Users/priyrai/software/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/");

	}

	@When("^User Navigate to LogIn Page$")
	public void user_navigate_to_login_page() throws Throwable {
		driver.findElement(By.xpath("//a[@class='login']")).click();
	}

	@And("^User enters UserName and Password$")
	public void user_enters_username_and_password() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("priyanka.rai@capgemini.com");
		driver.findElement(By.id("passwd")).sendKeys("pass@123");
		driver.findElement(By.id("SubmitLogin")).click();
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_login_successfully() throws Throwable {
		System.out.println("Login Successfully");

	}

	@When("^User LogOut from the Application$")
	public void user_logout_from_the_application() throws Throwable {
		driver.findElement(By.xpath("//a[@class='logout']")).click();

	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_logout_successfully() throws Throwable {
		System.out.println("LogOut Successfully");

	}
   

}
