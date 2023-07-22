package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Exercise4 {

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

		int length = selectobj.getOptions().size()-1;              //
		System.out.println("length"+length);                       //OR LENGTH=11

		int middle = (length/2);
		WebElement middleIndex = options1.get(middle);
		String middleValue = middleIndex.getText();
		System.out.println("middleValue"+middleValue);
	}
	//OR   System.out.println("middleValue"+middleIndex.getText());

	}

