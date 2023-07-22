package day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class ReuseMethodSample {
	public static WebDriver driver;

	public WebDriver WebdriverSetup(){
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	public static void MaximizeWindow(){
		driver.manage().window().maximize();	
	}
	public void launchUrl(String url) {
		driver.get(url);
	}
	public void closeBrowser() {
		driver.close();
	}
	public void sleepMethod(int sleepSeonds) throws InterruptedException {
		Thread.sleep(sleepSeonds);
	}
	public void quiteBrowser() {
		driver.quit();
	}

	public void buttonClick(WebElement button) {
		button.click();
	}

	public String getTitleText() {
		String title = driver.getTitle();
		return title;
	}

	public String getCurrrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	public void implicitWait(int Time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Time));
	}

	public void sreenshot() throws IOException {
		TakesScreenshot s =(TakesScreenshot)driver;
		File source = s.getScreenshotAs(OutputType.FILE);
		File destination = new File("./Snapshots/reusemethod.png");
		FileHandler.copy(source, destination);     //FileUtis.copyFile(source,destination);
	}

	public void alerts() {
		Alert a =driver.switchTo().alert();
		a.accept();
	}
	public void mouseover(WebElement btncourse) {
		Actions actionObj = new Actions(driver);
		actionObj.moveToElement(btncourse).perform();
	}
	public void rightclick(WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).perform();
	}
	public void doubleclick(WebElement element) {
		Actions a = new Actions(driver);
		a.doubleClick(element).perform();
	}
	public void sendinput (WebElement element,String input) {
		element.sendKeys(input);
	}
	public void buttonclick(WebElement element) {
		element.click();
	}
	public void browserclose() {
		driver.close();
	}
	public void browserquit() {
		driver.quit();
	}
	public void dropdown (WebElement element,String  text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	public void explicitwait (int sec) {                      //

	}
	public void navigateback() {
		driver.navigate().back();
	}
	public void navigateforward() {
		driver.navigate().forward();
	}
	public void browseRefresh() {
		driver.navigate().refresh();
	}
	public void frames (WebElement element) {
		driver.switchTo().frame(element);
	}
	public void defaultframe() {
		driver.switchTo().defaultContent();
	}
	public void windowhandling(String url) {
		driver.switchTo().window(url);
	}

	public String gettext(WebElement element) {
		String s = element.getText();
		return s;
	}
	public String getattribute(WebElement element) {
		String s = element.getAttribute("value");
		return s;
	}
	public void draganddrop(WebElement from,WebElement to) {
		Actions dd = new Actions(driver);
		dd.dragAndDrop(from, to).perform();
	}
	public void textHighlight(WebElement facebook, String color) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].style.backgroundColor= '"+color+"'", facebook);
				
}}
