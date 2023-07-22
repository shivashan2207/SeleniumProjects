package important;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Visible {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
       
		driver.manage().window().maximize();
		driver.get("https://ww.facebook.com");
		driver.manage().window().maximize();
		
		WebElement btnlogin = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		//to check whether the element is displayed or not
		boolean displayed = btnlogin.isDisplayed();
		System.out.println(displayed);
	    //to check whether the element is enabled or not
		boolean enabled = btnlogin.isEnabled();
		System.out.println(enabled);
		
		WebElement createbtn = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		createbtn.click();
		Thread.sleep(3000);
		
		WebElement gender = driver.findElement(By.xpath("//input[@value='1']"));
		gender.click();
		//to check whether WebElement is selected.
		boolean select=gender.isSelected();
		System.out.println(select);


	}

}
