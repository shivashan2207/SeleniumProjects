package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TrainTrip {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.cleartrip.com/trains");
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		WebElement txtfrom = driver.findElement(By.id("from_station"));
		txtfrom.sendKeys("theni");
		
		WebElement txtto = driver.findElement(By.id("to_station"));
		txtto.sendKeys("chennai");
		
		WebElement btnsearch = driver.findElement(By.id("trainFormButton"));
		btnsearch.click();

	}

}
