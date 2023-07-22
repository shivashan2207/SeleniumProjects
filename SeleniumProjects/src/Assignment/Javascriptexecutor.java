package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Javascriptexecutor {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();    
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement pillow = driver.findElement(By.xpath("//span[text()='Home Décor Under $20']"));
		js.executeScript("arguments[0].scrollIntoView(true)",pillow);
		
		WebElement pillow1 = driver.findElement(By.xpath("(//img[@class='product-image'])[108]"));
		js.executeScript("arguments[0].click", pillow1);

	}

}
