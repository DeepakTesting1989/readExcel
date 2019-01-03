package Funtional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LactstionTest {

	WebDriver driver;
	
	@Test
	public void redg() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "E:/New Java/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://lactation-test.firebaseapp.com/");
		driver.findElement(By.xpath("//*[@id='undefined']/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='rb-2-0']//span[@class='button-inner']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'OK')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'I Agree')]")).click();
		Thread.sleep(3000);
	}
}
