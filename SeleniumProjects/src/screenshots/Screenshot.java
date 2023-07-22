package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options); 
		driver.get("https://www.amazon.com");
			driver.manage().window().maximize();         
			String title = driver.getTitle();
			System.out.println(title);
			
			//for fullPage screenshot
			TakesScreenshot screenshot = (TakesScreenshot) driver;
		    File firstsource = screenshot.getScreenshotAs(OutputType.FILE);
		    File firstdestination = new File ("./Snapshots/img1.png");
		    FileHandler.copy(firstsource, firstdestination);            //compile time exception(IOexception)
			
		    Thread.sleep(5000);

		    //for particular button screenshot
		    WebElement ele = driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]"));
		    File elesource = ele.getScreenshotAs(OutputType.FILE);
		    File eledestination = new File ("./Snapshots/img2.png");
		    FileHandler.copy(elesource, eledestination);   
		    
		 /*   WebElement pc = driver.findElement(By.className("a-section a-spacing-none a-padding-base a-text-center text-link-stripe card-lite text-link-stripe"));
		    File pcsource = ele.getScreenshotAs(OutputType.FILE);
		    File pcdestination = new File ("./Snapshots/img3.png");
		    FileHandler.copy(elesource, eledestination); */
		   
		    
		    Thread.sleep(5000);
		    driver.quit();
		    
		    

	}

}
