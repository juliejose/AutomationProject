package testPackage;

import org.testng.annotations.Test;

import basePackage.BaseClass;
import pagePackage.Paging;

public class PagingTest extends BaseClass {
@Test
public void test11() {
	Paging obj11= new Paging(driver);
	
	obj11.storeClick();
	obj11.scrollDown();
	obj11.nxtpgClick();
	obj11.scrollDown();
	obj11.pg4Click();
	
	obj11.scrollUpButton();
}
}
