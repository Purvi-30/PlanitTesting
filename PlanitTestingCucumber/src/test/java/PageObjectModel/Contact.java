package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import dataProvider.ExcelUtil;

public class Contact {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	ExcelUtil excel = new ExcelUtil(projectPath+"/excel/Input Test Data.xlsx", "Contact_Page");

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
		driver.findElement(txt_forename).sendKeys(excel.getCellDataString(1, 0));
		driver.findElement(txt_email).sendKeys(excel.getCellDataString(1, 2));
		driver.findElement(txt_message).sendKeys(excel.getCellDataString(1, 4));
	}

	public void validateNoError() {
		driver.findElement(no_error_message).isDisplayed();
	}

	public void enterInvalidMandatoryField() {
		driver.findElement(txt_forename).sendKeys(excel.getCellDataString(2, 0));
		driver.findElement(txt_email).sendKeys(excel.getCellDataString(2, 2));
		driver.findElement(txt_message).sendKeys(excel.getCellDataString(2, 4));
	}
}
