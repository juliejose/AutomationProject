package testPackage2;

import org.testng.annotations.Test;

import basePackage.BaseClass;
import pagePackage2.TrackOrder;

public class TrackTest extends BaseClass{
@Test
public void test13() {
	TrackOrder obj13= new TrackOrder(driver);
	obj13.trackClick();
	obj13.trackDetails();
	obj13.backTwo();
}
}
