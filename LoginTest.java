package day17;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
    driver.findElement(By.name("username")).sendKeys("Admin");
    
    driver.findElement(By.name("password")).sendKeys("admin123");
    
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
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
		
		
	driver.quit();

	}

}
