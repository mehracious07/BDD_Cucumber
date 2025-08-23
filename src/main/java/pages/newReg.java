package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class newReg {
    WebDriver driver;

    // Locators
    By firstName = By.name("firstName");
    By lastName = By.name("lastName");
    By phone = By.name("phone");
    By email = By.id("userName");
    By address = By.name("address1");
    By city = By.name("city");
    By state = By.name("state");
    By postalCode = By.name("postalCode");
    By country = By.name("country");
    By username = By.id("email");
    By password = By.name("password");
    By confirmPassword = By.name("confirmPassword");
    By submitBtn = By.name("submit");

    public newReg(WebDriver driver) {
        this.driver = driver;
    }

    public void fillFirstName(String value) { driver.findElement(firstName).sendKeys(value); }
    public void fillLastName(String value) { driver.findElement(lastName).sendKeys(value); }
    public void fillPhone(String value) { driver.findElement(phone).sendKeys(value); }
    public void fillEmail(String value) { driver.findElement(email).sendKeys(value); }
    public void fillAddress(String value) { driver.findElement(address).sendKeys(value); }
    public void fillCity(String value) { driver.findElement(city).sendKeys(value); }
    public void fillState(String value) { driver.findElement(state).sendKeys(value); }
    public void fillPostalCode(String value) { driver.findElement(postalCode).sendKeys(value); }

    public void selectCountry(String countryName) {
        Select countryDropdown = new Select(driver.findElement(country));
        countryDropdown.selectByVisibleText(countryName);
    }

    public void fillUsername(String value) { driver.findElement(username).sendKeys(value); }
    public void fillPassword(String value) { driver.findElement(password).sendKeys(value); }
    public void fillConfirmPassword(String value) { driver.findElement(confirmPassword).sendKeys(value); }

    public void submitForm() { driver.findElement(submitBtn).click(); }

    public String getConfirmationMessage() {
        return driver.getPageSource();
    }
}
