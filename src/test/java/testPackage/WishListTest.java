package testPackage;

import org.testng.annotations.Test;

import basePackage.BaseClass;
import pagePackage.WishList;

public class WishListTest extends BaseClass{
@Test
public void test6() {
	WishList obj6= new WishList(driver);
	obj6.chokerClick();
	obj6.wishListClick();
	
	
}
}
