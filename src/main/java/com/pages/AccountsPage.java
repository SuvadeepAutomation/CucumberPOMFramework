package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountsPage {

	private WebDriver driver;
	
	private By accountSections = By.cssSelector("div#center_column span");

	public AccountsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public static void secondCommit()
	{
		System.out.println("This is my second commit");
		System.out.println("Third Modification");
	}
	
	
	public String getAccountsPageTitle()
	{
		return driver.getTitle();
	}
	
}

