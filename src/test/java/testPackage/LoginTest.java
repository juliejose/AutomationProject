package testPackage;

import org.testng.annotations.Test;

import basePackage.BaseClass;
import pagePackage.Login;

public class LoginTest extends BaseClass{
@Test
public void test4() {
	Login obj4= new Login(driver);
	obj4.logoutClick();
	obj4.loginDetails();
	obj4.signinClick();
}
}
