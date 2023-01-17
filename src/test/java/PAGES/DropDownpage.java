package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownpage {
	
	WebDriver driver;
	
	public DropDownpage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	             By down = By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select");
	             
	             public void down1 () throws InterruptedException {
	            	 
	            	 driver.findElement(down).click();
	            	 
	            	 Select se = new Select(driver.findElement(down));
	            	 
	            	 se.selectByIndex(0);
	            	    }
	             
       public void down2 () throws InterruptedException {
	            	 
	            	 driver.findElement(down).click();
	            	 
	            	 Select se = new Select(driver.findElement(down));
	            	 
	            	 Thread.sleep(3000);
	            	 se.selectByIndex(1);
	            	 
}

       public void down3 () throws InterruptedException {
	 
	    driver.findElement(down).click();
	 
	     Select se = new Select(driver.findElement(down));
	 
	      Thread.sleep(3000);
	      se.selectByValue("lohi");

}

          public void down4 () throws InterruptedException {
	 
	        driver.findElement(down).click();
	 
	         Select se = new Select(driver.findElement(down));
	 
	          Thread.sleep(3000);
	          se.selectByValue("lohi");

}

}
