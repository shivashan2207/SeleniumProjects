package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Exercise3 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle( );                     
		System.out.println(title);

		WebElement createaccount = driver.findElement(By.xpath("//a[text()='Create New Account']"));          
		createaccount.click();

		Thread.sleep(2000);

		WebElement dmonth = driver.findElement(By.xpath("//select[@id='month']"));
		dmonth.click();
		Select selectobj = new Select(dmonth);

		List<WebElement> options1 = selectobj.getOptions();

		for(int i=0; i<5;i++) 
		{
			System.out.println(options1.get(i).getText());
		}
		System.out.println("--------------------------");

		for(int i=7; i<12;i++) 
		{
			System.out.println(options1.get(i).getText());
		}
	

	}

}
