package TESTCASES;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import PAGES.LoginPage;
import PAGES.DropDownpage;

public class DropDownTC_1 {
	
	WebDriver driver;
	
	@BeforeTest
	
	public void beforetest() {
		
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
	}

    @Test
    
public void test() throws InterruptedException {
		
        
		
		
		
		LoginPage login = new LoginPage(driver);
		
		
		
		
		Thread.sleep(3000);
		login.enterUsername("standard_user");
		Thread.sleep(3000);
		login.enterPassword("secret_sauce");
		Thread.sleep(3000);
		login.clickLogin();
	
    }
    
    @Test
    
     public void test1() throws InterruptedException {
		
		
		DropDownpage down = new DropDownpage(driver);
		
		down.down1();
		
    }
		
		@Test
		
		public void test2() throws InterruptedException {
			
			DropDownpage down1 = new DropDownpage(driver);
			
			down1.down2();
		}
		
		@Test
		
		public void test3() throws InterruptedException {
			
			DropDownpage down2 = new DropDownpage(driver);
			
			down2.down3();
		}
		
		@Test
		
		public void test4() throws InterruptedException {
			
			DropDownpage down3 = new DropDownpage(driver);
			
			down3.down4();
		}
		
		@AfterTest
		
		public void aftertest() {
			
			driver.quit();
		}
		
		
		
		
		
		
		
	




}




	 
		
	
	
	
	  
	  

