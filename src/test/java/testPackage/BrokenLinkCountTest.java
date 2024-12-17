package testPackage;

import org.testng.annotations.Test;

import basePackage.BaseClass;
import pagePackage.BrokenLinkCount;

public class BrokenLinkCountTest extends BaseClass {
@Test
public void test2() {
	BrokenLinkCount obj2= new BrokenLinkCount(driver);
	obj2.linkCount();
}
}
