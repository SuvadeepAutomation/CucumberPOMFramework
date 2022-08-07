package stepdefinations;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.pages.AccountsPage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountsPageStepDef {
	
	
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private AccountsPage accountsPage;
	private String title;
	
	@Given("^user has already logged in to application$")
	public void user_has_already_logged_in_to_application(DataTable credTable) {
		
		List<Map<String, String>> credList = credTable.asMaps();
		String userName = credList.get(0).get("username");
		String password = credList.get(0).get("password");

		DriverFactory.getDriver()
				.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		accountsPage = loginPage.doLogin(userName, password);

	  
	}

	@Given("^user is on Accounts page$")
	public void user_is_on_Accounts_page(){
		
		String title = accountsPage.getAccountsPageTitle();
		System.out.println("Accounts Page title is: " + title);
	}

	@When("^user gets the title of the page$")
	public void user_gets_the_title_of_the_page_account() {

		title = accountsPage.getAccountsPageTitle();
		System.out.println("Accounts Page title is: " + title);
	
	}

	@Then("^page title should be \"(.*?)\"$")
	public void page_title_should_be(String expectedTitle) {
	   Assert.assertTrue(title.contains(expectedTitle));
	}




}
