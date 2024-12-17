package testPackage2;

import org.testng.annotations.Test;

import basePackage.BaseClass;
import pagePackage2.Logo;

public class LogoTest extends BaseClass{
@Test
public void test18() {
	Logo obj18= new Logo(driver);
	obj18.logoClick();
}
}
