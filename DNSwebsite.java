package deepnet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DNSwebsite {

	WebDriver driver;	

	@BeforeTest
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@BeforeMethod
	public void Url() {

		driver.get("http://compreg.deepnetsoft.com");
		driver.manage().window().maximize();
	}

	@Test(priority=1)
	public void login() throws InterruptedException {
		//invalid data
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div/form/div[1]/input")).sendKeys("adwaidjoju1000");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div/form/div[3]/input")).sendKeys("321213545454");
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div/form/div[5]/button")).click();	  
	    
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div/form/p[3]/a")).click();
	    
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div/form/div[3]/p/span/a")).click();
	    
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div/form/p[3]/a")).click();
	    
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div/form/input")).sendKeys("adwaidjoju44");
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div/form/div[2]/button")).click();
	    
	    Thread.sleep(1000);
	      		
	}

	@Test(priority=2)
	public void signup() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div/form/div[6]/p/span/a")).click();
		// valid inputs
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/form/div[1]/div[1]/input")).sendKeys("Adwaid");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/form/div[1]/div[2]/input")).sendKeys("S");
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/form/input")).sendKeys("adwaidjoju19");
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/form/div[2]/div[1]/input")).sendKeys("adwaidjoju@gmail.com");
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/form/div[2]/div[2]/input")).sendKeys("9074915812");
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/form/div[3]/div[1]/input")).sendKeys("adwaidjoju1234@G");
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/form/div[3]/div[2]/input")).sendKeys("adwaidjoju1234@G");
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/form/button")).click();
	    
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div/div/form/input[1]")).sendKeys("www.facebook.com");
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div/div/form/input[2]")).sendKeys("www.instagram.com");
	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,350)", "");
	    
	    //save and continue
	    driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/form/div[1]/button[2]")).click();
	    
	    //if no data is entered skip and continue can be used
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/form/div[1]/button[1]")).click();	   
	    
	}

	@Test(priority=3)
	public void otherfunctions() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div/form/div[6]/p/span/a")).click();
		
		  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[1]/div/select"));
		    
		    Thread.sleep(1000);
		    
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[1]/div/select/option[2]")).click();
		    
		    Thread.sleep(1000);
		// invalid inputs
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/form/div[1]/div[1]/input")).sendKeys("123456789");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/form/div[1]/div[2]/input")).sendKeys("@#$");
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/form/input")).sendKeys("@ad123654");
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/form/div[2]/div[1]/input")).sendKeys("invalid@gmail.com");
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/form/div[2]/div[2]/input")).sendKeys("adadadadad");
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/form/div[3]/div[1]/input")).sendKeys("32165987");
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/form/div[3]/div[2]/input")).sendKeys("32165987");
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/form/button")).click();
	    
	    Thread.sleep(4000);
	
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,350)", "");
	    
	    driver.findElement(By.xpath(" //*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div/p")).click();
	    
	    Thread.sleep(4000);
	    
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/form/button")).click();
	    
	    Thread.sleep(4000);
		
	    JavascriptExecutor js1 = (JavascriptExecutor) driver;
	    js1.executeScript("window.scrollBy(0,350)", "");
	    
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div/div/form/div[2]/p/span/a")).click();
	    
	    Thread.sleep(1000);
	    
	    JavascriptExecutor js2 = (JavascriptExecutor) driver;
	    js2.executeScript("window.scrollBy(0,-350)", "");
	    
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/select"));
	    
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/select/option[1]")).click();
	    
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div/form/div[1]/input")).sendKeys("adwaidjoju19");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div/form/div[3]/input")).sendKeys("adwaidjoju1234@G");
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div/form/div[5]/button")).click();	
	    
	    Thread.sleep(5000);
	    
	    driver.quit();
	    
	}
}
