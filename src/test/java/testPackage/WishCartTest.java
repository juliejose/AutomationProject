package testPackage;

import org.testng.annotations.Test;

import basePackage.BaseClass;
import pagePackage.WishCart;

public class WishCartTest extends BaseClass{
@Test
public void test7() {
	WishCart obj7= new WishCart(driver);
	obj7.wishIconClick();
	obj7.addcartList();
}
}
