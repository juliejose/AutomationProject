package testPackage2;

import java.time.Duration;

import org.testng.annotations.Test;

import basePackage.BaseClass;
import pagePackage2.Whatssapp;

public class WhatsappTest extends BaseClass{
@Test
public void test14() {
	Whatssapp obj14=new Whatssapp(driver);
	obj14.appClick();

}
}
