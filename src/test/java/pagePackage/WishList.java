package pagePackage;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class WishList {
	WebDriver driver;
	
	//Validating the product can be added to wish list after viewing the product
	
	
	
	 @FindBy(xpath="//*[@id=\"SiteHeader\"]/div[1]/div/div[1]/div")
	 WebElement hamburger;
	 
	 @FindBy(xpath="//*[@id=\"NavDrawer\"]/div/div[2]/ul[1]/li[4]/a")
	 WebElement choker;
	 
	 
	 
	 @FindBy(xpath="//*[@id=\"CollectionAjaxContent\"]/div/div/div[2]/div[3]/div/div[1]/div[2]/div[1]/div[1]/div/a")
	 WebElement chokerSelect;
	 
	@FindBy(xpath="/html/body/div[2]/div/main/div[1]/div/div/div/div[1]/div[2]/div/div[2]/div[6]/wishlist-button-block/wk-button/button")
	 WebElement wishList;
	 
	 
	 
	
	
	 
	 public WishList(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	 
		
		public void chokerClick() {
			hamburger.click();
			choker.click();
			System.out.println("choker clicked");
			chokerSelect.click();
			System.out.println("choker selected");
		}
		
		
		

		public void wishListClick() {
			wishList.click();
			
		}
		
		
		
}
