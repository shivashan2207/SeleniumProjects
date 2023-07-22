package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Executive_Script {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();        
		String title = driver.getTitle();
		System.out.println(title);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		String height = jse.executeScript("return window.innerHeight;").toString();
		System.out.println(height);
		
		jse.executeScript("window.scrollBy(0,1000)");       //scroll down
		Thread.sleep(5000);
	    jse.executeScript("window.scrollBy(0,-612)");      //scroll up
		Thread.sleep(5000);
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");     //scroll from top to bottom
		Thread.sleep(5000);
		
		 //for particular web element  
		WebElement shop = driver.findElement(By.xpath("//img[@alt='Create with strip lights']"));   
	    jse.executeScript("arguments[0].scrollIntoView()", shop);
	    jse.executeScript("arguments[0].click();", shop);
	    Thread.sleep(5000);
	    String url =jse.executeScript("return document.URL;").toString();
		System.out.println(url);
		
		//navigate to different to page
		jse.executeScript("window.location = 'https://www.flipkart.com'");
		
        //full scroll down
	    jse.executeScript("window.scroll(0,0)");
	    Thread.sleep(5000);

	}

}
