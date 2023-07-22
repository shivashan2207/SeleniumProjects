package day4;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Robot_key {

	public static void main(String[] args) throws AWTException, InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();   
		String title = driver.getTitle();
		System.out.println(title);
		
		WebElement buttonelement = driver.findElement(By.linkText("Images"));
		Actions act = new Actions(driver);
		act.contextClick(buttonelement).perform();
		
		Robot robotkey = new Robot();
		for(int i=0;i<6;i++)
		{
		robotkey.keyPress(KeyEvent.VK_DOWN);
		robotkey.keyRelease(KeyEvent.VK_DOWN);
		}
		
		Thread.sleep(5000);
		robotkey.keyPress(KeyEvent.VK_ENTER);
		//robotkey.keyRelease(KeyEvent.VK_DOWN);	
		
		Thread.sleep(5000);
	//	driver.close();				

	}

}
