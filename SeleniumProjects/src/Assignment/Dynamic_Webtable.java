package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Dynamic_Webtable {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://money.rediff.com/indices?src=moneyhome_bseIndices_more");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.findElement(By.xpath("//a[contains(text(),'Show More >>')]")).click();
		
		System.out.println("-------print first column--------------------");
		List<WebElement> allrows = driver.findElements(By.xpath("//table[@id='dataTable']/tbody/tr/td[1]"));
	/*	for(int i=0;i<allrows.size();i++) 
		{
			System.out.println(allrows.get(i).getText());
		}
	*/
		for(WebElement print:allrows) {
			System.out.println(print.getText());
		}
		
		System.out.println("--------------print 10th row-----------------");
		List<WebElement> allcolumn = driver.findElements(By.xpath("//table[@id='dataTable']/tbody/tr[10]/td"));
		for(WebElement print1:allcolumn) {
			System.out.println(print1.getText());
		}
		
		System.out.println("----------Print alternative rows----------------------");
		List<WebElement> alterrows=driver.findElements(By.xpath("//table[@id='dataTable']/tbody/tr"));
		for(int i=0;i<alterrows.size();i=i+2) 
		{
			System.out.println(alterrows.get(i).getText());
		}
		
		System.out.println("----------Print alternative column----------------------");
		List<WebElement> altercolumn=driver.findElements(By.xpath("//table[@id='dataTable']/tbody/tr[1]/td"));
		for(int i=0;i<altercolumn.size();i=i+2) {
			System.out.println(altercolumn.get(i).getText());
		}
		
		System.out.println("----------Print position of particular webelement----------------------");
		List<WebElement> position = driver.findElements(By.xpath("//table[@id='dataTable']/tbody/tr[7]/td[1]"));
		
	
		
	}

}
