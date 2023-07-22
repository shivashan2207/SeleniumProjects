package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Resume {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://greenstech.in/selenium-course-content.html");
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		WebElement btnmodel = driver.findElement(By.id("heading201"));
		btnmodel.click();
		
		WebElement btnreusme = driver.findElement(By.xpath("//a[text()='Resume Model-1 ']"));
		btnreusme.click();
		

	}

}
