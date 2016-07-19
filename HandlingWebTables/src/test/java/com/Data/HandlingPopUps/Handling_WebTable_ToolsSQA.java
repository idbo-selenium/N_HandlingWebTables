package com.Data.HandlingPopUps;

import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_WebTable_ToolsSQA {

	WebDriver driver;
	@Before
	public void Init(){
		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse_Selenium\\Java_Selenium_Maven\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-table/");
	}
	
	@After
	public void CleanUp(){
		driver.close();
	}
	
	@Test
	public void Handling_ToolsSQA() throws InterruptedException{

		//thead
		WebElement myhead = driver.findElement(By.xpath("//*[@id='content']/table/thead"));
		List<WebElement> table_head = myhead.findElements(By.tagName("tr"));
		
		//tbody
		WebElement mytable = driver.findElement(By.xpath("//*[@id='content']/table/tbody"));
		List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
		int rows_count = rows_table.size(); 
		for(int row = 0;row<rows_count;row++){
			List<WebElement> columns_row = rows_table.get(row).findElements(By.tagName("td"));
			List<WebElement> head_row = table_head.get(0).findElements(By.tagName("th"));
			int columns_count = columns_row.size();Thread.sleep(2000);
			//int head_count = head_row.size();
			System.out.println("Number of cells in Row "+row+" are "+columns_count);
			for(int column=0;column<columns_count;column++){
				String celltext = columns_row.get(column).getText();
				String headtext = head_row.get(column+1).getText();
				System.out.println("Cell value of row heading "+headtext+"(row number:"+row+") and column number "+column+" is "+celltext);
			}
			System.out.println("---------------------------------------------------");
		}
	}
}