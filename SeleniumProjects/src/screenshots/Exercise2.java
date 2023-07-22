package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Exercise2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://toolsqa.com/");
		driver.manage().window().maximize();         
		String title = driver.getTitle();
		System.out.println(title);

		JavascriptExecutor jse = (JavascriptExecutor)driver;
		String height = jse.executeScript("return window.innerHeight;").toString();
		System.out.println(height);

		jse.executeScript("window.scrollBy(0,1200)");       //scroll down		

		//scrollDown till "Recent Articles"
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File firstsource = screenshot.getScreenshotAs(OutputType.FILE);
		File firstdestination = new File ("./Snapshots/Recent Articles.png");
		FileHandler.copy(firstsource, firstdestination);

		//Scrolldown till "Selenium Training Benefit" and print the word "Selenium Training Benefit"
		jse.executeScript("window.scrollBy(0,300)");       //scroll down
		Thread.sleep(5000);

		TakesScreenshot screenshot1 = (TakesScreenshot) driver;
		File firstsource1 = screenshot1.getScreenshotAs(OutputType.FILE);
		File firstdestination1 = new File ("./Snapshots/trainingbenefit.png");
		FileHandler.copy(firstsource1, firstdestination1);  

		Thread.sleep(5000);
//		driver.quit();


	}

}
