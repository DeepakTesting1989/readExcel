package Funtional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UMethods {

	WebDriver driver;
	@Test
	public void getLogin() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "E:/New Java/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://testserver.sdrc.co.in:8443/bbbp/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'MIS Login')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='usr']")).sendKeys("bbbp_administrator");
		driver.findElement(By.xpath("//input[@id='pwd']")).sendKeys("admin123#!");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
	}
	
	
}
