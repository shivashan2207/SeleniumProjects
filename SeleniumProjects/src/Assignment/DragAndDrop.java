package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
	       options.addArguments("--remote-allow-origins=*");
	       ChromeDriver driver = new ChromeDriver(options);
	       driver.get("https://demo.guru99.com/test/drag_drop.html");
	       
	       Actions a = new Actions(driver);
	       WebElement from = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
	       WebElement to = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));	  
	       a.dragAndDrop(from, to).build().perform();
		}

	}


