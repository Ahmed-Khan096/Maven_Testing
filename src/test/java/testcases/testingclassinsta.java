package testcases;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Pdf;
import org.openqa.selenium.PrintsPage;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.print.PrintOptions;

import java.nio.file.Files;  // Only keep the java.nio.file.Files import
import java.nio.file.Paths;
import java.nio.file.Path;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.List; 
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class testingclassinsta {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.galaxy.pk/laptops?br=2262062&sort=2");
		driver.manage().window().maximize();
		
		Pdf pdf = ((PrintsPage)driver).print(new PrintOptions());
		Files.write(Paths.get("./selenium.pdf"),OutputType.BYTES.convertFromBase64Png(pdf.getContent()));
		
	}}
		
		/*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
        usernameField.sendKeys("Ahmed");
        
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        
        for(WebElement link : links) {
        	System.out.println(link.getText()+"  and the url is  "+ link.getAttribute("href"));
        	
        }
       
		
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("firstsheet");
		
		
		
		
		
		List<WebElement> links = driver.findElements(By.name("list-productname"));
        System.out.println(links.size());
        List<WebElement> price = driver.findElements(By.className("price"));
           
        
        for (int i = 0; i < links.size(); i++) {
        	
        	
        	Row data = sheet.createRow(i);
        	
            String productName = links.get(i).getText(); 
            String productPrice = price.get(i).getText();
            
            data.createCell(0).setCellValue(productName);
            data.createCell(1).setCellValue(productPrice);
        }
        FileOutputStream fileOut = new FileOutputStream(new File("C:\\Users\\ahmedh\\Documents\\New folder\\new.xlsx"));
        workbook.write(fileOut);
        fileOut.close();
        System.out.println("Data has been written to the Excel file!");
        workbook.close(); 
      
        } 
		
		
}*/

/*
	        // Locate the element by its ID
	        WebElement ele = driver.findElement(By.id("rptListView_ctl00_imgProduct"));

	        // Capture the screenshot of the WebElement
	        File aboveScrn = ele.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(aboveScrn, new File("./screenshot/above.jpg"));
	
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("./screenshot/fullpage.jpg"));



	
//		File link = driver.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile( link ,  new File("./screenshot/price.jpg"));
	 

     
//        driver.quit();
*/
	
		
	
