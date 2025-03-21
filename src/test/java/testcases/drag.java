package testcases;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

public class drag {

    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

  
            
            driver.get("https://jqueryui.com/droppable/");
            driver.manage().window().maximize();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("iframe")));
            
            
            driver.switchTo().frame(iframe);

            WebElement draggable = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("draggable")));
            WebElement droppable = driver.findElement(By.id("droppable"));
            Actions actions = new Actions(driver);
            actions.dragAndDrop(draggable, droppable).perform();
            actions.contextClick(droppable).perform();
            actions.sendKeys(Keys.F2).perform();
        
            Set<String> winids = driver.getWindowHandles();
            Iterator<String> iterator = winids.iterator();
            String win = iterator.next();
            driver.switchTo().window(win);
            
            JavascriptExecutor js = (JavascriptExecutor) driver;
             js.executeScript("");
            
        }
    }

