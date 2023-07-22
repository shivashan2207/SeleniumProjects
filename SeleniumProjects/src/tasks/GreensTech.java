package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GreensTech {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get( "http://greenstech.in/selenium-course-content.html");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		 WebElement btntitle = driver.findElement(By.xpath("//h2[@class='title mb-0 center']"));
	     btntitle.click();
	     
	     WebElement btncts = driver.findElement(By.xpath("//a [text()='CTS Interview Question ']"));
	     btncts.click();
	     

	}

}
