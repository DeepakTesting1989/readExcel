package Funtional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SOSO {

	WebDriver driver;
	@Test
	public void redg() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "E:/New Java/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://testserver.sdrc.co.in:8443/sbm100web");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("admin");;
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys("test@123#");;
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
	}
}
