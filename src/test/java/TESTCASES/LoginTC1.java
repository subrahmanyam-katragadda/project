package TESTCASES;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import PAGES.HomePage;
import PAGES.LoginPage;

public class LoginTC1 {
	
	WebDriver driver;
	
	@BeforeTest
	
	public void beforetest() {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com");
		
		
	}

	
	@Test
	
	public void test() throws InterruptedException, IOException {
		
        HomePage home = new HomePage(driver);
		
		
		
		LoginPage login = new LoginPage(driver);
		
		
		
		
		Thread.sleep(3000);
		login.enterUsername("standard_user");
		Thread.sleep(3000);
		login.enterPassword("secret_sauce");
		Thread.sleep(3000);
		login.clickLogin();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File file=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\MY PC\\eclipse-workspace\\LIVEPROJECT\\screenshots\\loginpage.png"));
		
	}
	
	@AfterTest
	
	public void aftertest() {
		
		driver.quit();
	}
	
	
}
