package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Exercise5 {

	public static void main(String[] args) throws IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();         
		String title = driver.getTitle();
		System.out.println(title);
		

		JavascriptExecutor jse = (JavascriptExecutor)driver;
		String height = jse.executeScript("return window.innerHeight;").toString();
		System.out.println(height);

		jse.executeScript("window.scrollBy(0,400)"); 
		
		//flipkart Search iphone and take the screenshot.
		TakesScreenshot screenshot = (TakesScreenshot) driver;
	    File firstsource = screenshot.getScreenshotAs(OutputType.FILE);
	    File firstdestination = new File ("./Snapshots/iphone.png");
	    FileHandler.copy(firstsource, firstdestination);
	    
	   //flipkart Mouse Over Womens and take the screenshot.

	}

	}

