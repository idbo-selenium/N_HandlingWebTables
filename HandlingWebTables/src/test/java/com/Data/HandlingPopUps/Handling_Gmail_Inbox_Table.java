package com.Data.HandlingPopUps;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Gmail_Inbox_Table {

	WebDriver driver;
	
	@Before
	public void Init(){
		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse_Selenium\\Java_Selenium_Maven\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1");
	}
	
	@After
	public void CleanUp(){
		//driver.close();
	}
	
	@Test
	public void Handling_WebTable() throws InterruptedException{
		driver.findElement(By.id("Email")).sendKeys("srinivas.v145");
		driver.findElement(By.id("next")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Passwd")).sendKeys("krishvani");
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(10000);
		
		//String test = driver.findElement(By.xpath("//*[@id=':iw']/span/b[3]")).getText();
		String test = "2062";
		
		int mails= Integer.valueOf(test);
		int result = (mails/50)+1;
		System.out.println(result +" , "+test);		
		System.out.println(driver.getPageSource());
		for(int i=1;i<=result;i++){
			WebElement gmail_Table = driver.findElement(By.xpath("//*[@id=':3f']/tbody"));
			List<WebElement> rows_table = gmail_Table.findElements(By.tagName("tr"));
			int row_count = rows_table.size();
			System.out.println(row_count);		
			for(int row=0;row<row_count;row++){
				List<WebElement> column_table = rows_table.get(row).findElements(By.tagName("td"));
				int column_count = column_table.size();
				System.out.println("Number of cells in "+row + " row are "+column_count);
				for(int column=4;column<column_count;column++){
					String column_text = column_table.get(column).getText();
					if(!column_text.equals(" ")){
						System.out.println("cell value of row number "+row+" and column number "+column+" is "+column_text);
					}
				}
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			}
			driver.findElement(By.xpath("//*[@id=':iz']/img")).click();
			Thread.sleep(4000);
			System.out.println("success");
			System.out.println("--------------------------------------------");
		}
	}
}