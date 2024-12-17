package testPackage;

import org.testng.annotations.Test;

import basePackage.BaseClass;
import pagePackage.SearchFuctionality;

public class SearchFunTest extends BaseClass{
@Test
public void test8() {
	SearchFuctionality obj8= new SearchFuctionality(driver);
	obj8.searchClick();
	obj8.priceSliding();
	
	
	
}
}
