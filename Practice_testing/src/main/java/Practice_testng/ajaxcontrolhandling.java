package Practice_testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class ajaxcontrolhandling {
	public WebDriver driver;

	@Test
	public void f() throws Exception {
		driver.findElement(By.name("q")).sendKeys("selinium");
		Thread.sleep(4000);
		String str = driver.findElement(By.xpath("//div[@class='aajZCb']")).getText();
		//System.out.println(str);
		String[] s = str.split("\n");
		System.out.println("The no of values in s;" + s.length);

		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
			
			
			/*
			 * if (s[i].equalsIgnoreCase("selenium webdriver")) {
			 * driver.findElement(By.name("q")).clear();
			 * driver.findElement(By.name("q")).sendKeys(s[i]);
			 * driver.findElement(By.name("btnK")).click();
			 */
			}

		}

	//}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();

	}

}
