package testPackage;

import org.testng.annotations.Test;

import basePackage.BaseClass;
import pagePackage.TitleVerification;

public class TitleVerificationTest extends BaseClass{
@Test
public void test1() {
	TitleVerification obj1=new TitleVerification(driver);
		obj1.titleVerification();	
}
}
