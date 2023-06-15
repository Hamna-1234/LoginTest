package day17;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
/*
--------
1) Launch browser
2) open url
	https://opensource-demo.orangehrmlive.com/
3) Provide username  - Admin
4) Provide password  - admin123
5) Click on Login button 
6) Verify the title of dashboard page   
	Exp title : OrangeHRM
7) close browse*/

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		//WebDriverManager.chromedriver().setup();
		
		
		
		
		
		
		
		
		
		
	//	WebDriverManager.chromedriver().setup();
	//1,launch browser	
		//ChromeDriver driver =new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		
		
		
		
//	2,url	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	//	WebElement txtusername=driver.findElement(By.name("username"));
		//txtusername.sendKeys("Admin");
		//driver.findElement(By.name("username")).sendKeys("Admin");
		
		
		
		
		
		
		
		 //s="stephy";
		//Thread.sleep(5000);
		
	//username
	//WebElement txtusername=	driver.findElement(By.name("username"));
	//txtusername.sendKeys("Admin");
	
    driver.findElement(By.name("username")).sendKeys("Admin");
    
    driver.findElement(By.name("password")).sendKeys("admin123");
    
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		//String label=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
		
	String actual_title=driver.getTitle();	
	String Exp_title="OrangeHRM";
	
	if(actual_title.equals(Exp_title))
	{
		System.out.println("test passed");
	}
	else
	{
		System.out.println("test failed");
	}
		
	//s="vccv";
		
	//driver.quit();

	}

}
