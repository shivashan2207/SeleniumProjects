package day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacebookLaunch {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();   
		
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getTitle());

	}

}
