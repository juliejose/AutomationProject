package pagePackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Paging {
WebDriver driver;
	
	//Validate the user can click budgetstore option in Hamburger button
//validate user can click next pg, previous pg, particular page
//Validating the screen can be scrolled down and up
	
	 @FindBy(xpath="//*[@id=\"SiteHeader\"]/div[1]/div/div[1]/div")
	 WebElement hamburger;
	 
	 @FindBy(xpath="//*[@id=\"NavDrawer\"]/div/div[2]/ul[1]/li[16]")
	 WebElement budgetstore;
	 
	 @FindBy(xpath="//*[@id=\"CollectionAjaxContent\"]/div/div/div[2]/div[3]/div/div[2]/span[6]/a")
	 WebElement nextpg;
	 
	 @FindBy(xpath="//*[@id=\"CollectionAjaxContent\"]/div/div/div[2]/div[3]/div/div[2]/span[5]/a")
	 WebElement forthpg;
	 
	 @FindBy(xpath="//*[@id=\"CollectionAjaxContent\"]/div/div/div[2]/div[3]/div/div[2]/span[1]/a/svg")
	 WebElement prevpg;
	
	
	 public Paging(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	    
	 
		
		public void storeClick() {
			hamburger.click();
			budgetstore.click();
		}
		
		public void scrollDown() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,6000)", "");
			System.out.println("Scroll down");
		}
		
		public void nxtpgClick() {
			nextpg.click();
			
		}
		
		public void pg4Click() {
			forthpg.click();	
		}
		public void scrollDown1() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,6000)", "");
			System.out.println("Scroll down");
		}
		public void prevpgClick() {
			prevpg.click();	
		}
		public void scrollUpButton() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,-5000)", "");
			System.out.println("ScrollUp");
		}
		
		
}
