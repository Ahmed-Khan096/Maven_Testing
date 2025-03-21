package parameterization;

import java.sql.Driver;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testParameter {

	@Test(dataProvider="getdata",invocationCount=5,threadPoolSize=2)
	public void dologin(String username, String password) throws InterruptedException {
		Date d = new Date();
		System.out.println(username +"------"+ password +"---"+d);
//		 ChromeDriver driver = new ChromeDriver();
//		 driver.get("https://www.galaxy.pk");
		
		
		Thread.sleep(2000);
	}
	
	
	@DataProvider
	public Object[][] getdata(){
		Object[][] data = new Object[3][2];
		
		data[0][0]= "medcare1@gmail.com";
		data[0][1]= "iudsch";
		data[1][0]= "medcare22@gmail.com";
		data[1][1]= "qwetysya";
		data[2][0]= "medcare33@gmail.com";
		data[2][1]= "asdafsa";
		return data;
	}

}
