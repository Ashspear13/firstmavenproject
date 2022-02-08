package Com.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPractise {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\driverfolder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();
		
		Thread.sleep(5000);
		WebElement emailenter = driver.findElement(By.xpath("//*[@id=\"email_create\"]"));
		emailenter.sendKeys("aswinprasanna13@gmail.com");
		
		Thread.sleep(5000);
		WebElement signin1 = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
		signin1.click();
		
		
		//WebElement name = driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
		//name.sendKeys("aswin");
		
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		women.click();
		
        Thread.sleep(3000);
		WebElement addtocart = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span"));
		addtocart.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
