package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home {
	WebDriver driver;

	By shop_menu = By.xpath("//a[text()='Shop']");	
	By contact_menu = By.xpath("//a[text()='Contact']");
	By home_menu = By.xpath("//a[text()='Home']");
	By submit_button = By.xpath("//a[text()='Submit']"); 

	public Home(WebDriver driver) {
		this.driver = driver;	
	}

	public void clickOnContact() {
		driver.findElement(contact_menu).click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(submit_button));
	}

	public void clickOnShop() {
		driver.findElement(shop_menu).click();
	}

	public void isDisplayed() {
		driver.findElement(home_menu).isDisplayed();
	}

}
