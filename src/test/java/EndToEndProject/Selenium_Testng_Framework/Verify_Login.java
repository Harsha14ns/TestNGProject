package EndToEndProject.Selenium_Testng_Framework;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Page_Object_module.Login_Page_Object;
import com.Resources.Base_class;


public class Verify_Login extends Base_class {
	@Test( dataProvider="Getdata")
	public void Browser_launch(String Username, String Password) throws IOException, InterruptedException {
		driver =driver_initialization();
		driver.get("https://login.salesforce.com/?locale=eu");
		
		Login_Page_Object obj = new Login_Page_Object(driver);
		obj.getusername().sendKeys(Username);
		Thread.sleep(5000);
		obj.getpassword().sendKeys(Password);
		Thread.sleep(5000);
		obj.getlogin().click();
	}
	
	@DataProvider
	public Object[][]Getdata(){ //Getdata is dataprovider 
		Object[][]Get= new Object[2][2];
		Get[0][0]="Test1";//username
		Get[0][1]="1234";//password
		Get[1][0]="Test2";
		Get[1][1]="5678";
		return Get;
		
	}
}
