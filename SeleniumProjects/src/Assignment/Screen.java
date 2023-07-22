package Assignment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Screen {

	public static void main(String[] args) throws IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		
		TakesScreenshot sc = (TakesScreenshot) driver;
		File first = sc.getScreenshotAs(OutputType.FILE);
		File dist = new File("E:/Eclipse/selenium/Snapshots.png");
		FileHandler.copy(first, dist);
		
		 //  filehandler-org.openqa.selenium.io.FileHandler

	}

}
