import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstTc {
	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver","C:\\driverfolder\\chromedriver.exe");


WebDriver driver =new ChromeDriver();

driver.get("https://www.facebook.com/");
driver.manage().window().maximize();


WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
create.click();

Thread.sleep(5000);
WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
Select s =new Select(day);

s.selectByValue("13");


WebElement month =driver.findElement(By.xpath("//select[@title='Month']"));
Select a=new Select(month);
a.selectByVisibleText("Feb");
//boolean multiple = a.isMultiple();
//System.out.println(multiple);

Thread.sleep(5000);
WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
Select b= new Select(year);
b.selectByValue("1998");
	}


}