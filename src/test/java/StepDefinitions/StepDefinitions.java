package StepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginpage;
import utils.DriverFactory;

public class StepDefinitions{
	WebDriver driver;
	loginpage lp;
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
		driver=DriverFactory.getDriver();
		lp=new loginpage(driver);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   driver.manage().window().maximize();
	}

	@When("user enters a valid username")
	public void user_enters_a_valid_username() {
	    
	}

	@When("user enters a valid password")
	public void user_enters_a_valid_password() {
	    
	  
	}

	@When("clicks the login button")
	public void clicks_the_login_button() {
	   
	}

	@Then("the user should be redirected to the Dashboard")
	public void the_user_should_be_redirected_to_the_dashboard() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user enters an invalid username")
	public void user_enters_an_invalid_username() {
	   
	}

	@When("user enters an invalid password")
	public void user_enters_an_invalid_password() {
	
	}

	@Then("an error message Invalid Credentials should be displayed")
	public void an_error_message_invalid_credentials_should_be_displayed() {
	
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
	 
	}

	@Then("user should see {string}")
	public void user_should_see(String string) {
	    
	}
}