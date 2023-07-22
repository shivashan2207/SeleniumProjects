package day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
	     
	     driver.get("https://www.amazon.org/");
	     Thread.sleep(2000);
	     
	     driver.navigate().to("https://www.flipkart.com/");
	     Thread.sleep(2000);
	     
	     driver.navigate().back();
	     driver.navigate().forward();
	     driver.navigate().refresh();
	}

}
