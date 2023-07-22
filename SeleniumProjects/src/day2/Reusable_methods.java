package day2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Reusable_methods {

	public static void main(String[] args) throws IOException {
		
		ReuseMethodSample reuseObject = new ReuseMethodSample();
	    WebDriver driver = reuseObject.WebdriverSetup();
	    reuseObject.MaximizeWindow();
	    
	    reuseObject.launchUrl("https:www.facebook.com");
	    //reuseObject.closeBrowser();
	    System.out.println(reuseObject.getTitleText());
	    
	    WebElement emailElement = driver.findElement(By.id("email"));
	    reuseObject.sendinput(emailElement, "chezhiyan1710@gmail.com");
	    
	    WebElement passElement = driver.findElement(By.id("pass"));
	    reuseObject.sendinput(passElement, "Porchezhiyan");
	    
//	    reuseObject.sleepMethod(2000);
	//    
//	    WebElement loginButton = driver.findElement(By.name("pgom"));
//	    reuseObject.buttonClick(loginButton);
	//    
//	    reuseObject.implicitWait(10);
	    
	    reuseObject.sreenshot();
		}

	}


