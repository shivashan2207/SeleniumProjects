package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		 
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		 String currentUrl = driver.getCurrentUrl();
		 System.out.println(currentUrl);
		 
		 WebElement txtbox = driver.findElement(By.id("twotabsearchtextbox"));
		 txtbox.sendKeys("laptop",Keys.ENTER);
		 
		 WebElement txtlink = driver.findElement(By.xpath("//span[contains(text(),'ASUS VivoBook')][1]"));
		 String text = txtlink.getText();
		 System.out.println(text);
		 txtlink.click();
		 
	}

}
