package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Steps {
	
	WebDriver driver;
	
	@Given("the user is on the ecommerce login page")//should be same as feature file
	public void navigateToLoginPage() {
		driver = new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	 
	}

	@When("the user enter valid credentials\\(username: {string}, password: {string})")
	public void the_user_enter_valid_credentials_username_password(String user, String pwd) {
	   driver.findElement(By.xpath("//input[@name='username']")).sendKeys(user);
	   driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
	   
	}

	@When("and the user click on login button")
	public void and_the_user_click_on_login_button() {
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	    
	}

	
	@Then("the user should be redirected to the my account page")
	public void the_user_should_be_redirected_to_the_my_account_page() {
		boolean	status= driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']")).isDisplayed();
		Assert.assertEquals(status, true);
	}

	@Then("the user should see a welcome message")
	public void the_user_should_see_a_welcome_message() {
	    boolean profpic = driver.findElement(By.xpath("//span/img[@alt='profile picture']")).isDisplayed();
	    Assert.assertEquals(profpic, true);
	    driver.quit();
	    
	}

}
