package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");;
		
		String title = driver.getTitle();
	    System.out.println(title);
	    
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println(currentUrl);
	   
	    
	    WebElement txtid = driver.findElement(By.xpath("//input[@id='email']"));
	    txtid.sendKeys("gowtham");
	    
	    WebElement txtpass = driver.findElement(By.xpath("//input[@id='pass']"));
	    txtpass.sendKeys("123654789");
	    		
	   WebElement txtlogin= driver.findElement(By.name("login"));
	    txtlogin.click();
		

	}

}
