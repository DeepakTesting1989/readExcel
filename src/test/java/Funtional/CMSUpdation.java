package Funtional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CMSUpdation {
	
	WebDriver driver;
	
	@Test(priority=0)
	public void setUp() throws InterruptedException{
		
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
	
	@Test(priority=1)
    public void landingCMS() throws InterruptedException{
		
	driver.findElement(By.xpath("//*[@id='navbarNavDropdown']/ul/li[11]/a")).click();
	Thread.sleep(3000);
	
	String titleclass= "title-main";
	if(driver.getClass().equals(titleclass)){
		
		System.out.println("Redirect to CMS landing page");
	}else{
		System.out.println("Wrong Screen");
	}
	}
	
	@Test(priority=2)
	public void homeCMS() throws InterruptedException{
		
		driver.findElement(By.xpath("//*[@id='bodyMain']/app-content-section/div[1]/div[1]/div[1]/app-left-side-bar/div/ul/li[1]/span/i[1]")).click();	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@class='menu active']//ul[@class='submenu-list']//li[1]//span[1]//i[1]")).click();
		driver.findElement(By.xpath("//h2[@class='title-main'][1]"));
		String text="Banners";
		if (driver.getWindowHandle().contains(text)){
			
			System.out.println("Redirected to Banner Screen");
		}else{
			System.out.println("Wrong Screen");
		}
		Thread.sleep(3000);
	}
	
	@Test(priority=3)
	public void bannerHome() throws InterruptedException{
		
		driver.findElement(By.xpath("//button[@id='publish-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='error']/div/div/div/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='a174']")).sendKeys("E:/DKP/Different file types/2.30.pdf");
		Thread.sleep(3000);
		
		WebElement filecheck= driver.findElement(By.xpath("//*[@id='error']/div/div/div/div[2]/span"));
		
		
		String text="Please upload file in 'JPG,JPEG,PNG' format only.";
		if (filecheck.getAttribute(text) != null){
			
			System.out.println("Redirected to Banner Screen");
		}else{
			System.out.println("Wrong Screen");
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='error']/div/div/div/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='a174']")).sendKeys("E:/DKP/Different file types/1mb.png");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='publish-button']")).click();
		driver.findElement(By.xpath("//*[@id='pop']/div/div/div/button")).click();
		Thread.sleep(3000);
	}

	@Test(priority=4)
	public void whatsNewHome() throws InterruptedException{
		
		driver.findElement(By.xpath("//*[@id='bodyMain']/app-content-section/div[1]/div[1]/div[1]/app-left-side-bar/div/ul/li[1]/ul/li[2]/span/i")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='a157']")).sendKeys("Test Title 001");
		driver.findElement(By.xpath("//input[@id='a163_Yes']")).click();
		driver.findElement(By.xpath("//div[@class='selbtngroup']//button[@type='button']")).click();
		driver.findElement(By.xpath("//td[@class='daycell currmonth tablesingleday']//div[@class='datevalue currmonth']//span[contains(text(),'6')]")).click();
		driver.findElement(By.xpath("//button[@id='publish-button']")).click();
	}
	
}
