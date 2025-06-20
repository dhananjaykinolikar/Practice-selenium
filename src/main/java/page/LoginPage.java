package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	private By Usernamebox = By.id("Email");
	private By passwordname = By.id("Password");
	private By Loginbutton = By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/div/form/div[3]/button");
	
	public LoginPage( WebDriver driver) {
		this.driver =driver;
	}
	
	public void enterusername(String username) {
		driver.findElement(Usernamebox).clear();
		driver.findElement(Usernamebox).sendKeys(username);
		
	}
	
	public void enterpassword(String password) {
		driver.findElement(passwordname).clear();
		driver.findElement(passwordname).sendKeys(password);
	}
	
	public void Loginbutton() {
		driver.findElement(Loginbutton).click();
		
	}
	

}
