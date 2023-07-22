package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath_axes {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		
		WebElement buttonElement = driver.findElement(By.id("confirmButton"));
		buttonElement.click();
		
		Thread.sleep(2000);
	    buttonElement.getText();
		
		driver.switchTo().alert().accept();
		

	}

}
