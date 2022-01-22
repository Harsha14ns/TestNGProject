package com.Page_Object_module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page_Object {
	
	public WebDriver driver;
	By Username = By.xpath("//input[@id='username']");
	By Password = By.xpath("//input[@name='pw']");
	By Login = By.xpath("//input[@id='Login']");
	
	public Login_Page_Object(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement getusername() {
		return driver.findElement(Username);
	}
	public WebElement getpassword() {
		return driver.findElement(Password);
	}
	public WebElement getlogin() {
		return driver.findElement(Login);
	}
}
