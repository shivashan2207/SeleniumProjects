package tasks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaExecutor {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		//driver.get("https://pict.edu/extracurricular/");
		//		JavascriptExecutor j =(JavascriptExecutor)driver;
		//		WebElement txtemail = driver.findElement(By.id("email"));
		//		j.executeScript("arguments[0].setAttribute('value','greens')", txtemail);
		//		
		//		driver.manage().window().maximize();
		//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//		List<WebElement> links = driver.findElements(By.tagName("a"));
		//		for (WebElement link : links) {
		//			String value = link.getAttribute("href");
		//			HttpURLConnection url = (HttpURLConnection) new URL(value).openConnection();
		//			url.setRequestMethod("HEAD");
		//			url.connect();
		//			int code = url.getResponseCode();
		//			if (code>=400) {
		//				System.out.println(value+"is a brokenlinks");
		//			}
		//			else {
		//				System.out.println(value+"is a valid links");
		//			}
		String homePage = "http://www.zlti.com";
		String url = "";
		HttpURLConnection huc = null;
		int respCode = 200;
		driver.manage().window().maximize();

		driver.get(homePage);

		List<WebElement> links = driver.findElements(By.tagName("a"));

		  Iterator<WebElement> it = links.iterator();

		while(it.hasNext()){

			url = it.next().getAttribute("href");

			System.out.println(url);

			if(url == null || url.isEmpty()){
				System.out.println("URL is either not configured for anchor tag or it is empty");
				continue;
			}

			if(!url.startsWith(homePage)){
				System.out.println("URL belongs to another domain, skipping it.");
				continue;
			}

			try {
				huc = (HttpURLConnection)(new URL(url).openConnection());
			

				huc.setRequestMethod("HEAD");

				huc.connect();

				respCode = huc.getResponseCode();

				if(respCode >= 400){
					System.out.println(url+" is a broken link");
				}
				else{
					System.out.println(url+" is a valid link");
				}

			} catch (MalformedURLException e) {

				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

}}
