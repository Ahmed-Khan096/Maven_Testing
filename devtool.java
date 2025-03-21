package testcases;
import ru.yandex.qatools.ashot.Screenshot;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.imageio.ImageIO;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.devtools.DevTools;

import org.openqa.selenium.devtools.v131.log.Log;
import org.openqa.selenium.devtools.v131.security.Security;
import org.openqa.selenium.devtools.v132.emulation.Emulation;
//import org.openqa.selenium.devtools.v133.filesystem.model.File;
import org.openqa.selenium.devtools.v133.network.Network;
import org.openqa.selenium.devtools.v133.network.model.ConnectionType;
import org.openqa.selenium.devtools.v133.network.model.Headers;


import com.google.common.collect.ImmutableList;
import org.openqa.selenium.TakesScreenshot;
import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import ru.yandex.qatools.ashot.AShot;

import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class devtool {
	public static void main(String[] args) throws IOException {
		
		//HGandling SSL certificates
		
		/*WebDriver driver = new ChromeDriver();
		DevTools devtool = ((ChromeDriver) driver).getDevTools();
		devtool.createSession();
		
		devtool.send(Security.enable());
		devtool.send(Security.setIgnoreCertificateErrors(true));   */
		
//		driver.get("https://expired.badssl.com");
		
		// mockking geo location using chrome dev tool 
		
	/*	WebDriver driver = new ChromeDriver();
		DevTools devtool = ((ChromeDriver) driver).getDevTools();
		devtool.createSession();
		
		devtool.send(Emulation.setGeolocationOverride(Optional.of((Number)51.509865), Optional.of(-0.118092), Optional.of(100)));
		driver.get("https://mycurrentlocation.net/");
		
		*/
		
		
		
		
		//mobile emulation 
		
		
		
		/*
		WebDriver driver = new ChromeDriver();
		DevTools devtool = ((ChromeDriver) driver).getDevTools();
		devtool.createSession();
		Map<String, Object> deviceMetric = new HashMap<String, Object>(){
			{
		 put("width",375); 
		 put("height",812); 
		  put("mobile",true); 
		  put("deviceScalefactor",50); 
		 }
		};
	((ChromiumDriver) driver).executeCdpCommand("Emulation.setDeviceMetricsOverride",deviceMetric);
		driver.get("https://selenium.dev");
		
		*/
		
		
		
		//blocking Network URls
		
		
		
		/*WebDriver driver = new ChromeDriver();
		DevTools devtool = ((ChromeDriver) driver).getDevTools();
		devtool.createSession();
		
		devtool.send(Network.enable(Optional.empty(),Optional.empty(),Optional.empty()));
		devtool.send(Network.setBlockedURLs(ImmutableList.of("*.jpg","*.png","*.jpeg")));
		
		driver.get("https://www.galaxy.pk");
		*/
		
		//Testing Network Speed
		
		/*WebDriver driver = new ChromeDriver();
		DevTools devtool = ((ChromeDriver) driver).getDevTools();
		devtool.createSession();
		
		devtool.send(Network.enable(Optional.empty(),Optional.empty(),Optional.empty()));

		devtool.send(Network.emulateNetworkConditions(false, 100, 20000, 10000, Optional.of(ConnectionType.CELLULAR4G), java.util.Optional.empty(), java.util.Optional.empty(), java.util.Optional.empty()));
		driver.get("https://selenium.dev");
		*/
		
		//ovferride time zone value
		
		/*	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://whatismytimezone.com/");
		
		Thread.sleep(5000);
		
		DevTools devtool = ((ChromeDriver) driver).getDevTools();
		devtool.createSession();
		
		devtool.send(Emulation.setTimezoneOverride("EST"));
		
		driver.get("https://whatismytimezone.com/");
		*/
		
		
		
		// Chrome consoole LOG 
		 
	/*	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		DevTools devTools = ((ChromeDriver) driver).getDevTools();
		devTools.createSession();
		
		
		devTools.send(Log.enable());
		devTools.send(Log.enable());
		
		devTools.addListener(Log.entryAdded(), entry ->{
			System.out.println("Text is : "+entry.getText());
			System.out.println("TimeStamp is : "+entry.getTimestamp());
			System.out.println("Source is : "+entry.getSource());
			System.out.println("Level is : "+entry.getLevel());		
		});

		devTools.addListener(Log.entryAdded(), entry -> {	
			System.out.println("Console Text is : "+entry.getText());	
		});
		
		driver.get("http://flipkart.com");
		((JavascriptExecutor) driver).executeScript("console.log('This is a sample log')");*/
		

		//TEst request and Response headers 
		
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		DevTools devTools = ((ChromeDriver) driver).getDevTools();
		devTools.createSession();
		
		devTools.send(Network.enable(Optional.empty(),Optional.empty(), Optional.empty()));
		devTools.addListener(Network.requestWillBeSent(), request->{
			 Headers header=request.getRequest().getHeaders();
			if(!header .isEmpty()) {
				System.out.println("Reques Heaers: ");
				header.forEach((key,value) ->{
					System.out.println(" "+ key + " = "+value);
				});
			}

		});
		devTools.addListener(Network.responseReceived(), response->{
			 Headers header=response.getResponse().getHeaders();
			if(!header .isEmpty()) {
				System.out.println("Response Heaers: ");
				header.forEach((key,value) ->{
					System.out.println(" "+ key + " = "+value);
				});
			}
			System.out.println("response is : "+ response.getResponse().getUrl()+"  status  code is " + response.getResponse().getStatus());
		});
		driver.get("https://flipkart.com");*/
		
		//take screenshoot 
		
		
	/*	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bonigarcia.dev/");
//		driver.findElement(By.id("hplogo"));
		File scrs = ((TakesScreenshot)driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/div[1]/img"))).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrs, new File(".//Screenshot//error22.jpg" ));
	*/
		
		Date d = new Date();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.dev");
		WebElement ele = driver.findElement(By.id("selenium_webdriver"));
		System.out.println("Start taking the screenshot");
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(2000)).takeScreenshot(driver,ele);
		System.out.println("Already in state of taking the screenshot");
		
		ImageIO.write(screenshot.getImage(), "jpg", new File(".//screenshot//screenshot.jpg"));
		System.out.println("Save succesfull !!!!!");

	
	
	}
}
