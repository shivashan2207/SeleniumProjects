package important;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class AmazonWindowHandling {

	public static void main(String[] args) throws IOException, InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		WebElement txtsearch = driver.findElement(By.id("twotabsearchtextbox"));
		txtsearch.sendKeys("iphone"+Keys.ENTER);
		
		WebElement lnkiphone = driver.findElement(By.xpath("(//span[text()='Apple iPhone 14 128GB Blue'])[1]"));
		lnkiphone.click();
		
		String parentwindowId = driver.getWindowHandle();
		Set<String> allwindowId = driver.getWindowHandles();
		for (String eachwindowId : allwindowId) 
		{
			if (!parentwindowId.equals(eachwindowId)) {
				driver.switchTo().window(eachwindowId);
				
			}
			
		}
		WebElement clkcart = driver.findElement(By.id("add-to-cart-button"));
		clkcart.click();
		Thread.sleep(3000);
		
		TakesScreenshot t = (TakesScreenshot)driver;
		File source = t.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Admin\\eclipse-workspace\\SeleniumProjects\\Screenshot1\\iphoneCart.png");
		FileHandler.copy(source, destination);
		
		
		driver.switchTo().window(parentwindowId);
		WebElement lnkiphone2 = driver.findElement(By.xpath("(//span[text()='Apple iPhone 13 (128GB) - Blue'])[1]"));
		lnkiphone2.click();
		
		Set<String> allwindowId1 = driver.getWindowHandles();
		List<String> li = new ArrayList();
		li.addAll(allwindowId1);
		String childwindowId = li.get(2);
		driver.switchTo().window(childwindowId);
		WebElement lnkcart = driver.findElement(By.id("add-to-cart-button"));
		lnkcart.click();
		Thread.sleep(3000);
		File source1 = t.getScreenshotAs(OutputType.FILE);
		File destination1 = new File("C:\\Users\\Admin\\eclipse-workspace\\SeleniumProjects\\Screenshot1\\iphoneCart2.png");
		FileHandler.copy(source1, destination1);
		
		driver.switchTo().window(parentwindowId);
		WebElement lnkiphone3 = driver.findElement(By.xpath("//span[text()='Apple iPhone 14 128GB Midnight']"));
		lnkiphone3.click();
		Set<String> allwindowId2 = driver.getWindowHandles();
		List<String> li1 = new ArrayList();
		li1.addAll(allwindowId2);
		String childwindowId1 = li1.get(3);
		driver.switchTo().window(childwindowId1);
		WebElement lnkcart1 = driver.findElement(By.id("add-to-cart-button"));
		lnkcart1.click();
		Thread.sleep(3000);
		File source2 = t.getScreenshotAs(OutputType.FILE);
		File destination2 = new File("C:\\Users\\Admin\\eclipse-workspace\\SeleniumProjects\\Screenshot1\\iphoneCart3.png");
		FileHandler.copy(source2, destination2);
		
		driver.switchTo().window(parentwindowId);
		WebElement lnkiphone4 = driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - Green']"));
		lnkiphone4.click();
		Set<String> allwindowId3 = driver.getWindowHandles();
		List<String> li2 = new ArrayList();
		li2.addAll(allwindowId3);
		String childwindowId2 = li2.get(4);
		driver.switchTo().window(childwindowId2);
		WebElement lnkcart2 = driver.findElement(By.id("add-to-cart-button"));
		lnkcart2.click();
		Thread.sleep(3000);
		File source3 = t.getScreenshotAs(OutputType.FILE);
		File destination3 = new File("C:\\Users\\Admin\\eclipse-workspace\\SeleniumProjects\\Screenshot1\\iphoneCart4.png");
		FileHandler.copy(source3, destination3);
		
		driver.switchTo().window(parentwindowId);
		WebElement lnkiphone5 = driver.findElement(By.xpath("//span[text()='Apple iPhone 14 Plus 128GB Purple']"));
		lnkiphone5.click();
		Set<String> allwindowId4 = driver.getWindowHandles();
		List<String> li3 = new ArrayList();
		li3.addAll(allwindowId4);
		String childwindowId3 = li3.get(5);
		driver.switchTo().window(childwindowId3);
		WebElement clklnk3 = driver.findElement(By.id("add-to-cart-button"));
		clklnk3.click();
		Thread.sleep(3000);
		File source4 = t.getScreenshotAs(OutputType.FILE);
		File destination4 = new File("C:\\Users\\Admin\\eclipse-workspace\\SeleniumProjects\\Screenshot1\\iphoneCart5.png");
		FileHandler.copy(source4, destination4);
		
	}

}
