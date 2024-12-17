package pagePackage2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrackOrder {
WebDriver driver;
	
	//Validate the user can track product
	
	 @FindBy(xpath="//*[@id=\"SiteHeader\"]/div[1]/div/div[1]/div")
	 WebElement hamburger;
	 
	 @FindBy(xpath="//*[@id=\"NavDrawer\"]/div/div[2]/ul[1]/li[23]")
	 WebElement trackord;
	 
	 @FindBy(xpath="//*[@id=\"typeEmailX-2\"]")
	 WebElement ordernum;
	 
	 @FindBy(xpath="//*[@id=\"typePasswordX-2\"]")
	 WebElement emailId;
	
	 @FindBy(xpath="//*[@id=\"tygh_main_container\"]/div/div/div/div/div/div/div[2]/div/div/form/div/div/button")
	 WebElement trackbut;
	
	 
	 public TrackOrder(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	 
		
		public void trackClick() {
			hamburger.click();
			trackord.click();
		}
		
		
		public void trackDetails() {
			ordernum.sendKeys("dsaff12");
			emailId.sendKeys("fgg@gmail.com");
		 trackbut.click();
			
		}
		public void backTwo() {
			driver.navigate().back();
			driver.navigate().back();
			driver.navigate().back();
		}
	
}
