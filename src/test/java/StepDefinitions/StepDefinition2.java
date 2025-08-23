package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.DriverFactory;

public class StepDefinition2 {

    private WebDriver driver;

    // ✅ Constructor gets driver once for this scenario
    public StepDefinition2() {
        this.driver = DriverFactory.getDriver();
    }

    @Given("the user is on the login page of site2")
    public void the_user_is_on_the_login_page_of_site2() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("user enters site2 username {string}")
    public void user_enters_site2_username(String username) {
        driver.findElement(By.id("user-name")).clear();
        driver.findElement(By.id("user-name")).sendKeys(username);
    }

    @When("user enters site2 password {string}")
    public void user_enters_site2_password(String password) {
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @When("clicks the login button of Sauce_demo")
    public void clicks_the_login_button_of_sauce_demo() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("{string} should be displayed for site2")
    public void should_be_displayed_for_site2(String expectedResult) {
        if (expectedResult.equals("Dashboard")) {
            Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));
        } else {
            String actualMsg = driver.findElement(By.cssSelector("h3[data-test='error']")).getText();
            Assert.assertTrue(actualMsg.contains(expectedResult));
        }
    }

}
