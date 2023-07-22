package important;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Instagram_login {
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		
	driver.get("https://www.instagram.com/accounts/login/");
	driver.manage().window().maximize();
	String title = driver.getTitle();
	System.out.println(title);
	
	WebElement email = driver.findElement(By.xpath("//input[@name='username']"));
	email.sendKeys("chezhiyan1710@gmail.com");
}}
