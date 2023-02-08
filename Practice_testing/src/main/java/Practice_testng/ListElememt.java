package Practice_testng;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class ListElememt {
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
	public void list() throws Exception {
		Actions a = new Actions(driver);
		Thread.sleep(5000);
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"ui-id-5\"]"))).build().perform();
		a.moveToElement(driver.findElement(By.id("ui-id-17"))).perform();
		a.moveToElement(driver.findElement(By.id("ui-id-22"))).click().perform();

		// List<WebElement>
		// SideList=driver.findElements(By.xpath("//*[@id=\"layered-filter-block\"]"));
		// for (WebElement SdList : SideList) {
		// String str= SdList.getText();
		// System.out.println(str);

	}

	// }
	@Test(priority = 3)
	public void getText() throws Exception {
		System.out.println("values before sorting:");
		List<WebElement> text = driver.findElements(By.tagName("strong"));
		System.out.println("st values are :");
		for (WebElement test : text) {
			String st = test.getText();
			System.out.println(st);
		}
	}

	@Test(priority = 4)
	public void gettext2() throws Exception {
		Thread.sleep(5000);
		Select s = new Select(driver.findElement(By.id("sorter")));
		s.selectByIndex(1);
		Thread.sleep(5000);
		System.out.println("values after sorting:");
		List<WebElement> text1 = driver.findElements(By.tagName("strong"));
		System.out.println("st1 values are :");
		for (WebElement test1 : text1) {
			String st1 = test1.getText();
			System.out.println(st1);

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
