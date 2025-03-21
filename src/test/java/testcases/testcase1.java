package testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testcase1 {
	/*@Test (priority=1)
	public void dologin() {
		System.out.println("Executing Login test");
	}
	@Test (priority=2)
	public void douserReg() {
		System.out.println("Executing Login test");
	}
	*/
	@Test (invocationCount=5)
	public void titlesMatch() {
		String expected_title = "Yahoo.com";
		String actual_title = "Gmail.com";
		System.out.println("Validating Titles");
		SoftAssert softAssert = new SoftAssert();
		AssertJUnit.assertEquals(actual_title, expected_title);
		System.out.println("Validating images");
		AssertJUnit.assertEquals(true, false);
		
		System.out.println("validating text box presence");
		AssertJUnit.assertEquals(true, false);
		
		System.out.println("Ending");
		softAssert.assertAll();
	}

}
