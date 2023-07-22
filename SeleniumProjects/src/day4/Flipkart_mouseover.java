package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_mouseover {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
	
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[.='✕']")).click();
		
		WebElement electronics = driver.findElement(By.xpath("(//div[@class='_28p97w'])[2]"));
		Actions actionObj = new Actions(driver);
		actionObj.moveToElement(electronics).perform();
		
/*		WebElement elec1 = driver.findElement(By.linkText("Electronics GST Store"));
		elec1.click();
		
		Thread.sleep(10000); */
		

	}

}
