package pagePackage2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Faq {
WebDriver driver;
	
	//Validate the user can track product
	
	 @FindBy(xpath="//*[@id=\"shopify-section-template--15725862944829__1643998533e5c1f033\"]/div/div[2]/div/button/span[1]")
	 WebElement faqbut;
	 
	
	
	 
	 public Faq(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	 
	
	 
		
		public void faqClick() {
			faqbut.click();
		}
		
		
}
