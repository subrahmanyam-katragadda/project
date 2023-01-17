package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;


	public LoginPage(WebDriver driver) {
        this.driver = driver;
	}
	
	
	By uName = By.id("user-name");
	
	
	By pswd = By.id("password");
	
	
	By loginBtn = By.id("login-button");
	
	
	
	public void enterUsername(String user) {
		driver.findElement(uName).sendKeys(user);
	}

	
	public void enterPassword(String pass) {
		driver.findElement(pswd).sendKeys(pass);
	}
	
	
	public void clickLogin() {
		driver.findElement(loginBtn).click();
		
		
		
	

}
	
}
