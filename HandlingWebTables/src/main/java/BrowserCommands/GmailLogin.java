package BrowserCommands;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {

	WebDriver driver;
	
	@Before
	public void Init(){
		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse_Selenium\\Java_Selenium_Maven\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1");
	}
	
	@After
	public void CleanUp(){
		//driver.close();
	}
	
	@Test
	public void BrowserCommands() throws InterruptedException{
		driver.findElement(By.id("Email")).sendKeys("srinivas.v145");
		driver.findElement(By.id("next")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Passwd")).sendKeys("krishvani");
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(8000);
		//sent mail link click
		driver.findElement(By.xpath("//*[@id=':je']/div/div[1]/span/a")).click();Thread.sleep(4000);
		driver.navigate().back();Thread.sleep(4000);
		driver.navigate().forward();Thread.sleep(4000);
		driver.navigate().back();Thread.sleep(4000);
		driver.navigate().refresh();
	}
}