package Com.Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InstagramTesting {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\driverfolder\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		//driver.get("https://www.instagram.com/accounts/login/");
		
		//driver.manage().window().maximize();
		
		//Thread.sleep(5000);
		//WebElement email = driver.findElement(By.xpath("//input[@name='username']"));
		//email.sendKeys("Ashspear.13");
		
		
		//WebElement Logo = driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/div/div/div[1]/h1"));
		//String text = Logo.getText();
		
		//System.out.println(text);
		
		//WebElement clickbutton = driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/div/div/div[2]/div/p/a/span"));
		//clickbutton.click();

          driver.get("http://leafground.com/pages/Dropdown.html");
          
          driver.manage().window().maximize();
          
          
          WebElement finding =driver.findElement(By.xpath("//select[@id='dropdown1']"));
          
          Select s =new Select(finding);
          
          
          s.selectByValue("1");
          Thread.sleep(3000);
          s.selectByVisibleText("Appium");
          
          
          Thread.sleep(3000);
          s.selectByIndex(3);
          
          
          
          
        //  List<WebElement> options = s.getOptions();
          //for (WebElement webElement : options){
        	//  System.out.println(webElement.getText());
          
          
        List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
          for (WebElement a : allSelectedOptions){
        	  System.out.println(a.getText());
			
        	  
        	  System.out.println("\\\\\\\\\\\\\\");  
        	  
        	  
        	 WebElement firstSelectedOption = s.getFirstSelectedOption(); 
        	  System.out.println(firstSelectedOption.getText());   	  
        	  
        	  
        	  
        	  
		}
			
		}
          
}  
          
          
          
		
		
		
	


