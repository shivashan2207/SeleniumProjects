package tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);	
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		String source = driver.getWindowHandle();
		WebElement txtsearch = driver.findElement(By.id("twotabsearchtextbox"));
		txtsearch.sendKeys("vivo"+Keys.ENTER);
		WebElement lnkfirst = driver.findElement(By.xpath("//span[text()='Vivo Y16 (Drizzling Gold, 3GB RAM, 64GB Storage) with No Cost EMI/Additional Exchange Offers']"));
		lnkfirst.click();
		Set<String> newChildid = driver.getWindowHandles();
		List<String> li=new ArrayList<String>();
		li.addAll(newChildid);
		String c1 = li.get(1);
		//driver.switchTo().window(c1);
		driver.switchTo().window(source);
		Thread.sleep(2000);
//		WebElement lnkvivo1 = driver.findElement(By.xpath("(//span[text()='vivo Y16 (Stellar Black, 3GB RAM, 32GB Storage) with No Cost EMI/Additional Exchange Offers'])[2]"));
//		lnkvivo1.click();
//		Thread.sleep(3000);
//		WebElement lnkvivo2 = driver.findElement(By.xpath("//span[text()='Vivo Y21 (Midnight Blue, 4GB RAM, 64GB Storage) Without Offers']"));
//		lnkvivo2.click();
//		Set<String> newChildid1 = driver.getWindowHandles();
//		List<String> li1=new ArrayList<String>();
//		li1.addAll(newChildid1);
//		String c2 = li1.get(3);
//		driver.switchTo().window(c2);

	}

}
