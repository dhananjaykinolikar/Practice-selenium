package Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.BaseTest;
import page.LoginPage;
import util.ExcelUtils;
import util.ExtentReportManager;
import util.Log;




public class LoginTestcase1 extends BaseTest{

	@DataProvider(name="logindata")
	public Object[][] getlogindata() throws IOException {
		
		String filepath= System.getProperty("user.dir") +"/Testdata\\Testdata.xlsx";
		ExcelUtils.loadExcel(filepath,"Sheet1");
		int rowcount= ExcelUtils.getRowCount();
		Object[][] data = new Object[rowcount-1][2];
		
		for(int i=1; i<rowcount;i++) {
			data[i-1][0]=ExcelUtils.getCellData(i, 0);
			data[i-1][1]=ExcelUtils.getCellData(i, 1);
		}
		
		ExcelUtils.closeExcel();
		return data;
			
	}
	
	@Test
	@Parameters({"username","password"})  
	public void paramterloginpagecase(String username , String password) {
		
		test= ExtentReportManager.createTest("The Login Testcase1");
		
		LoginPage loginpage1 = new LoginPage(driver);
		Log.info("I am in paramterloginpagecase");
		loginpage1.enterusername(username);
		loginpage1.enterpassword(password);
		loginpage1.Loginbutton();
		Log.info("Page open");
	}

	
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

	
	
	@Test (dataProvider="logindata")
	public void excelloginpagecase(String username, String password) {
		
		test= ExtentReportManager.createTest("The Login Testcase1");
		
		LoginPage loginpage1 = new LoginPage(driver);
		Log.info("I am in excelloginpagecase");
		loginpage1.enterusername(username);
		loginpage1.enterpassword(password);
		loginpage1.Loginbutton();
		Log.info("Page open");
	}

	

}
