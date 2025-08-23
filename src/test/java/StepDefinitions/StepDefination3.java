package StepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Regpage;
import utils.DriverFactory;

public class StepDefination3 {
WebDriver driver ;
Regpage rp;

@Given("the user is on the registration page")
public void the_user_is_on_the_registration_page() {
	 driver=DriverFactory.getDriver();
	 rp=new Regpage(driver);
	 driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
}

@When("the user enters name {string}")
public void the_user_enters_name(String string) {
rp.enterName("Sanjay Singh Mehara");
}

@When("the user enters email {string}")
public void the_user_enters_email(String string) {
    rp.enterEmail("Mehrasanjay619@gmail.com");
}

@When("the user selects gender {string}")
public void the_user_selects_gender(String string) {
    rp.selectGender("Male");
}

@When("the user enters mobile number {string}")
public void the_user_enters_mobile_number(String string) {
   rp.enterMobile("0000000000000");
}

@When("the user enters date of birth {string}")
public void the_user_enters_date_of_birth(String string) {
 rp.enterDOB("15-07-2001");
}

@When("the user selects hobbies {string}")
public void the_user_selects_hobbies(String string) {
   rp.enterHobbies("Football,Singing");
}

@When("the user enters subjects {string}")
public void the_user_enters_subjects(String string) {
  rp.enterSubjects("CS,JAVA");
}

@When("the user uploads file {string}")
public void the_user_uploads_file(String string) {
    rp.uploadFile(string);
}

@When("the user enters current address {string}")
public void the_user_enters_current_address(String string) {
    rp.enterAddress("Nainital,Uttarakhand");
}

@When("the user selects city {string}")
public void the_user_selects_city(String string) {
   rp.selectCity(string);
}

@When("the user selects state {string}")
public void the_user_selects_state(String string) {
 rp.selectState(string);
}

@When("the user submits the registration form")
public void the_user_submits_the_registration_form() {
    rp.clickSubmit();
}

@Then("the registration should be successful")
public void the_registration_should_be_successful() {
	System.out.println("✅ Registration Successful!");
}
}
