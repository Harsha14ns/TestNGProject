package com.Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_class {
	public WebDriver driver;
	public WebDriver driver_initialization() throws IOException {
		Properties prop = new Properties();//properties is java class
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Selenium_Testng_Framework\\src\\main\\java\\com\\Resources\\Data.properties");
		prop.load(fis);
		String BrowserName= prop.getProperty("Browser");
		if(BrowserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
		}
		else if(BrowserName.equals("irefox")) {
			//firefox code
		}
		else if(BrowserName.equals("IE")) {
			//InternetExplorer code
		}
		return driver;
	}
}
