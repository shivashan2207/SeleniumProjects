package tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		WebElement fruits = driver.findElement(By.id("fruits"));
		Select s=new Select(fruits);
		s.selectByIndex(3);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		for (int i = 0; i < 3; i++) {
			s.selectByIndex(i);
			
		}
		List<WebElement> options1 = s.getOptions();
		for (int i = 0; i < options1.size(); i++) {
			WebElement webElement = options1.get(i);
			String text = webElement.getText();
			System.out.println(text);
		}
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println(text);
		s.deselectByIndex(2);
		s.deselectByValue("grape");
		s.deselectByVisibleText("Banana");
		
		//s.deselectAll();
			

	}

}
