package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration {
	
	//Validate user can register with valid details
	WebDriver driver;
	
	 @FindBy(xpath="//*[@id=\"SiteHeader\"]/div[1]/div/div[3]/div/div/a[1]")
	 WebElement humanIcon;
	 
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
	
	
	 
	 public Registration(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	 
		
		public void registrationClick() {
			humanIcon.click();
			createAcc.click();
		}
		
		public void regiDetails() {
			firstName.sendKeys("iiiiiiiFassfsdf");
			lastName.sendKeys("iiiiiiiSdfsadf");
			email.sendKeys("iiiiiiicsdsfdaf@gmail.com");
			passwrd.sendKeys("iiiiiiiddfsdfa12@");
		}
		
		public void craeteClick() {
			create.click();
			System.out.println("Test2 pass");
		}
}
