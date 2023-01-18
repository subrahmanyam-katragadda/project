package TESTCASES;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import PAGES.LoginPage;
import PAGES.Selectoneitem;

public class SelectoneitemTC {
	
	WebDriver driver;
	
  @BeforeTest(description = "This TC Will Lunch The Browser")
	
	public void beforetest() {
	  
	  Reporter.log("=====Browser Session Started=======,true");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com");
		
		
	}

	
	@Test(description = "This Tc Will Perform Valid Login")
	
	public void test() throws InterruptedException, IOException {
		
        
		
		
		
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
		
		Reporter.log("=====Login Session Started=======,true");
	}
	
	@Test(description = "This TC will perform select one item to the cart")
	
	public void test1() throws InterruptedException, IOException {
		
		
		
		Selectoneitem item = new Selectoneitem(driver);
		
		item.selectitem();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File file=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\MY PC\\eclipse-workspace\\LIVEPROJECT\\screenshots\\bag.png"));
		Thread.sleep(3000);
		item.cart();
		TakesScreenshot ts1 = (TakesScreenshot)driver;
		File file1=ts1.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file1, new File("C:\\Users\\MY PC\\eclipse-workspace\\LIVEPROJECT\\screenshots\\cart.png"));
		Thread.sleep(3000);
		
		item.toproducts();
		TakesScreenshot ts3 = (TakesScreenshot)driver;
		File file3=ts3.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file3, new File("C:\\Users\\MY PC\\eclipse-workspace\\LIVEPROJECT\\screenshots\\back.png"));
		
		Reporter.log("===== Select One Item =======,true");
	}
	
	@AfterTest(description = "This TC perform Close the Browser")
	
	public void aftertest() {
		
		
		
		driver.quit();
		
		Reporter.log("===== Select One Item =======,true");
	}
	

}
