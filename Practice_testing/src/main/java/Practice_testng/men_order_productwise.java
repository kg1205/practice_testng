package Practice_testng;

import java.util.ArrayList;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class men_order_productwise {
	public static WebDriver driver;

	public static void setproperty() {

		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();

	}
	public static void sign_in() throws Exception {
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

	
	public static void mens_order_by_product_name() throws Exception {
		Actions a = new Actions(driver);
		Thread.sleep(5000);
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"ui-id-5\"]"))).build().perform();
		a.moveToElement(driver.findElement(By.id("ui-id-17"))).perform();
		a.moveToElement(driver.findElement(By.id("ui-id-22"))).click().perform();

		Select s = new Select(driver.findElement(By.id("sorter")));
		s.selectByIndex(1);
		String s11=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/div/strong/a")).getText();
		String s12=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[2]/div/div/strong/a")).getText();
		String s13=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[3]/div/div/strong/a")).getText();
		String s14=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[4]/div/div/strong/a")).getText();
		String s15=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[5]/div/div/strong/a")).getText();
		String s16=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[6]/div/div/strong/a")).getText();
		String s17=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[7]/div/div/strong/a")).getText();
		String s18=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[9]/div/div/strong/a")).getText();
		String s19=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[10]/div/div/strong/a")).getText();
		String s20=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[11]/div/div/strong/a")).getText();
		String s21=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[12]/div/div/strong/a")).getText();
				System.out.println("product namewise positons are");
		String s1[]= {s12,s15,s13,s11,s14,s16,s17,s18,s19,s20,s21};
		/*
		 * Arrays.sort(s1); for(int i=0;i<s1.length;i++) { System.out.println(s1[i]);
		 */
		
		
		
		
		}
	

	public static void main(String[] args) throws Exception {
		setproperty();
		sign_in();
		mens_order_by_product_name();

	}

}
