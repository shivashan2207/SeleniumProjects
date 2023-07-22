package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaScriptSample {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		JavascriptExecutor j = (JavascriptExecutor)driver;
		WebElement txtbox = driver.findElement(By.id("twotabsearchtextbox"));
		j.executeScript("arguments[0].setAttribute('value','iphone')", txtbox);
		WebElement clkbut = driver.findElement(By.id("nav-search-submit-button"));
		j.executeScript("arguments[0].click()", clkbut);

	}

}
