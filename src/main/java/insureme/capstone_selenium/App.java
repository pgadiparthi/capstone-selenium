package insureme.capstone_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By.ByCssSelector;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
	 public static void main( String[] args ) throws InterruptedException
	    {
	                
	        
		 
		//System.setProperty("webdriver.chrome.driver", "C:\\Prathap\\Azure\\Bootcamp-TCS\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	        
	System.setProperty("webdriver.chrome.driver", "/opt/google/chrome/google-chrome");
		    
		 //WebDriverManager.chromedriver().setup();
		    
	        ChromeOptions chromeoptions = new ChromeOptions();
	        chromeoptions.addArguments("--headless");
	        
	        chromeoptions.addArguments("start-maximized"); // open Browser in maximized mode
	        chromeoptions.addArguments("disable-infobars"); // disabling infobars
	        chromeoptions.addArguments("--disable-extensions"); // disabling extensions
	        chromeoptions.addArguments("--disable-gpu"); // applicable to windows os only
	        chromeoptions.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
	        chromeoptions.addArguments("--no-sandbox"); // Bypass OS security model
	        //WebDriver driver = new ChromeDriver(options);
	        
	        WebDriver driver = new ChromeDriver(chromeoptions);
	        driver.get("https://google.com");
	        
	        System.out.println("Script Execution Started...");
	        
	        //driver.get("http://107.21.193.163:8085/contact.html");
	        
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        
	        
	        //driver.findElement(By.className("nav-click")).click();
	        
	        //driver.findElement(By.cssSelector("a[id^='nav-click']")).click();
	        
	        Thread.sleep(1000);
	        
	        driver.findElement(By.id("inputName")).sendKeys("Prathap G");
	        
	        Thread.sleep(1000);
	        
	        driver.findElement(By.id("inputNumber")).sendKeys("8889991111");
	        
	        Thread.sleep(1000);
	        
	        driver.findElement(By.id("inputMail")).sendKeys("admin@xyz.com");
	        
	        Thread.sleep(1000);
	        
	        driver.findElement(By.id("inputMessage")).sendKeys("I am interested");
	        
	        Thread.sleep(1000);
	        
	        
	        driver.findElement(By.id("my-button")).click();
	        
	        //driver.findElement(By.className("btn-box")).click();
	                          
	       	Thread.sleep(3000);
	        
	        System.out.println("Sent - Execution Completed");
	        
	        driver.quit();
	    }
}

