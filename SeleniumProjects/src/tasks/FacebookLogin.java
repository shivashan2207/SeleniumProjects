package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacebookLogin {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		//to enter URL
				driver.get("https:www.facebook.com/");
				
				//to get title
				String title = driver.getTitle();
			     System.out.println(title);
			     
			     //to get the current url
			     String currentUrl = driver.getCurrentUrl();
			     System.out.println(currentUrl);
			     
			     //to maximize
			     driver.manage().window().maximize();
			     
			      WebElement txtUserName = driver.findElement(By.id("email"));
			       txtUserName.sendKeys("Gowtham");
			    
			   WebElement txtPassWord = driver.findElement(By.id("pass"));                 
				txtPassWord.sendKeys("GreenS@1234");
				
	}

}
