package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Exercise3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();         
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='×']")).click();
		
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		String height = jse.executeScript("return window.innerHeight;").toString();
		System.out.println(height);

		jse.executeScript("window.scrollBy(0,2500)");       //scroll down


		//Scroll Down till "Greens technology perumBakkam. address "and Take  screenshot 
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File firstsource = screenshot.getScreenshotAs(OutputType.FILE);
		File firstdestination = new File ("./Snapshots/greentech.png");
		FileHandler.copy(firstsource, firstdestination);


		Thread.sleep(10000);
        driver.quit();


	}

}
