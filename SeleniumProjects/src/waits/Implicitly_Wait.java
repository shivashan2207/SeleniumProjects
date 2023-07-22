package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Implicitly_Wait {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
        
		driver.get("https://www.facebook.com/login/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //implicitlyWait is a one time delaration
			
			driver.findElement(By.id("email")).sendKeys("chezhiyan1710@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("porchezhiyan");


	}

}
