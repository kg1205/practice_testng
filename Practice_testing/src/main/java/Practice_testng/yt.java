package Practice_testng;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class yt {
	public WebDriver driver;

	@Test
	public void search() throws Exception {
		Thread.sleep(5000);
		driver.findElement(By.name("search_query")).sendKeys("7th sense");
		List<WebElement>s1=new ArrayList<>(driver.findElements(By.tagName("ul")));
		System.out.println("jkngfnfd");
		for (WebElement p1 : s1) {
			String f1 = p1.getText();
			System.out.println(f1);
		}
		}

	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
	}

}
