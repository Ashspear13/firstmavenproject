package Com.Testing;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTesting {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\driverfolder\\Chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		
		WebElement alertbox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
		alertbox.click();
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
        WebElement confirmalert = driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
        confirmalert.click();
        
        driver.switchTo().alert().dismiss();
        
        Thread.sleep(5000);
        WebElement promptalert = driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
        promptalert.click();
        
        driver.switchTo().alert().sendKeys("aswin");
        driver.switchTo().alert().accept();
        
       // Thread.sleep(5000);
        //ebElement prompalter1= driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
        //promptalter1.click();
        
        
		//org.openqa.selenium.Alert alert = driver.switchTo().alert();
		//String text = alert.getText();
		//System.out.println(text);
		//driver.switchTo().alert().sendKeys("******");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File Source = ts.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\driverfolder\\SeleniumFirstTc\\Screenshot\\pic1.png");
		
		FileUtils.copyFile(Source, destination);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
