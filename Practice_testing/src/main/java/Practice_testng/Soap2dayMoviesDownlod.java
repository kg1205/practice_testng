package Practice_testng;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class Soap2dayMoviesDownlod {
	public WebDriver driver;

	@Test(enabled=false)
	public void verify() {
		/*
		 * String actual = driver.findElement(By.id("btnhome")).getText();
		 * System.out.println(actual); String expected = "Home";
		 * System.out.println(expected); Assert.assertEquals(actual, expected);
		 * 
		 * 
		 * if (actual.equalsIgnoreCase(expected)) {
		 * System.out.println("page contains home link text"); }
		 */
		String h = driver.findElement(By.tagName("body")).getText();
		System.out.println(h);
		String s=driver.findElement(By.id("btnhome")).getText();
		if(h.contains(s)) {
			System.out.println("home button is available:");
			//home button link has clicked
			driver.findElement(By.id("btnhome")).click();
			
		}
	}

	@Test(priority = 1)
	public void moviesearch() throws Exception {

		driver.findElement(By.id("btnhome")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Puss in Boots");
		driver.findElement(By.id("btnSearch")).click();
		driver.findElement(By.linkText("Puss in Boots: The Last Wish")).click();
		Thread.sleep(5000);

	}

	@Test(priority = 2)
	public void playtest() throws Exception {

		driver.findElement(By.xpath("//div[@class='jw-icon jw-icon-display jw-button-color jw-reset']")).click();
		Thread.sleep(5000);
		ArrayList<String> s1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(s1.get(1)).close();
		driver.switchTo().window(s1.get(0));
		Thread.sleep(5000);
		/*
		 * driver.findElement(By.
		 * xpath("//div[@class='jw-icon jw-icon-display jw-button-color jw-reset']")).
		 * click(); ArrayList<String> s2 = new
		 * ArrayList<String>(driver.getWindowHandles());
		 * driver.switchTo().window(s2.get(1)).close();
		 * driver.switchTo().window(s2.get(0)); Thread.sleep(5000);
		 * driver.findElement(By.
		 * xpath("//div[@class='jw-icon jw-icon-display jw-button-color jw-reset']")).
		 * click(); ArrayList<String> s3 = new
		 * ArrayList<String>(driver.getWindowHandles());
		 * driver.switchTo().window(s3.get(1)).close();
		 * driver.switchTo().window(s3.get(0));
		 */
		// String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);
		// driver.findElement(By.linkText("urlLink")).sendKeys(selectLinkOpeninNewTab);
		// driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		/*
		 * String sl =
		 * driver.findElement(By.xpath("//video[@class='jw-video jw-reset']")).
		 * getAttribute("src"); System.out.println("sl=============" + sl);
		 * JavascriptExecutor jse = (JavascriptExecutor) driver;
		 *  String a = "window.open('sl','_blank');"; 
		 *  System.out.println("a=====" + a);
		 * jse.executeScript(a); Thread.sleep(5000);
		 */
		String sm = driver.findElement(By.xpath("//video[@class='jw-video jw-reset']")).getAttribute("src");
		System.out.println("sm=============" + sm);
		JavascriptExecutor jsel = (JavascriptExecutor) driver;
		String b = "window.open('"+sm+"','_blank');";
		System.out.println("b=====" + b);
		jsel.executeScript(b);
		
		String mm = driver.findElement(By.tagName("video")).getAttribute("src");
		System.out.println("uihrrf"+mm);
		/*
		 * List<String> n = new ArrayList<String>(driver.getWindowHandles());
		 * driver.switchTo().window(n.get(1)); Thread.sleep(5000);
		 * driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys(sm);
		 * Thread.sleep(5000); driver.findElement(By.name("btnK")).click();
		 */

//		new WebDriverWait(driver, 5)
//		  .until(ExpectedConditions.elementToBeClickable(By.name("q"))).sendKeys(sm);

		/*
		 * WebElement link = driver.findElement(By.tagName("a")); String keyString =
		 * Keys.CONTROL + "t"+Keys.ENTER; link.sendKeys(keyString); List<String> k=new
		 * ArrayList<String>(driver.getWindowHandles());
		 * driver.switchTo().window(k.get(1));
		 */

	}

	@Test(enabled = false)
	public void download() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys(
				"https://q5.s2dstore.to/a/extra/m2/2022/puss.in.boots.the.last.wish.2022.mp4?tok=352D7755586E6B4E49394138616D5535503945686C6F30564939674D586E45394C385134656E4969574D44746A314869474A25334473656D55783637304E533258434A4F6B384A32594236394177586E3064364F6A56586F554256353051666F7A56364A45785A323347524B4435553149424A2D4138676D55395135765255313443484D76674A323357464B253344785130482D464D66554A7A6E534D4D6A6C4F6D6B314B253344766F5A6D557849397678637A484B374E5455596F45395238513866&valid=HrUj93vsTwZxvxv_yiDCuw&t=1673437120");
		driver.findElement(By.name("btnK")).click();
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://soap2day.mx/");
		driver.manage().window().maximize();
	}

}
