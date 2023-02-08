package Practice_testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class informationcommands {
	public WebDriver driver;
  @Test
  public void f() {
	  String str1=driver.findElement(By.linkText("Gmail")).getText();
	  System.out.println("Text available on link:"+str1);
	  String str2=driver.findElement(By.name("btnI")).getAttribute("aria-label");
	  System.out.println("link available on button"+str2);
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://google.com");
	  driver.manage().window().maximize();
  }

}
