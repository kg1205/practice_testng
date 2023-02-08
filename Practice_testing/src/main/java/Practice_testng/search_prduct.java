package Practice_testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class search_prduct {
	public WebDriver driver;
	
  @Test(priority = 1)
  public void signin() throws Exception {
	  driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.name("login[username]")).sendKeys("gk@gmail.com");
		driver.findElement(By.name("login[password]")).sendKeys("gk@12345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"send2\"]/span")).click();
		System.out.println("sigin method is successfull with valid creditionals");
		System.out.println("valid creditionals are ");
		System.out.println("username: gk@gmail.com");
		System.out.println("password: gk@12345");
  }
  @Test(priority = 2)
  public void Search_product() throws Exception {
	  Actions a=new Actions(driver);
	  Thread.sleep(2000);
	  a.moveToElement(driver.findElement(By.xpath("//*[@id=\"ui-id-6\"]/span[2]"))).build().perform();
	  Thread.sleep(2000);
	  a.moveToElement(driver.findElement(By.xpath("//*[@id=\"ui-id-26\"]/span"))).click().perform();
	  driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[9]/div/div/strong/a")).click();
	  String s1= driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[1]/h1/span")).getText();
	  System.out.println(s1);
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"ui-id-3\"]/span")).click();
	  driver.findElement(By.name("q")).sendKeys("Zing Jump Rope");
	  Thread.sleep(5200);
	  driver.findElement(By.xpath("//*[@id=\"search_autocomplete\"]/ul")).click();
	 
	  String s2= driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[2]/div[2]/ol/li/div/div/strong/a")).getText();
	  System.out.println(s2);
	  if(s1.equalsIgnoreCase(s2)) {
		  System.out.println("results matched :Test case passed");
	  }
	  else {
		  System.out.println("results not matched:test case failed");
	  }
  }
 
	  
	  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
  }

}
