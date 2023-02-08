package Practice_testng;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class copy1 {
	public WebDriver driver;

	@Test
	public void verify() {
		/*
		 * String actual = driver.findElement(By.id("btnhome")).getText();
		 * System.out.println(actual); 
		 * String expected = "Home";
		 * System.out.println(expected); 
		 * Assert.assertEquals(actual, expected);
		 * 
		 * 
		 * if (actual.equalsIgnoreCase(expected)) {
		 * System.out.println("page contains home link text"); }
		 */
		String h = driver.findElement(By.tagName("body")).getText();
		System.out.println(h);
		String s = driver.findElement(By.id("btnhome")).getText();
		if (h.contains(s)) {
			System.out.println("home button is available:");
			// home button link has clicked
			driver.findElement(By.id("btnhome")).click();

		}
	}

	@Test(enabled=false)
	public void verify_page1() throws Exception {
		String g = driver.findElement(By.xpath("//div[@class='container'][position()=1]")).getText();
		System.out.println("the total text available in page 1 is:" + g);
		Thread.sleep(5000);
		String j = driver.findElement(By.xpath("//div[@class='container'][position()=2]")).getText();
		System.out.println(j);
		
		
		String a = driver.findElement(By.xpath("//div[@class='col-lg-6 col-md-12 col-sm-12'][position()=2]")).getText();
		String[] b = a.split("\n");
		System.out.println("text available on page:::::::::");
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		
		if(j.contains(b[15])) {
			System.out.println("required line is on page of 16th position::::::::::::::::::::"+b[15]);
		}
	}
	
	@Test(priority = 2)
	public void clickonlinktext() throws Exception{
		String g = driver.findElement(By.xpath("//div[@class='container'][position()=1]")).getText();
		System.out.println("the total text available in page 1 is:" + g);
		Thread.sleep(5000);
		String j = driver.findElement(By.xpath("//div[@class='container'][position()=2]")).getText();
		System.out.println(j);
		String a = driver.findElement(By.xpath("//div[@class='col-lg-6 col-md-12 col-sm-12'][position()=1]")).getText();
		
		String[] k = a.split("\n");
		System.out.println("hrghgfjkhgfhhuhgfgfxfhgudfhhj===============");
		for(int i=0;i<k.length;i++) {
			System.out.println(k[i]);
		}
		if(j.contains(k[5])) {
			System.out.println("k15===="+k[5]);
			driver.findElement(By.linkText("Rambo: Last Blood")).click();
		}
		
		driver.navigate().back();
		
		String a1 = driver.findElement(By.linkText("soap2day.ac")).getText();
		System.out.println("a1=="+a1);
		if(j.contains(a1)) {
			driver.findElement(By.linkText("soap2day.ac")).click();
		}
		Thread.sleep(5000);
		List<String> a2=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(a2.get(0));
		Thread.sleep(5000);
		//driver.switchTo().window(a2.get(1)).close();
		//Thread.sleep(5000);
		
		String st1= driver.findElement(By.xpath("/html")).getText();
		
		String st=driver.findElement(By.xpath("/html/body/footer/div/div/div/h5")).getText();
		System.out.println("st=="+st);
		if(j.contains(st)) {
			System.out.println("page contails ::::"+st);
		}
		Actions a11=new Actions(driver);
		a11.moveToElement(driver.findElement(By.xpath("//a[@class='dropdown-toggle']"))).build().perform();
		a11.moveToElement(driver.findElement(By.linkText("UEFA Champions League 2018 - 2019"))).click().perform();
		String sss=driver.findElement(By.tagName("h5")).getText();
		System.out.println(sss);
		
		driver.navigate().back();
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://soap2day.mx/");
		driver.manage().window().maximize();
	}


}
