package pagePackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCart {
	WebDriver driver;
	
	//Validate the user can select Hamburger menu and click the best seller option which should navigate to correct page
	// validate the user can select color and add quantity of the product
	// validate the add to cart button and icon clickable or not
	
	
	 @FindBy(xpath="//*[@id=\"SiteHeader\"]/div[1]/div/div[1]/div")
	 WebElement hamburger;
	 
	 @FindBy(xpath="//*[@id=\"NavDrawer\"]/div/div[2]/ul[1]/li[2]/a")
	 WebElement bestSeller;
	 
	 @FindBy(xpath="//*[@id=\"CollectionAjaxContent\"]/div/div/div[2]/div[3]/div/div[1]/div[2]/div[1]/div[1]/div/a")
	 WebElement earring;
	 
	 @FindBy(xpath="//*[@id=\"ProductSelect-template--15725863370813__main-7158587949117-option-0\"]/div[2]/label")
	 WebElement color;
	 
	 @FindBy(xpath="//*[@id=\"ProductSection-template--15725863370813__main-7158587949117\"]/div/div/div[1]/div[2]/div/div[2]/div[4]/div/div/button[2]")
	 WebElement plus;
	
	 @FindBy(xpath="//*[@id=\"AddToCartForm-template--15725863370813__main-7158587949117\"]/div[1]/button")
	 WebElement addCart;
	
	 @FindBy(xpath="/html/body/div[2]/div/div[1]/div[2]/div[2]/div/div/header/div[1]/div/div[3]/div/div/a[3]")
	 WebElement cartIcon;
	
	
	 
	 public AddtoCart(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	 
		
		public void bestsellerClick() {
			hamburger.click();
			bestSeller.click();
		}
		
		public void addcartdetails() {
			earring.click();
			color.click();
			plus.click();
			addCart.click();
		}
		
		public void cartIconClick() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
			cartIcon.click();
			System.out.println("Test4 pass");
		}
		
}
