package pagePackage;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BrokenLinkCount {
	WebDriver driver;
	
	//Ensure the page is having no broken links. but it has broken links.
	 
	 public BrokenLinkCount(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	 
		
		public void linkCount() {
			int count=0;
			List<WebElement> LinkDetails=driver.findElements(By.tagName("a"));
			System.out.println("The totalnumber of links:"+LinkDetails.size());
			for(WebElement linkAddress:LinkDetails)//for each loop to give values of char array to element to print each char 
			{
				String Link=linkAddress.getAttribute("href");
				try {
					URL u=new URL(Link);
					HttpURLConnection con=(HttpURLConnection)u.openConnection();
					int code=con.getResponseCode();
					if(code>=400) {
						System.out.println("Broken Links:"+Link);
						count++;
					}
				}
					catch(Exception e) {
						System.out.println(e.getMessage());			
			}
			}
				System.out.println("Unsuccessful link Count is:"+count);
				System.out.println("Test8 pass");
			
		}
}
