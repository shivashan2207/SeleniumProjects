package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Icici {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		WebElement btnlogin = driver.findElement(By.className("input-arrow"));
		btnlogin.click();
		Thread.sleep(2000);
		
		WebElement txtid = driver.findElement(By.name("AuthenticationFG.USER_PRINCIPAL"));
		txtid.sendKeys("gowtham@123");
		
		WebElement txtpass = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		txtpass.sendKeys("123456789");
		
		WebElement btndash = driver.findElement(By.className("selectedTxt"));
		btndash.click();
		

	}

}
