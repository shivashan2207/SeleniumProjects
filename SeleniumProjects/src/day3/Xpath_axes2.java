package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath_axes2 {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);

		WebElement buttonElement = driver.findElement(By.id("alertButton"));
		buttonElement.click();
		

	}

}
