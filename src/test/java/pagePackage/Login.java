package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver;
	//Validating login is successful when valid credentials are given
	//Also validate the user can logout successfully
	
	 @FindBy(xpath="//*[@id=\"SiteHeader\"]/div[1]/div/div[3]/div/div/a[1]")
	 WebElement humanIcon;
	 
	 @FindBy(xpath="//*[@id=\"MainContent\"]/div/header/a")
	 WebElement logout;
	 
	 
	 
	 @FindBy(xpath="//*[@id=\"CustomerEmail\"]")
	 WebElement email;
	 
	 @FindBy(xpath="//*[@id=\"CustomerPassword\"]")
	 WebElement passwrd;
	 
	 @FindBy(xpath="//*[@id=\"customer_login\"]/p[1]/button")
	 WebElement signin;
	
	
	 
	 public Login(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	 
		
		public void logoutClick() {
			humanIcon.click();
			logout.click();
			humanIcon.click();
		}
		
		public void loginDetails() {
			email.sendKeys("iiiiiiicsdsfdaf@gmail.com");;
			passwrd.sendKeys("iiiiiiiddfsdfa12@");
			
		}
		
		public void signinClick() {
			signin.click();
			System.out.println("Test3 pass");
		}
		
}
