package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Webtable2 {

	
	public static void main(String[] args) {
		
	
	ReuseMethodSample r = new ReuseMethodSample();
	WebDriver driver=r.WebdriverSetup();
	r.launchUrl("https://www.w3schools.com/html/html_tables.asp");
	r.MaximizeWindow();

	WebElement table = driver.findElement(By.id("customers"));

	List<WebElement> allRows = table.findElements(By.tagName("tr"));
	int length = allRows.size()-1;
	System.out.println("length--->"+length);
    
	System.out.println("ONE--------");
	//Print last 2 rows all datas
	for  (int i=length-1; i<=length; i++) 
	{
		System.out.println(allRows.get(i).getText());	
	}

	System.out.println("TWO--------");
	//print the alternatives rows data
	
	for (int i=0; i<=length; i=i+2) 
	{
		System.out.println(allRows.get(i).getText());
	}
	
	System.out.println("THREE--------");
	//print the last column all rows data
	List<WebElement>allColumn = table.findElements(By.tagName("td"));
	int length1 = allColumn.size();
	for  (int i=2; i<=length1; i=i+3) 
	{
		System.out.println(allColumn.get(i).getText());	
	}

	System.out.println("FOUR--------");
	//print the count of tables
	System.out.println("length1--->"+length1);
	
	
	
	
	
	



	
	
	//print the all tables data(without looping)
	//print the all alternatives column data
	//print the all tables data (withlooping)
	//print the middle row all data
	//print the alternates data in each column
	//with out using olumn number+Row number, how to get the value

}}
