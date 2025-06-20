package Test;

import org.testng.annotations.Test;

import base.BaseTest;
import page.LoginPage;
import util.ExtentReportManager;
import utils.Log;



public class LoginTestcase1 extends BaseTest{
	
	@Test
	public void loginpagecase() {
		
		test= ExtentReportManager.createTest("The Login Testcase1");
		
		LoginPage loginpage1 = new LoginPage(driver);
		Log.info("I am in LogTestcase1");
		loginpage1.enterusername("admin@yourstore.com");
		loginpage1.enterpassword("admin");
		loginpage1.Loginbutton();
		Log.info("Page open");
	}

}
