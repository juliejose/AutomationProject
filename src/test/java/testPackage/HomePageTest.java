package testPackage;

import org.testng.annotations.Test;

import basePackage.BaseClass;
import pagePackage.HomePage;

public class HomePageTest extends BaseClass{
@Test
public void test10() {
	HomePage obj10= new HomePage(driver);
	obj10.homeClick();
	obj10.scrollDown();
	obj10.shopClick();
	obj10.scrollUpButton();
	obj10.backPage();
}
}
