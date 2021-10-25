package TestDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefintionLogin {
	public static WebDriver driver;
	
	@Given("user is on homepage")
	public void user_is_on_homepage() {
		System.setProperty("webdriver.chrome.driver", "C://Users//adarsha.nair//Documents//jars//chromedriver.exe");	
		driver = new ChromeDriver(); 
		driver.get("http://demowebshop.tricentis.com");
	   
	}

	@When("user navigates to Login Page")
	public void user_navigates_to_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user enters username and Password")
	public void user_enters_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("username label is displayed")
	public void username_label_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
