package StepDefinition;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObjectModel.*;
import dataProvider.ConfigFileReader;
import io.cucumber.java.en.*;

public class PlanitDemo {

	WebDriver driver;
	Shop shop;
	Home home;
	Contact contact;
	ConfigFileReader configFileReader;

	@Given("browser is open")
	public void browser_is_open() {
		configFileReader= new ConfigFileReader();
		System.setProperty("webdriver.chrome.driver",configFileReader.getDriverPath());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@When("user enters Planit Demo website URL")
	public void user_enters_planit_demo_website_url() {
		driver.get(configFileReader.getApplicationUrl());
	}

	@Then("user is redirected to Home Page")
	public void user_is_redirected_to_home_page() {
		home = new Home(driver);
		driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
		home.isDisplayed();
	}

	@And("user clicks on contact menu")
	public void user_clicks_on_contact_menu() {
		home.clickOnContact();
	}

	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() {
		contact = new Contact(driver);
		contact.clickOnSubmit();
	}

	@Then("mandatory field errors are shown on the page")
	public void mandatory_field_errors_are_shown_on_the_page() throws InterruptedException {
		contact = new Contact(driver);
		contact.validateError();
	}

	@And("user populates correct data in all mandatory fields")
	public void user_populates_correct_data_in_all_mandatory_fields() {
		contact = new Contact(driver);
		contact.enterValidMandatoryField();
	}

	@Then("all errors are gone.")
	public void all_errors_are_gone() {
		contact.validateNoError();	
	}

	@Then("successful submission message is received")
	public void successful_submission_message_is_received() {
		driver.getPageSource().contains("Thanks " + "we appreciate your feedback");
	}

	@When("user enters incorrect data in all mandatory fields")
	public void user_enters_incorrect_data_in_all_mandatory_fields() {
		contact = new Contact(driver);
		contact.enterInvalidMandatoryField();
	}

	@And("user clicks on shop menu")
	public void user_clicks_on_shop_menu() {
		home.clickOnShop();
		driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
	}

	@When("user adds Funny Cow item twice times")
	public void user_adds_funny_cow_item_twice_times() {
		shop = new Shop(driver);
		shop.addItemTwice();	
	}

	@And("user adds Fluffy Bunny item once")
	public void user_adds_fluffy_bunny_item_once() {
		shop.addItemOnce();
	}

	@And("user clicks the cart menu")
	public void user_clicks_the_cart_menu() {
		driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
		shop.clickCartMenu();
	}

	@Then("all the added items are displayed in the cart")
	public void all_the_added_items_are_displayed_in_the_cart() {
		Cart cart = new Cart(driver);
		cart.itemDisplayed();
	}

	@And("browser is closed")
	public void browser_is_closed() {
		driver.close();
	}
}
