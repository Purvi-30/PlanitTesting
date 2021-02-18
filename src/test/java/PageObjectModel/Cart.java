package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cart {

	WebDriver driver;
	By item_1 = By.xpath("//img[@ng-src = 'images/src-embed/cow.jpg']");
	By item_2 = By.xpath("//img[@ng-src = 'images/src-embed/bunny.jpg']");
	By qunatity_item_1 = By.xpath("//input[@value = 2]");
	By qunatity_item_2 = By.xpath("//input[@value = 1]");
	By checkout_btn = By.xpath("//a[text()='Check Out']");
	
	public Cart(WebDriver driver) {
		this.driver = driver;
		
	}

public void itemDisplayed() {
	WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(checkout_btn));
	driver.findElement(item_1).isDisplayed();
	driver.findElement(item_2).isDisplayed();
	driver.findElement(qunatity_item_1).isDisplayed();
	driver.findElement(qunatity_item_2).isDisplayed();
}	
}