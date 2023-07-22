package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import day2.ReuseMethodSample;

public class Drag_and_Drop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
//		WebDriver driver= new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://demo.guru99.com/test/drag_drop.html");
//		driver.manage().window().maximize();
//		
//		Actions actionObj=new Actions(driver);
//		WebElement From=driver.findElement(By.xpath("//a[text()=' BANK ']"));
//		WebElement To=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
//		actionObj.dragAndDrop(From, To).perform();
//	
//		
//		WebElement From1=driver.findElement(By.xpath("//a[text()=' 5000 ']"));
//		WebElement To1=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));	
//		actionObj.dragAndDrop(From1, To1).perform();
//		
//		WebElement From2=driver.findElement(By.xpath("//a[text()=' SALES ']"));
//		WebElement To2=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));	
//		actionObj.dragAndDrop(From2, To2).perform();
//		
//		WebElement From3=driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
//		WebElement To3=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));	
//		actionObj.dragAndDrop(From3, To3).perform();
		
		
	    ReuseMethodSample r = new ReuseMethodSample();
		WebDriver driver = r.WebdriverSetup();
		r.launchUrl("https://demo.guru99.com/test/drag_drop.html");
	    r.MaximizeWindow();
		
		WebElement From=driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement To=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		r.draganddrop(From, To);
	
		
		WebElement From1=driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement To1=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		r.draganddrop(From1, To1);
		
		WebElement From2=driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement To2=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));	
		r.draganddrop(From2, To2);
		
		WebElement From3=driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement To3=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));	
		r.draganddrop(From3, To3);
		

	}

}
