package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Flipkart {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.flipkart.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		WebElement closebtn = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		closebtn.click();
		
		WebElement txtbox = driver.findElement(By.name("q"));
		txtbox.sendKeys(Keys.SHIFT,"iphone",Keys.ENTER);
		

	}

}
