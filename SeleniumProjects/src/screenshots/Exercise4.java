package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Exercise4 {

	public static void main(String[] args) throws IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options); 
		driver.get("http://greenstech.in/selenium-course-content.html");
			driver.manage().window().maximize();         
			String title = driver.getTitle();
			System.out.println(title);
			

			JavascriptExecutor jse = (JavascriptExecutor)driver;
			String height = jse.executeScript("return window.innerHeight;").toString();
			System.out.println(height);

			jse.executeScript("window.scrollBy(0,400)"); 
			
			//ScrollDown till "job opening" and Take the screenshot and  scroll up Online Classroom
			TakesScreenshot screenshot = (TakesScreenshot) driver;
		    File firstsource = screenshot.getScreenshotAs(OutputType.FILE);
		    File firstdestination = new File ("./Snapshots/job opening.png");
		    FileHandler.copy(firstsource, firstdestination);
		    
		    //Scrolldown till "Top Selenium Trends In 2020" and takes Screenshot 
		    //Click interviews question take the screenshot
	        //In  CoreJava TestPaper Take the Screenshot 


	}

}
