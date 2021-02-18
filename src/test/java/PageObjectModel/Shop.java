package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Shop {

	WebDriver driver;

	By FunnyCow = By.xpath("//h4[text()='Funny Cow']//following-sibling::p/a");
	By FluffyBunny = By.xpath("//h4[text()='Fluffy Bunny']//following-sibling::p/a");
	By cart_menu = By.xpath("//a[@href='#/cart']");

	public Shop(WebDriver driver) {
		this.driver = driver;
	}

	public void addItemTwice() {
		driver.findElement(FunnyCow).click();
		driver.findElement(FunnyCow).click();
	}	

	public void addItemOnce() {
		driver.findElement(FluffyBunny).click();
	}

	public void clickCartMenu() {
		driver.findElement(cart_menu).click();
	}
}
