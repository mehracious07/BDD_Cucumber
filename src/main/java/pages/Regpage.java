package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Regpage {
private WebDriver driver;

public Regpage(WebDriver driver) {
	this.driver=driver;
}

private By usernameInput = By.xpath("//input[@id='name']");
private By emailInput = By.xpath("//input[@id='email']");
private By genderInput=By.xpath("//input[@id='gender']");
private By mobileNumber=By.xpath("//input[@id='mobile']");
private By DOB=By.xpath("//input[@id='dob']");
private By Subjects=By.xpath("//input[@id='subjects']");
private By Hobbies=By.xpath("//input[@id='hobbies']");
private By Upload=By.xpath("//input[@id='picture']");
private By currentAddress=By.xpath("//textarea[@id='picture']");
private By city = By.xpath("//select[@id='city']");
private By state = By.xpath("//select[@id='state']");
private By button=By.xpath("//input[@value='Login']");

//public void enterDetails() {
//	driver.findElement(usernameInput).sendKeys("Sanjay Singh Mehara");
//	driver.findElement(emailInput).sendKeys("mehrasanjay619@gmail.com");
//	driver.findElement(genderInput).click();
//	driver.findElement(mobileNumber).sendKeys("000000000000");
//	driver.findElement(DOB).sendKeys("15-07-2001");
//	driver.findElement(Hobbies).sendKeys("Footbal,Singing");
//	driver.findElement(Subjects).sendKeys("Maths,Computer Science");
//	driver.findElement(Upload).sendKeys("C:\\Users\\my pc\\OneDrive\\Desktop\\Aadhar.pdf");
//	driver.findElement(currentAddress).sendKeys("Naintal,Uttarakhand");
//	driver.findElement(button).click();
//}
public void enterName(String name) {
    driver.findElement(usernameInput).sendKeys(name);
}

public void enterEmail(String email) {
    driver.findElement(emailInput).sendKeys(email);
}

public void selectGender(String gender) {
    driver.findElement(genderInput).click();
}

public void enterMobile(String mobile) {
    driver.findElement(mobileNumber).sendKeys(mobile);
}

public void enterDOB(String dob) {
    driver.findElement(DOB).sendKeys(dob);
}

public void enterHobbies(String hobbies) {
    driver.findElement(Hobbies).sendKeys(hobbies);
}

public void enterSubjects(String subjects) {
    driver.findElement(Subjects).sendKeys(subjects);
}

public void uploadFile(String filePath) {
    driver.findElement(Upload).sendKeys(filePath);
}

public void enterAddress(String address) {
    driver.findElement(currentAddress).sendKeys(address);
}

public void selectCity(String cityName) {
   Select selectCity = new Select(driver.findElement(city));
   selectCity.selectByVisibleText(cityName);
}

public void selectState(String stateName) {
    Select selectState = new Select(driver.findElement(state));
    selectState.selectByVisibleText(stateName);
}

public void clickSubmit() {
    driver.findElement(button).click();
}

public void verifyRegistrationSuccess() {
    System.out.println("✅ Registration Successful!");
}
}
