package important;

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
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//type cast - takesscrrenshot  <----------webdriver
		TakesScreenshot t = (TakesScreenshot)driver;
		
		//to capture the screenshot and store in default location
		File source = t.getScreenshotAs(OutputType.FILE);
		
		// to copy the captured screenshot to required to location
		
		File destination = new File("C:\\Users\\Admin\\eclipse-workspace\\SeleniumProjects\\Screenshot\\New.jpeg");
		
		//to copy the file from source ----->destination location
		FileHandler.copy(source, destination);
		
		
		WebElement txtusername = driver.findElement(By.id("email"));
		txtusername.sendKeys("gowtham");

		File source1 = t.getScreenshotAs(OutputType.FILE);
		
		File destination1 = new File("C:\\Users\\Admin\\eclipse-workspace\\SeleniumProjects\\Screenshot\\email.png");
		
		FileHandler.copy(source1, destination1);
		
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("123456");
		
		File source2 = t.getScreenshotAs(OutputType.FILE);
				
		File destination2 = new File("C:\\Users\\Admin\\eclipse-workspace\\SeleniumProjects\\Screenshot\\pass.png");
		
		FileHandler.copy(source2, destination2);
		
		WebElement btnlogin = driver.findElement(By.name("login"));
		btnlogin.click();
		Thread.sleep(3000);
		File source3 = t.getScreenshotAs(OutputType.FILE);
		
		File destination3 = new File("C:\\Users\\Admin\\eclipse-workspace\\SeleniumProjects\\Screenshot\\login.png");
		
		FileHandler.copy(source3, destination3);

	}

}
