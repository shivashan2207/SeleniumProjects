package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Makemytrip {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
	//	driver.findElement(By.xpath("//div[@class='imageSlideContainer']")).click();
	//	driver.findElement(By.xpath("//span[@class='ic_circularclose_grey']")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Search')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'OKAY, GOT IT!')]")).click();
	
		
		
		List<WebElement> MRP = driver.findElements(By.xpath("//p[text()='AirAsia']/ancestor::div[@class='makeFlex align-items-center gap-x-10 airline-info-wrapper']/following::div[@class='priceSection']"));
		
//		WebElement all;
//		for(int i=0;i<MRP.size();i++) 
//		{
//		 all=MRP.get(i);	
//		 System.out.println(all.getText());
//		}
		
	for(WebElement all1:MRP) 
		{
			System.out.println(all1.getText());

	}

}}