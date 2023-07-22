package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Exercise1 {

	public static void main(String[] args) throws IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();         
		String title = driver.getTitle();
		System.out.println(title);
		
		//for fullPage screenshot
		TakesScreenshot screenshot = (TakesScreenshot) driver;
	    File firstsource = screenshot.getScreenshotAs(OutputType.FILE);
	    File firstdestination = new File ("./Snapshots/greentech.png");
	    FileHandler.copy(firstsource, firstdestination);
	    
	  //  filehandler-org.openqa.selenium.io.FileHandler
	  //  fileutis - commons.io.jaar
	   

	}

}
