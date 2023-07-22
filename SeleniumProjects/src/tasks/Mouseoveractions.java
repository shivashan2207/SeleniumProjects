package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Mouseoveractions {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://www.greenstechnologys.com/react-native-training-in-chennai.html");
		driver.manage().window().maximize();
		WebElement mouse = driver.findElement(By.xpath("//div[@title='Courses']"));
		Actions a = new Actions(driver);
		a.moveToElement(mouse).perform();


	}

}
