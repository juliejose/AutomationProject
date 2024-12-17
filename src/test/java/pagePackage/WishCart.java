package pagePackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishCart {
	WebDriver driver;
	//Validating the wish list icon is clicked and view product
	//Validating the product in wishlist can be added to cart which should view in cart page
	 
	 @FindBy(xpath="//*[@id=\"SiteHeader\"]/div[1]/div/div[3]/div/div/wishlist-link/wk-button")
	 WebElement wishIcon;
	 
	
	 @FindBy(xpath="//*[@id=\"MainContent\"]/wishlist-page/section/div[2]/div/wishlist-product-card/div/form/button")
	 WebElement addCart;
	
	 @FindBy(xpath="/html/body/div[2]/div/div[1]/div[2]/div[2]/div/div/header/div[1]/div/div[3]/div/div/a[3]")
	 WebElement cartIcon;
	
	
	 
	 public WishCart(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	 
		
		public void wishIconClick() {
			
			wishIcon.click();
		}
		
		public void addcartList() {
			addCart.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
			cartIcon.click();
			
		}
		
		
}
