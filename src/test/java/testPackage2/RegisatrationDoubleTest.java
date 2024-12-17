package testPackage2;

import org.testng.annotations.Test;

import basePackage.BaseClass;
import pagePackage2.RegisterSameCredentials;

public class RegisatrationDoubleTest extends BaseClass {
@Test
public void test17() {
	RegisterSameCredentials obj17= new RegisterSameCredentials(driver);
	obj17.registrationClick();
	obj17.regiDetails();
	obj17.craeteClick();
}
}
