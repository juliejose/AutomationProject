package testPackage2;

import org.testng.annotations.Test;

import basePackage.BaseClass;
import pagePackage2.Faq;

public class FaqTest extends BaseClass{
@Test
public void test15() {
	Faq obj15= new Faq(driver);
	
	obj15.faqClick();
	
}
}
