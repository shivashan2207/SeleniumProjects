package day4;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon_downpress {

	public static void main(String[] args) throws AWTException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();   
		String title = driver.getTitle();
		System.out.println(title);
		
		
		Robot robotkey = new Robot();
		for(int i=0;i<8;i++)
		{
		robotkey.keyPress(KeyEvent.VK_TAB);
		robotkey.keyRelease(KeyEvent.VK_TAB);
		}
		
		robotkey.keyPress(KeyEvent.VK_ENTER);
	}

	}



