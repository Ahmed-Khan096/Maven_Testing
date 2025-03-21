package testcases;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.manager.SeleniumManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testbrowser {
	public static String browser = "ie";
	public static WebDriver driver = null;

	public static void main(String[] args) {
		/*
		 * System.setProperty("chrome.web.driver","C:\\chromedriver\\chromedriver.exe");
		 * WebDriverManager.chromedriver().setup();
		 * System.out.println(SeleniumManager.getInstance()); ChromeDriver driver = new
		 * ChromeDriver();
		 * 
		 * driver.get("https://www.galaxy.pk");
		 */

		if (browser.equals("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser.equals("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browser.equals("ie")) {

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		} else {
			System.out.println("no broswer found");
		}

	}

}
