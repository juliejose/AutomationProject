package testPackage2;

import org.testng.annotations.Test;

import basePackage.BaseClass;
import pagePackage2.Return;

public class ReturnTest extends BaseClass{
@Test
public void test12() {
	Return obj12= new Return(driver);
	obj12.returnClick();
	obj12.retDetails();
}
}
