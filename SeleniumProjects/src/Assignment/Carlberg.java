package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Carlberg {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.carlsberg.com/en/");
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.findElement(By.id("cbg_ccp_cookie_allow_all_btn")).click();
        //enter date of birth
       
        driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("1");
        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9");
        driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("9");
        driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("5");
        driver.findElement(By.xpath("//button[text()='ENTER']")).click();        
        
        
       
	}

}
