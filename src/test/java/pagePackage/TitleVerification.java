package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TitleVerification {
	WebDriver driver;
	
	//Validating the actual title of the page is as expected title
	 
	 public TitleVerification(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	 
		
		public void titleVerification() {
			String actualTitle=driver.getTitle();
			System.out.println(actualTitle);
			String expTitle="Adore By Priyanka";
			if(actualTitle.equals(expTitle))
			{
				System.out.println("Titles are same");
			}
			else {
				System.out.println("Titles are not same");
			}
			System.out.println("Test1 pass");
			
		}
}
