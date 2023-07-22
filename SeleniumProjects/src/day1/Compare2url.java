package day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Compare2url {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.amazon.com");
        driver.manage().window().maximize();   
        String title = driver.getTitle();
		System.out.println(title);
		
		
        driver.get("https://www.flipkart.com");
		driver.manage().window().maximize(); 
        String title2 = driver.getTitle();
		System.out.println(title2);
		
		driver.close();
		
		
		if(title.equals(title2)) 
		{
			System.out.println("Both the title are same");
		}
		else 
		{
			System.out.println("Both the title are different");

	}

}}
