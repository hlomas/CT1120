package asserts;

import org.testng.annotations.Test;

import org.testng.asserts.SoftAssert;


public class SoftAssertEj {
	SoftAssert softAssert = new SoftAssert();
  @Test
  public void softAssertEquals() {
	  int a =5 ;
	  int b = 10;
	  int x = 8;
	  int y = 10;
	  
	  softAssert.assertEquals(a,b);
	  softAssert.assertEquals(x,y);
	  softAssert.assertAll();
  }
}
