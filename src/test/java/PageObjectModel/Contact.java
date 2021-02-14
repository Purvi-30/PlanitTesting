package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Contact {
	WebDriver driver;
	By submit_button = By.xpath("//a[text()='Submit']"); 
	By forename_error = By.id("forename-err");
	By email_error = By.id("email-err");
	By message_error = By.id("message-err");
	By txt_forename = By.id("forename");
	By txt_email = By.id("email");
	By txt_message = By.id("message");
	By no_error_message = By.xpath("//div[@class= 'alert alert-info ng-scope']");
	
	public Contact(WebDriver driver) {
		this.driver = driver;	
	}
	
	public void clickOnSubmit() {
				driver.findElement(submit_button).click();
	}
	
	public void validateError() {
		System.out.println(driver.findElement(forename_error).getText());
		System.out.println(driver.findElement(email_error).getText());
		System.out.println(driver.findElement(message_error).getText());
	}
	
	public void enterValidMandatoryField() {
		driver.findElement(txt_forename).sendKeys("Test");
		driver.findElement(txt_email).sendKeys("Test@test.com");
		driver.findElement(txt_message).sendKeys("It was a nice experience during shopping");
		}
	
	public void validateNoError() {
		driver.findElement(no_error_message).isDisplayed();
	}

	public void enterInvalidMandatoryField() {
		driver.findElement(txt_forename).sendKeys(" ");
		driver.findElement(txt_email).sendKeys("Test");
		driver.findElement(txt_message).sendKeys(" ");
		}

}
