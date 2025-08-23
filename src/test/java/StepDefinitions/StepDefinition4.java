package StepDefinitions;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pages.newReg;
import utils.DriverFactory;

import java.util.List;
import java.util.Map;

public class StepDefinition4 {

    WebDriver driver = DriverFactory.getDriver();
    newReg reg = new newReg(driver);

//    @Given("the user is on the registration page")
//    public void the_user_is_on_the_registration_page() throws InterruptedException {
//        driver.get("https://demo.guru99.com/test/newtours/register.php");
//        Thread.sleep(10000);
//    }

    @When("the user enters the following registration details:")
    public void the_user_enters_the_following_registration_details(io.cucumber.datatable.DataTable dataTable) {
        // Convert table to List of Maps
        List<Map<String, String>> users = dataTable.asMaps(String.class, String.class);

        // Assuming only 1 user for now
        Map<String, String> user = users.get(0);

        reg.fillFirstName(user.get("firstName"));
        reg.fillLastName(user.get("lastName"));
        reg.fillPhone(user.get("phone"));
        reg.fillEmail(user.get("email"));
        reg.fillAddress(user.get("address"));
        reg.fillCity(user.get("city"));
        reg.fillState(user.get("state"));
        reg.fillPostalCode(user.get("postalCode"));
        reg.selectCountry(user.get("country"));
        reg.fillUsername(user.get("username"));
        reg.fillPassword(user.get("password"));
        reg.fillConfirmPassword(user.get("confirmPassword"));
    }

//    @And("the user submits the registration form")
//    public void the_user_submits_the_registration_form() throws InterruptedException {
//    	Thread.sleep(1000);
//    	driver.findElement(By.xpath("//div[@class='cb-close']")).click();
//    	Thread.sleep(1000);
//        reg.submitForm();
//    }

    @Then("the registration confirmation page should be displayed")
    public void the_registration_confirmation_page_should_be_displayed() {
        reg.getConfirmationMessage();
    }
}
