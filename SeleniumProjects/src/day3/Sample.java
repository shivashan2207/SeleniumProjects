package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sample {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();   
		String title = driver.getTitle();
		System.out.println(title);

		String url = driver.getCurrentUrl();
		System.out.println(url);

		WebElement emailElement = driver.findElement(By.id("email"));
		emailElement.sendKeys("chezhiyan1710@gmail.com");
		String title1 = emailElement.getAttribute("value");
		System.out.println("username:"+title1);

		WebElement passElement = driver.findElement(By.id("pass"));
		passElement.sendKeys("porchezhiyanT");
		String title2 = passElement.getAttribute("value");
		System.out.println("password:"+title2);
		
		WebElement containText = driver.findElement(By.xpath("//h2[contains(text(),'people')]"));
		System.out.println("containText:"+containText.getText());

		WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));
		loginButton.click();
    
	}

}
