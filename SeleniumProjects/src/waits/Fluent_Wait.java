package waits;

import java.util.concurrent.TimeUnit;

import javax.xml.datatype.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Fluent_Wait {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
       
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();  
		
		//Instantate fluent  wait
		FluentWait f = new FluentWait(driver).withTimeout(java.time.Duration.ofSeconds(10)).pollingEvery(java.time.Duration.ofSeconds(20)).ignoring(Throwable.class);
        f.until(ExpectedConditions.elementToBeClickable(By.name("login")));
        
        WebElement login = driver.findElement(By.name("login"));
        login.click();
	}
	}


