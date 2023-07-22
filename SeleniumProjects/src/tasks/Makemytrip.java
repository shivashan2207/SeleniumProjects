package tasks;

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
		driver.get("https://www.makemytrip.com/flight/search?tripType=O&itinerary=BDQ-DEL-11/04/2023&paxType=A-1_C-0_I-0&cabinClass=E&sTime=1681211095933&forwardFlowRequired=true&action=FLTSRCH&deptDate=%24date_7&retnDate=&intl=false&cmp=SEM%7CD%7CDF%7CB%7CRoute%7CDF_Route_Exact_3%7CVadodara_Delhi_Exact%7CRSA%7C&s_kwcid=AL%211631%213%21%21b%21%21o%21%21indigo+flight+booking&ef_id=14d0b7ce1ae71b4ea313d3e21eb2c340%3AG%3As&gclid=null&isSemFlow=true");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//		//		driver.findElement(By.xpath("//*[text()='Search']")).click();
		//		//		//driver.findElement(By.xpath("//span[@class='bgProperties icon20 overlayCrossIcon']")).click();
		//		driver.findElement(By.xpath("//*[@class='bgProperties icon20 overlayCrossIcon']")).click();
		//		driver.findElement(By.xpath("(//*[@type='checkbox'])[3]")).click(); 
		//
		//		String text7 = driver.findElement(By.xpath("(//p[text()='IndiGo'])[1]")).getText();
		//		System.out.println(text7);
		//		String text = driver.findElement(By.xpath("(//p[@class='blackText fontSize18 blackFont white-space-no-wrap'])[1]")).getText();
		//		System.out.println(text);
		//		String text1 = driver.findElement(By.xpath("(//p[@class='blackText fontSize18 blackFont white-space-no-wrap'])[2]")).getText();	
		//		System.out.println(text1);
		//		String text2 = driver.findElement(By.xpath("(//p[@class='blackText fontSize18 blackFont white-space-no-wrap'])[3]")).getText();	
		//		System.out.println(text2);
		//		String text3 = driver.findElement(By.xpath("(//p[@class='blackText fontSize18 blackFont white-space-no-wrap'])[4]")).getText();	
		//		System.out.println(text3);
		//		String text4 = driver.findElement(By.xpath("(//p[@class='blackText fontSize18 blackFont white-space-no-wrap'])[5]")).getText();	
		//		System.out.println(text4);
		//		String text5 = driver.findElement(By.xpath("(//p[@class='blackText fontSize18 blackFont white-space-no-wrap'])[6]")).getText();	
		//		System.out.println(text5);
		//		String text6 = driver.findElement(By.xpath("(//p[@class='blackText fontSize18 blackFont white-space-no-wrap'])[7]")).getText();	
		//		System.out.println(text6);
		//		String text9 = driver.findElement(By.xpath("(//p[@class='blackText fontSize18 blackFont white-space-no-wrap'])[8]")).getText();	
		//		System.out.println(text9);
		//		String text8 = driver.findElement(By.xpath("(//p[@class='blackText fontSize18 blackFont white-space-no-wrap'])[9]")).getText();	
		//		System.out.println(text8);


		//driver.findElement(By.xpath("//span[@class='bgProperties icon20 overlayCrossIcon']")).click();
		//List<WebElement> txt = driver.findElements(By.xpath("//div[@class='makeFlex align-items-center gap-x-10 airline-info-wrapper']/descendant::p[text()='IndiGo']"));
		//String value = element.getText();
		//System.out.println(value);

		
		//div[@id='listing-id']/descendant::p[text()='IndiGo']/following::div[@class='priceSection']
		
		driver.findElement(By.xpath("//span[@class='bgProperties icon20 overlayCrossIcon']")).click();	
		List<WebElement> list = driver.findElements(By.xpath("//div[@id='listing-id']/descendant::p[text()='Air India']/following::div[@class='priceSection']"));
		for (WebElement webElement : list) {
			System.out.println(webElement.getText());
		}
		
	}

}
