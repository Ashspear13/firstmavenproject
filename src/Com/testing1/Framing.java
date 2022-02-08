package Com.testing1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Framing {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\driverfolder\\SeleniumFirstTc\\Chrome\\chromedriver.exe");
		
		WebDriver driver =new  ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		WebElement singleframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(singleframe);
		
		WebElement input = driver.findElement(By.xpath("//input[@type='text']"));
		input.sendKeys("aswin");
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		WebElement mf = driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a"));
		mf.click();
		
		Thread.sleep(3000);
	
		WebElement iframe = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
		
		driver.switchTo().frame(iframe);
		
		
	    WebElement iiframe = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));	
		
		driver.switchTo().frame(iiframe);
		
		Thread.sleep(3000);
		WebElement input1 = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));		
		
		input1.sendKeys("aswinprasanna");
		
		
		driver.switchTo().defaultContent();
		
		
		
		
		
		
		
		
		
		
		
	}
	

	
}
