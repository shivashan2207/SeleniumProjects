package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SnapdealCreateAcc {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get(" http://www.snapdeal.com/");
		
		String t2 = driver.getTitle();
		System.out.println(t2);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		WebElement btnuser = driver.findElement(By.className("accountInner"));
		btnuser.click();
		
		WebElement btnregister = driver.findElement(By.className("newUserRegister"));
	    btnregister.click();
	    driver.switchTo().frame("iframeLogin");  
	    
	    WebElement txtmobile = driver.findElement(By.xpath("//input[@id='userName']"));
		txtmobile.sendKeys("8667704263");
		
		WebElement btncontinue = driver.findElement(By.xpath("//button[@class='btn col-xs-24 btn-large btn-skyblue continueBtn marT20 marB30']"));
		btncontinue.click();

	}

}
