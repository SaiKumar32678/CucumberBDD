package stepDefinitions;

import org.junit.Assert;

import com.pages.LoginPage;
import com.qa.Factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginPageSteps {
	private static String title;
	private LoginPage loginpage= new LoginPage(DriverFactory.getDriver());
	@Given("user is on login page")
	public void user_is_on_login_page() {
	   DriverFactory.getDriver().get("https://www.rahulshettyacademy.com/client");
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
	   title= loginpage.getLoginPageTitle();
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitlename) {
	    Assert.assertTrue(title.contains(expectedTitlename));
	}

	@Then("forgot your password link should be displayed")
	public void forgot_your_password_link_should_be_displayed() {
	    Assert.assertTrue(loginpage.isForgotPwdLinkExist());
	}

	@When("user enters username {string}")
	public void user_enters_username(String username) {
	    loginpage.enterUserName(username);
	}

	@When("user enters password {string}")
	public void user_enters_password(String pswd) {
	    loginpage.enterPassword(pswd);
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
	    loginpage.clickLogin();
	}

	


}
