package important;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Iostraining_login {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("http://www.greenstechnologys.com/apple-ios-training-in-chennai.html");
	        driver.manage().window().maximize();
	        String title = driver.getTitle();
			System.out.println(title);
			
			WebElement contactButton = driver.findElement(By.className("login-myact contactus"));
			contactButton.click();
			
			WebElement nameElement = driver.findElement(By.name("name"));
			nameElement.sendKeys("porchezhiyanT");
			
			WebElement nameElement1 = driver.findElement(By.name("Phone"));
			nameElement1.sendKeys("phone");
			
			WebElement emailElement = driver.findElement(By.name("email"));
			emailElement.sendKeys("chezhiyan1710@gmail.com");

			WebElement loginButton = driver.findElement(By.name("submit"));
			loginButton.click();
	}
}
