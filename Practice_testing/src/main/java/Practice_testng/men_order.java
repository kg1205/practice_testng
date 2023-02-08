package Practice_testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class men_order {
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

	public static void mens_order_higher_to_lower() throws Exception {
		// checkafter clicking price wise the products arranged in price wise or not
		// from higher to lower order
		Actions a = new Actions(driver);
		Thread.sleep(5000);
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"ui-id-5\"]"))).build().perform();
		a.moveToElement(driver.findElement(By.id("ui-id-17"))).perform();
		a.moveToElement(driver.findElement(By.id("ui-id-22"))).click().perform();

		List<WebElement> objlinks = driver.findElements(By.tagName("ol"));
		for (WebElement oblinks : objlinks) {
			String strlinktext = oblinks.getText();
			System.out.println(strlinktext);
		}

		Select s = new Select(driver.findElement(By.id("sorter")));
		s.selectByIndex(2); // System.out.println("select very first item:"); 
		String	s1 = driver.findElement(By.xpath("//*[@id=\"product-price-676\"]/span")).getText();
		String s2 = driver.findElement(By.xpath("//*[@id=\"product-price-706\"]/span")).getText();
		String s3 = driver.findElement(By.xpath("//*[@id=\"product-price-700\"]/span")).getText();
		String s4 = driver.findElement(By.xpath("//*[@id=\"product-price-688\"]/span")).getText();
		String s5 = driver.findElement(By.xpath("//*[@id=\"product-price-682\"]/span")).getText();
		String s6 = driver.findElement(By.xpath("//*[@id=\"product-price-694\"]/span")).getText();
		String s7 = driver.findElement(By.xpath("//*[@id=\"product-price-724\"]/span")).getText();
		String s8 = driver.findElement(By.xpath("//*[@id=\"product-price-712\"]/span")).getText();
		System.out.println("the price ;ist from higher to lower");

		String[] s24 = s1.split("", 2);
		for (int i = 1; i < s24.length; i++) {
			System.out.println(s24[i]);
		}

		

	}

	public static void main(String[] args) throws Exception {
		setproperty();
		sign_in();
		mens_order_higher_to_lower();

	}

}
/*
 * int t=Integer.parseInt(s1); int t8=Integer.parseInt(s1); int
 * t1=Integer.parseInt(s2); int t2=Integer.parseInt(s3); int
 * t3=Integer.parseInt(s4); int t4=Integer.parseInt(s5); int
 * t5=Integer.parseInt(s6); int t6=Integer.parseInt(s7); int
 * t7=Integer.parseInt(s8); int a1[]= {t8,t2,t3,t4,t5,t6,t7}; for(int
 * i=0;i<a1.length;i++) { if(t8>a1.length) {
 * System.out.println("the products arranged in price wise from higher to lower"
 * );
 * 
 * } }
 */



/*
 * System.out.println(s1); System.out.println(s2); System.out.println(s3);
 * System.out.println(s4); System.out.println(s5); System.out.println(s6);
 * System.out.println(s7); System.out.println(s8); System.out.
 * println("when we click price button the order higher to lower functionally correct"
 * ); driver.findElement(By.xpath(
 * "//*[@id=\"maincontent\"]/div[3]/div[1]/div[2]/div[3]/a")).click();
 * System.out.println(s8); System.out.println(s7); System.out.println(s6);
 * System.out.println(s5); System.out.println(s4); System.out.println(s3);
 * System.out.println(s2); System.out.println(s1); System.out.
 * println("when we click price button the order lower to higher functionally correct"
 * );
 */