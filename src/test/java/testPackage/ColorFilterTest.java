package testPackage;

import org.testng.annotations.Test;

import basePackage.BaseClass;
import pagePackage.ColorFilterCheck;

public class ColorFilterTest extends BaseClass {
@Test
public void test9() {
ColorFilterCheck obj9= new ColorFilterCheck(driver);
obj9.searchClick();
obj9.filterCheck();
obj9.colorCheck();
}
}
