package tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Webtable {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://demo.guru99.com/test/write-xpath-table.html");
		String title = driver.getTitle();
		System.out.println(title);

		List<WebElement> row = driver.findElements(By.tagName("tr"));
		for (int i = 0; i < row.size(); i++) {
			WebElement webElement = row.get(i);
			String text = webElement.getText();
			System.out.println(text);

	}

}}
