package important;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Flipkart_xpath {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");                                       //
		driver.manage().window().maximize();
		String title = driver.getTitle( );                     //
		System.out.println(title);
		
		WebElement search = driver.findElement(By.xpath("//input[@name='q']"));          //
		search.sendKeys("flipkart shopping"+Keys.ENTER);                                            //
		
		WebElement search1 = driver.findElement(By.xpath(""));          //
		search1.click();   
		
		WebElement search2 = driver.findElement(By.xpath(""));          //
		search2.sendKeys("");
		
		WebElement search3 = driver.findElement(By.xpath(title));          //
		search3.sendKeys(args);   

	}

}
