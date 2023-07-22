package day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Frames {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();	
        
//		driver.switchTo().frame("a077aa5e");        //method 1 for finding a frame

		WebElement frameElement = driver.findElement(By.id("a077aa5e"));     //method 2 for finding a frame using a WebElement 
		driver.switchTo().frame(frameElement);
		
//		WebElement imageElement = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
//		imageElement.click();
		
	    driver.switchTo().defaultContent();     // to get out of the frame WebElement, then only we can use webelement 
		
	    WebElement emailElement = driver.findElement(By.id("philadelphia-field-email"));
	    emailElement.sendKeys("chezhiyan1710@gmail.com");
	    
	    List<WebElement> frameSet = driver.findElements(By.tagName("iframe"));     //findElement's' - is used to find how many 
	    int length = frameSet.size();                                              //-elements is there in the document
	    System.out.println(length);
	    

	}

}
