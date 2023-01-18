package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Selectoneitem {
	
	WebDriver driver;
	
	public Selectoneitem(WebDriver driver) {
		
		this.driver = driver;
	}
	
	By saucelabsbag = By.xpath("//*[@id=\"item_4_img_link\"]/img");
	
	By addtocartclick = By.id("add-to-cart-sauce-labs-backpack");
	
	By clickbacktoproducts = By.id("back-to-products");
	
	
	public void selectitem() {
		
		driver.findElement(saucelabsbag).click();
	}
	
	public void cart() {
		
		driver.findElement(addtocartclick).click();
	}
	
	public void toproducts() {
		
		driver.findElement(clickbacktoproducts).click();
	}

}
