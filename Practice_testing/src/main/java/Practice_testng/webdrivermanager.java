package Practice_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(Practice_testng.ListenerTest.class)
public class webdrivermanager {

	public static WebDriver driver;

	@Test(priority = 0)
	public void openurl() {
		WebDriverManager.chromedriver().setup();
		DesiredCapabilities cap = new DesiredCapabilities();
		WebDriver driver = new ChromeDriver(cap);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void verify() {
		String s = driver.findElement(By.name("btnK")).getText();
		String k = driver.findElement(By.name("btnI")).getText();
		Assert.assertEquals(s, k);

	}

}
