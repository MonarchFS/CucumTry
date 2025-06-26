package StepDefinitions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps {
	
	WebDriver driver;
	
	@Given("user is on loginPage")
	public void user_is_on_login_page() {
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadTimeout(Duration.ofSeconds(8));
		driver= new ChromeDriver(options);
		System.out.println("Step 1: User is at Login page.");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	    
	}

	//@When("^user enters \"(.*)\" and \"(.*)\"$")  // this regular expresssion for when scenario with parametirezd value from scenario directly in when statements 
	@When("^user enters (.*) and (.*)$") // this regular expresssion for when scenario with parametirezd value from scenario outline examples
	public void user_enters_username_and_password(String uname,String pwd) {
		
	   driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
	   driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
	   System.out.println("Step 2 User enters credentials.");
	}

	@And("click on login button")
	public void click_on_login_button() throws InterruptedException {
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		System.out.println("Step 3 User clicks login button.");
		Thread.sleep(3000);
	}

	@Then("user should land on home page")
	public void user_should_land_on_home_page() {
		System.out.println("Step 4: user lands on homepage");
		driver.close();
	   
	}
	

	@When("user enters credentials using Data Table")
	public void user_enters_credentials_using_data_table(DataTable dataTable) {
		//List of strings for datatable
		List<List<String>> data =dataTable.cells();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(data.get(0).get(0));//get0 row get0 coloumn 
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(data.get(0).get(1));
		System.out.println("Step 2 Usser enters credentials.");
	}




}
