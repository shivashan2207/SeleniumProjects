package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class InstaLogin {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);	
		driver.get( "https://www.instagram.com/accounts/login/?hl=en) login page");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl  = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		WebElement txtuser = driver.findElement(By.xpath("//input[@name='username']"));
		 txtuser.sendKeys("gowtham");
		 
		
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("123456");
				

	}

}
