package pagePackage2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Logo {
WebDriver driver;
	
	//Validate the user can track product
	
	 @FindBy(xpath="//*[@id=\"SiteHeader\"]/div[1]/div/div[2]/h1/a/image-element[1]/img")
	 WebElement logobut;
	 
	
	
	 
	 public Logo(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	 
	
	 
		
		public void logoClick() {
			
			boolean b=logobut.isDisplayed();
			Assert.assertTrue(b);
		}
		
}
