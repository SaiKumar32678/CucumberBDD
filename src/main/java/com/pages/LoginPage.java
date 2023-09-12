package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	//1.By locators
	private By emailId=By.id("userEmail");
	private By password=By.id("userPassword");
	private By singInButton=By.id("login");
	////a[@class='forgot-password-link']
	private By forgotPwdLink= By.linkText("Forgot password?");
	
	//2.Constructor of page class
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
	}
	//3. Page actions
	public String getLoginPageTitle() {
		return driver.getTitle();
		
	}
	public boolean isForgotPwdLinkExist() {
		return driver.findElement(forgotPwdLink).isDisplayed();
	}
	public void enterUserName(String username) {
		driver.findElement(emailId).sendKeys(username);
	}
	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	public void clickLogin() {
		driver.findElement(singInButton).click();
	}
	

}
