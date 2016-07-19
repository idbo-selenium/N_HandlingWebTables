package com.Data.HandlingPopUps;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_MouseHover {

	WebDriver driver;
	@Before
	public void Init(){
		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse_Selenium\\Java_Selenium_Maven\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://trello.com/login");
	}
	
	@After
	public void CleanUp(){
		//driver.close();
	}
	
	@Test
	public void MouseHover() throws InterruptedException{
		//enter username
		driver.findElement(By.id("user")).sendKeys("knskumari");
		//enter password
		driver.findElement(By.id("password")).sendKeys("pass@word1");
		//click login
		driver.findElement(By.id("login")).click();
		Thread.sleep(5000);
		//board click
		driver.findElement(By.xpath("//*[@id='content']/div/div[2]/div/div/div[2]/ul/li/a")).click();Thread.sleep(2000);
		//enter board title
		driver.findElement(By.id("boardNewTitle")).sendKeys("Java");Thread.sleep(2000);
		//create button click
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/form/input[3]")).click();Thread.sleep(2000);
		
		//Enter 1st List name
		driver.findElement(By.xpath("//*[@id='board']/div/form/input")).sendKeys("List1");Thread.sleep(2000);
		//List Save button click
		driver.findElement(By.xpath("//*[@id='board']/div/form/div/input")).click();Thread.sleep(2000);
		//"add a card" click
		driver.findElement(By.xpath("//*[@id='board']/div[1]/div/a")).click();Thread.sleep(2000);
		//enter 1 card name in list 1
		driver.findElement(By.xpath("//*[@id='board']/div[1]/div/div[2]/div/div[1]/div/textarea")).sendKeys("Card11");Thread.sleep(2000);
		//card add button click
		driver.findElement(By.xpath("//*[@id='board']/div[1]/div/div[2]/div/div[2]/div[1]/input")).click();Thread.sleep(2000);
		//enter 2 card name in list 1
		driver.findElement(By.xpath("//*[@id='board']/div[1]/div/div[2]/div[2]/div[1]/div/textarea")).sendKeys("Card12");Thread.sleep(2000);
		//card add button click
		driver.findElement(By.xpath("//*[@id='board']/div[1]/div/div[2]/div[2]/div[2]/div[1]/input")).click();Thread.sleep(2000);
		//enter 3 card name in list 1
		driver.findElement(By.xpath("//*[@id='board']/div[1]/div/div[2]/div[3]/div[1]/div/textarea")).sendKeys("Card13");Thread.sleep(2000);
		//card add button click
		driver.findElement(By.xpath("//*[@id='board']/div[1]/div/div[2]/div[3]/div[2]/div[1]/input")).click();Thread.sleep(2000);
		//X(close) image click
		driver.findElement(By.xpath("//*[@id='board']/div[1]/div/div[2]/div[4]/div[2]/div[1]/a")).click();Thread.sleep(2000);
		
		//Enter 2nd list name
		driver.findElement(By.xpath("//*[@id='board']/div[2]/form/input")).sendKeys("List2");Thread.sleep(2000);
		//List Save button click
		driver.findElement(By.xpath("//*[@id='board']/div[2]/form/div/input")).click();Thread.sleep(2000);
		//"add a card" click
		driver.findElement(By.xpath("//*[@id='board']/div[2]/div/a")).click();Thread.sleep(2000);
		//Enter 1 card name in list 2
		driver.findElement(By.xpath("//*[@id='board']/div[2]/div/div[2]/div/div[1]/div/textarea")).sendKeys("Card21");Thread.sleep(2000);
		//card add button click
		driver.findElement(By.xpath("//*[@id='board']/div[2]/div/div[2]/div/div[2]/div[1]/input")).click();Thread.sleep(2000);
		//Enter 2 card name in list 2
		driver.findElement(By.xpath("//*[@id='board']/div[2]/div/div[2]/div[2]/div[1]/div/textarea")).sendKeys("Card22");Thread.sleep(2000);
		//card add button click
		driver.findElement(By.xpath("//*[@id='board']/div[2]/div/div[2]/div[2]/div[2]/div[1]/input")).click();Thread.sleep(2000);
		//Enter 3 card name in list 2
		driver.findElement(By.xpath("//*[@id='board']/div[2]/div/div[2]/div[3]/div[1]/div/textarea")).sendKeys("Card23");Thread.sleep(2000);
		//card add button click
		driver.findElement(By.xpath("//*[@id='board']/div[2]/div/div[2]/div[3]/div[2]/div[1]/input")).click();Thread.sleep(2000);
		//X(close) image click
		driver.findElement(By.xpath("//*[@id='board']/div[2]/div/div[2]/div[4]/div[2]/div[1]/a")).click();Thread.sleep(2000);
		
		//Enter 3rd list name
		driver.findElement(By.xpath("//*[@id='board']/div[3]/form/input")).sendKeys("List3");Thread.sleep(2000);
		//List 3 Save button click
		driver.findElement(By.xpath("//*[@id='board']/div[3]/form/div/input")).click();Thread.sleep(2000);
		//"add a card" click
		driver.findElement(By.xpath("//*[@id='board']/div[3]/div/a")).click();Thread.sleep(2000);
		//Enter 1 card name in list 3
		driver.findElement(By.xpath("//*[@id='board']/div[3]/div/div[2]/div/div[1]/div/textarea")).sendKeys("Card31");Thread.sleep(2000);
		//card add button click
		driver.findElement(By.xpath("//*[@id='board']/div[3]/div/div[2]/div/div[2]/div[1]/input")).click();Thread.sleep(2000);
		//Enter 2 card name in list 3
		driver.findElement(By.xpath("//*[@id='board']/div[3]/div/div[2]/div[2]/div[1]/div/textarea")).sendKeys("Card32");Thread.sleep(2000);
		//card add button click
		driver.findElement(By.xpath("//*[@id='board']/div[3]/div/div[2]/div[2]/div[2]/div[1]/input")).click();Thread.sleep(2000);
		//Enter 3 card name in list 3
		driver.findElement(By.xpath("//*[@id='board']/div[3]/div/div[2]/div[3]/div[1]/div/textarea")).sendKeys("Card33");Thread.sleep(2000);
		//card add button click
		driver.findElement(By.xpath("//*[@id='board']/div[3]/div/div[2]/div[3]/div[2]/div[1]/input")).click();Thread.sleep(2000);
		//X(close) image click
		driver.findElement(By.xpath("//*[@id='board']/div[3]/div/div[2]/div[4]/div[2]/div[1]/a")).click();Thread.sleep(2000);
		
		//Menu X(close) image click
		driver.findElement(By.xpath("//*[@id='content']/div/div[2]/div/div[1]/a[2]")).click();
		
		//1 list 2 card xpath
		WebElement list1_card12 = driver.findElement(By.xpath("//*[@id='board']/div[1]/div/div[2]/div[2]/div[3]/a"));
		//2 list 2 card xpath
		WebElement list2_card22 = driver.findElement(By.xpath("//*[@id='board']/div[2]/div/div[2]/div[2]/div[3]/a"));
		Actions action = new Actions(driver);
		action.dragAndDrop(list1_card12, list2_card22).perform();
		Thread.sleep(2000);
		//3 list 2 card xpath
		WebElement list3_card32 = driver.findElement(By.xpath("//*[@id='board']/div[3]/div/div[2]/div[2]/div[3]/a"));
		action.dragAndDrop(list2_card22, list3_card32).perform();Thread.sleep(2000);
		
		//keep cards as before in list 1 and list 2
		WebElement list2_card12 = driver.findElement(By.xpath("//*[@id='board']/div[2]/div/div[2]/div[2]/div[3]/a"));
		WebElement list1 = driver.findElement(By.xpath("//*[@id='board']/div[1]/div/div[2]/div[1]/div[3]/a"));
		action.dragAndDrop(list2_card12, list1).perform();Thread.sleep(2000);
		
		//keep cards as before in list 2 and list 3
		WebElement list3_card22 = driver.findElement(By.xpath("//*[@id='board']/div[3]/div/div[2]/div[3]/div[3]/a"));
		WebElement list2 = driver.findElement(By.xpath("//*[@id='board']/div[2]/div/div[2]/div[1]/div[3]/a"));
		action.dragAndDrop(list3_card22, list2).perform();Thread.sleep(2000);
		
		//"Show Menu" click
		driver.findElement(By.xpath("//*[@id='content']/div/div[1]/div[1]/div[2]/a[4]/span[2]")).click();Thread.sleep(2000);
		
		//"More" click
		driver.findElement(By.xpath("//*[@id='content']/div/div[2]/div/div[2]/div/ul/li[5]/a")).click();Thread.sleep(2000);
		//"Close board" click
		driver.findElement(By.xpath("//*[@id='content']/div/div[2]/div/div[2]/div/ul[3]/li/a")).click();Thread.sleep(2000);
		//close button click
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/input")).click();Thread.sleep(2000);
		
		//profile click
		driver.findElement(By.xpath("//*[@id='header']/div[4]/a[2]")).click();Thread.sleep(2000);
		//logout click
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/ul[3]/li/a")).click();Thread.sleep(2000);
	}
}