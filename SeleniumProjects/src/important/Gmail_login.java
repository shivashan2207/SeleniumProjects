package important;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Gmail_login {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		
		WebElement qElement = driver.findElement(By.name("q"));
		qElement.sendKeys("gmail login");
		
		WebElement btnKButton = driver.findElement(By.id("btnK"));
		btnKButton.click();
		

	}

}
