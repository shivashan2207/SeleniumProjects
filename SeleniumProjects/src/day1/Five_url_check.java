package day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Five_url_check {

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
		
		driver.get("https://www.facebook.com");
        driver.manage().window().maximize();   
        String title3 = driver.getTitle();
		System.out.println(title);
		
		
        driver.get("https://www.twitter.com");
		driver.manage().window().maximize(); 
        String title4 = driver.getTitle();
		System.out.println(title2);
		
		driver.get("https://www.ajio.com");
		driver.manage().window().maximize(); 
        String title5 = driver.getTitle();
		System.out.println(title2);
	}

	}

