package testPackage;

import org.testng.annotations.Test;

import basePackage.BaseClass;
import pagePackage.AddtoCart;

public class AddtoCartTest extends BaseClass {
@Test
public void test5() {
	AddtoCart obj5= new AddtoCart(driver);
	obj5.bestsellerClick();
	obj5.addcartdetails();
	obj5.cartIconClick();
}
}
