package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginStepDefination {
	public WebDriver driver;
	
	@Given("intialize chromedriver")
	public void intialize_chromedriver() {
		
		driver =new ChromeDriver();
	   
	}
	@When("user navigates to {string}")
	public void user_navigates_to(String url) {
		driver.get(url);
	    
	}
	@And("^user enter (.+) and (.+) and clicks on login button$")
	public void user_enter_username_and_secure123_and_click_on_login_button(String username, String password) {
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='Login']")).click();
	    
	}
	@Then("user should be able to login")
	public void user_should_be_able_to_login() {
	    
	}





}
