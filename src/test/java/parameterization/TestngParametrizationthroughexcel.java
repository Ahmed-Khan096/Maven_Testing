package parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestngParametrizationthroughexcel {

	
	@Test(dataProvider="getdata")
	public void testData(String username, String password , String is_correct ) {
		System.out.println(username +"_____"+password+"-------"+is_correct);
		
	}
	
	
	@DataProvider
	public static Object[][] getdata(){
		Object[][] data = new Object[2][3];
		return data;
	}

}
