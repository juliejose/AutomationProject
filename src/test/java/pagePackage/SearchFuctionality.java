package pagePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchFuctionality {
WebDriver driver;
	
	//Validate the user can search the product or not
//Validating the slider is working fine and filter is correct

	
	 @FindBy(xpath="//*[@id=\"SiteHeader\"]/div[1]/div/div[3]/div/div/a[2]")
	 WebElement search;
	 
	 @FindBy(xpath="//*[@id=\"Search\"]")
	 WebElement input;
	 
	 @FindBy(xpath="//*[@id=\"SiteHeader\"]/div[2]/div/div/predictive-search/form/div[1]/button")
	 WebElement searchbutton;
	 
	 @FindBy(xpath="//*[@id=\"CollectionSidebar\"]/div[1]/form/div[1]/div/button")
	 WebElement price;
	 
	 @FindBy(xpath="//*[@id=\"CollectionSidebar-1-filter-price\"]/div/div/div[2]/div/div/div[2]")
	 WebElement amtsrc;
	
	 @FindBy(xpath="//*[@id=\"CollectionSidebar-1-filter-price\"]/div/div/div[2]/div/div/div[3]")
	 WebElement amtdes;
	
	 
	
	
	 
	 public SearchFuctionality(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	 
		
		public void searchClick() {
			search.click();
			input.sendKeys("ring");
			searchbutton.click();
		}
		
		public void priceSliding() {
			price.click();
			Actions act=new Actions(driver);
			act.dragAndDrop(amtsrc, amtdes);
			act.perform();
		}
		
		
		
	
}
