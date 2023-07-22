package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
       
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.geeksforgeeks.org/");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Data Structures and Algorithms")));
		
		WebElement algoLinkText = driver.findElement(By.linkText("Data Structures and Algorithms"));
		algoLinkText.click();
		
		WebDriverWait alertWait = new  WebDriverWait(driver,Duration.ofSeconds(15));
		alertWait.until(ExpectedConditions.alertIsPresent());
		
		Thread.sleep(5000);
		driver.close();
	
	}

}
