package pagePackage2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterSameCredentials {
//Validate user can't register with existing account details
	
	WebDriver driver;
	
	 @FindBy(xpath="//*[@id=\"SiteHeader\"]/div[1]/div/div[3]/div/div/a[1]")
	 WebElement humanIcon;
	 
	 @FindBy(xpath="//*[@id=\"MainContent\"]/div/header/a")
	 WebElement logout;
	 
	 @FindBy(xpath="//*[@id=\"customer_register_link\"]")
	 WebElement createAcc;
	 
	 @FindBy(xpath="//*[@id=\"FirstName\"]")
	 WebElement firstName;
	 
	 @FindBy(xpath="//*[@id=\"LastName\"]")
	 WebElement lastName;
	 
	 @FindBy(xpath="//*[@id=\"Email\"]")
	 WebElement email;
	 
	 @FindBy(xpath="//*[@id=\"CreatePassword\"]")
	 WebElement passwrd;
	 
	 @FindBy(xpath="//*[@id=\"register-submit\"]")
	 WebElement create;
	 
	 public RegisterSameCredentials(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	 
		
		public void registrationClick() {
			humanIcon.click();
			logout.click();
			System.out.println("logout");
			humanIcon.click();
			System.out.println("humanicon");
			createAcc.click();
			System.out.println("createaccs");
		}
		
		public void regiDetails() {
			firstName.sendKeys("ffFassfsdf");
			lastName.sendKeys("ffSdfsadf");
			email.sendKeys("ffcsdsfdaf@gmail.com");
			passwrd.sendKeys("ffddfsdfa12@");
		}
		
		public void craeteClick() {
			create.click();
			
		}

}
