package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StaleElementException {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		
        driver.get("https://www.facebook.com");

        WebElement element = driver.findElement(By.id("email"));
        element.click();
        driver.navigate().refresh();
        
        try {
        element.click();
        }
        catch(StaleElementReferenceException e) {
        	System.out.println("StaleElementReferenceException");
        }

	}

}
