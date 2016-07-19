package com.Data.HandlingPopUps;

import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_WebTables {

	WebDriver driver ;
	@Before
	public void Init(){
		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse_Selenium\\Java_Selenium_Maven\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://only-testing-blog.blogspot.in/2014/05/form.html");
	}
	
	@After
	public void CleanUp(){
		//driver.close();
	}

	@Test
	public void Handling() throws InterruptedException{
		WebElement mytable = driver.findElement(By.xpath(".//*[@id='post-body-8228718889842861683']/div[1]/table/tbody"));
		List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
		int rows_count = rows_table.size();
		for (int row=0; row<rows_count; row++){
			List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName("td"));
			int columns_count = Columns_row.size();Thread.sleep(4000);
			System.out.println("Number of cells In Row "+row+" are "+columns_count);
			for (int column=0; column<columns_count; column++){
				String celltext = Columns_row.get(column).getText(); Thread.sleep(4000);
                System.out.println("Cell Value Of row number "+row+" and column number "+column+" Is "+celltext);
           }
           System.out.println("--------------------------------------------------");
		}
	}
}