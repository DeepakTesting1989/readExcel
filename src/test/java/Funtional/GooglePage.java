package Funtional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GooglePage {

	
	WebDriver driver;
	@Test
	public void search() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "E:/New Java/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("SDRC");
		Thread.sleep(3000);
		
	}

}
