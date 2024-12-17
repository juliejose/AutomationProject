package pagePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ColorFilterCheck {
WebDriver driver;
	
	//Validate the user can click option in filter
//Validating user can pick color
	
	 @FindBy(xpath="//*[@id=\"SiteHeader\"]/div[1]/div/div[3]/div/div/a[2]")
	 WebElement search;
	 
	 @FindBy(xpath="//*[@id=\"Search\"]")
	 WebElement input;
	 
	 @FindBy(xpath="//*[@id=\"SiteHeader\"]/div[2]/div/div/predictive-search/form/div[1]/button")
	 WebElement searchbutton;
	 
	 @FindBy(xpath="//*[@id=\"SortBy\"]")
	 WebElement filter;
	
	 @FindBy(xpath="//*[@id=\"CollectionSidebar\"]/div[1]/form/div[2]/div/button")
	 WebElement color;
	 
	 
	 @FindBy(xpath="//*[@id=\"CollectionSidebar-2-filter-colour\"]/div/ul/li[5]/label/span[2]")
	 WebElement colorOption;
	 
	
	
	 
	 public ColorFilterCheck(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	 
		
		public void searchClick() {
			search.click();
			input.sendKeys("Neck Pieces");
			searchbutton.click();
		}
		
		public void filterCheck() {
			
			Select sortDetails=new Select(filter);
			sortDetails.selectByValue("price-ascending");
		}
		
   public void colorCheck() {
			
		color.click();
		colorOption.click();
		}	
		
}
