package pagePackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
WebDriver driver;
	
	//Validate the user can click Home option in Hamburger button
//validate user can click shop now button
//validate user can move to previous page when back button is clicked
	
	 @FindBy(xpath="//*[@id=\"SiteHeader\"]/div[1]/div/div[1]/div")
	 WebElement hamburger;
	 
	 @FindBy(xpath="//*[@id=\"NavDrawer\"]/div/div[2]/ul[1]/li[1]")
	 WebElement home;
	 
	 @FindBy(xpath="//*[@id=\"shopify-section-template--15725862944829__4bf0bc83-6827-4564-a3d9-6774c0c86002\"]/div/div/div/div/div/div/a")
	 WebElement shopnow;
	 
	
	
	 
	 public HomePage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	 
		
		public void homeClick() {
			hamburger.click();
			home.click();
		}
		
		public void scrollDown() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,450)", "");
			System.out.println("Scroll down");
		}
		
		public void shopClick() {
			shopnow.click();
			
		}
		public void scrollUpButton() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,-350)", "");
			System.out.println("ScrollUp");
		}
		
		public void backPage() {
			driver.navigate().back();
		}

}
