package testPackage;

import org.testng.annotations.Test;

import basePackage.BaseClass;
import pagePackage.Registration;

public class RegistrationTest extends BaseClass {
@Test
public void test3()
{
	Registration obj3=new Registration(driver);
	obj3.registrationClick();
	obj3.regiDetails();
	obj3.craeteClick();
}
}
