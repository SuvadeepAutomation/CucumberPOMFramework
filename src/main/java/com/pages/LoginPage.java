package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	
	private By email=By.id("email");
	private By password=By.id("passwd");
	private By SignIn=By.id("SubmitLogin");
	private By forgetPassword=By.linkText("Forgot your password?");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public String getLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean isForgetPwdLinkExist()
	{
		return driver.findElement(forgetPassword).isDisplayed();
	}
	
	
	public void enterUserName(String usr)
	{
		driver.findElement(email).sendKeys(usr);
	}
	
	public void enterPassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void signIn()
	{
		driver.findElement(SignIn).click();
	}
	
	
	
	
	public AccountsPage doLogin(String un,String pwd)
	{
		System.out.println("Login with : "+un+" and "+pwd);
		driver.findElement(email).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(SignIn).click();
		return new AccountsPage(driver);
	}
	
	
	
}
