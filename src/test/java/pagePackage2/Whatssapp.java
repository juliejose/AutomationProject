package pagePackage2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Whatssapp {
WebDriver driver;
	
	//Validate the user can track product
	
	 @FindBy(xpath="//*[@id=\"wa-chat-btn-root\"]/div")
	 WebElement appbut;
	 @FindBy(xpath="//*[@id=\"SiteHeader\"]/div[1]/div/div[1]/div")
	 WebElement hamburger;
	 
	 @FindBy(xpath="//*[@id=\"NavDrawer\"]/div/div[2]/ul[1]/li[1]")
	 WebElement home;
	 
	
	
	 
	 public Whatssapp(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	 
		
		public void appClick() {
			hamburger.click();
			home.click();
			System.out.println("home");
			String parent=driver.getWindowHandle();
			System.out.println("PArent window title:"+driver.getTitle());
			appbut.click();
			System.out.println("home");
			Set<String> allwindows=driver.getWindowHandles();
			for(String handle: allwindows) {
				if(!handle.equalsIgnoreCase(parent)) {
					driver.switchTo().window(handle);
					
					driver.close();
				}
				driver.switchTo().window(parent);
			}
			
		}
		
		
	
}
