package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Over {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
	
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	
	WebElement btncourse = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
	Actions actionObj = new Actions(driver);
	actionObj.moveToElement(btncourse).perform();
	
	WebElement btnOrac = driver.findElement(By.xpath("//span[text()='Music Library']"));
	btnOrac.click();
	
	
	Thread.sleep(10000);
	driver.close();
	}
}
