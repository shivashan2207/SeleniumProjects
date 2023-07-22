package day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacebookKeys {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get(" https://www.facebook.com/");
		
		String title = driver.getTitle();
	     System.out.println(title);
	     
	     String currentUrl = driver.getCurrentUrl();
	     System.out.println(currentUrl);
	     
//	     //driver.manage().window().maximize();
//	     WebElement txtlogin = driver.findElement(By.xpath("//h2[text()='Facebook helps')]"));////h2[@class='_8eso']
//	     String text = txtlogin.getText();
//	     System.out.println(text);
////	     
//	     WebElement xyz = driver.findElement(By.id("email"));
//	     xyz.sendKeys("Asdd"+Keys.ENTER);
//	     xyz.clear();
//	     driver.navigate().refresh();
//	     
//	      
//	    driver.findElement(By.id("pass")).sendKeys("1223654"+Keys.ENTER);
//	    driver.findElement(By.id("login")).click();
//	    

	}

}
