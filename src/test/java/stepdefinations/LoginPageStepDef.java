package stepdefinations;

import org.junit.Assert;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDef {

	
	private String title;
	private LoginPage loginPage=new LoginPage(DriverFactory.getDriver());
	
	/**
	 * Verify the login page title 
	 * 
	 */
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws InterruptedException  {
		
		DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");	

	}

	@When("^user gets the title of the page$")
	public void user_gets_the_title_of_the_page()
	{
		title=loginPage.getLoginPageTitle();
		System.out.println("Page title is :"+title);
	}

	@Then("^page title should be \"(.*?)\"$")
	public void page_title_should_be(String expectedTitle) {

		Assert.assertTrue(title.contains(expectedTitle));
	}


	@Then("^forgot your password link should be displayed$")
	public void forgot_your_password_link_should_be_displayed()  {
		
		Assert.assertTrue(loginPage.isForgetPwdLinkExist());
	}

	@When("^user enters username \"(.*?)\"$")
	public void user_enters_username(String usr)  
	{
		loginPage.enterUserName(usr);
	}

	@When("^user enters password \"(.*?)\"$")
	public void user_enters_password(String pwd) {
	
		loginPage.enterPassword(pwd);
	}

	@When("^user clicks on Login button$")
	public void user_clicks_on_Login_button() {
		loginPage.signIn();
	}

	

	
	
	
}
