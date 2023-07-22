package important;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Facebook_dropdown {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options); 
		driver.get("https://www.facebook.com/");
	        driver.manage().window().maximize();
			String title = driver.getTitle( );                     
			System.out.println(title);
			
			WebElement createaccount = driver.findElement(By.xpath("(//a[@role='button'])[2]"));          
			createaccount.click();
			
			Thread.sleep(2000);
			
			WebElement dmonth = driver.findElement(By.xpath("//select[@id='month']"));
			dmonth.click();
			
			Select selectobj = new Select(dmonth);
			selectobj.selectByIndex(3);
			Thread.sleep(2000);

			selectobj.selectByValue("10");           //OCT
			Thread.sleep(2000);
			
			selectobj.selectByVisibleText("Jan");
			Thread.sleep(2000);
			
			List <WebElement> list = selectobj.getOptions();
			System.out.println("size"+list.size());
			System.out.println("lastIndex"+list.get(list.size()-1).getText());  //op=3
			
			WebElement firstIndex = list.get(0);
			String firstValue = firstIndex.getText();
			System.out.println("Month Name"+firstValue);      //OP=4
			
				
			int length = selectobj.getOptions().size()-1;
			System.out.println("length"+length);              //OP=5

			WebElement lastIndex = list.get(length);
			String lastvalue = lastIndex.getText();
			
			int middle = (length/2);
			WebElement middleIndex = list.get(middle);
			String middleValue = middleIndex.getText();
			System.out.println("middleValue"+middleValue);
			
			for(int i=selectobj.getOptions().size()-5;
					i<selectobj.getOptions().size();i++)
			{
				WebElement index = list.get(i);
				String indexValue = index.getText();
	            System.out.println((i+1)+indexValue);	
			}
		}


	}


