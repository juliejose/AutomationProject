package pagePackage2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Return {
WebDriver driver;
	
	//Validate the user can return product
	
	 @FindBy(xpath="//*[@id=\"SiteHeader\"]/div[1]/div/div[1]/div")
	 WebElement hamburger;
	 
	 @FindBy(xpath="//*[@id=\"NavDrawer\"]/div/div[2]/ul[1]/li[22]/a")
	 WebElement retur;
	 
	 @FindBy(xpath="//*[@id=\"return_page_1\"]/div/div/div/div/div/div[1]/input")
	 WebElement orderId;
	 
	 @FindBy(xpath="//*[@id=\"return_page_1\"]/div/div/div/div/div/div[2]/input")
	 WebElement emailId;
	
	 @FindBy(xpath="//*[@id=\"return_page_btn\"]")
	 WebElement reqbut;
	
	 
	 public Return(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	 
		
		public void returnClick() {
			hamburger.click();
			retur.click();
		}
		
		
		public void retDetails() {
			orderId.sendKeys("dsaff12");
			emailId.sendKeys("fgg@gmail.com");
			reqbut.click();
			System.out.println("retun clicked");
			
		}
	
}
