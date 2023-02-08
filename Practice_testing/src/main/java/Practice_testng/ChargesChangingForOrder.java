package Practice_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChargesChangingForOrder {
	public static WebDriver driver;

	public static void setproperty() {
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
	}

	public static void signin() throws Exception {
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
	

	public static void order() throws Exception {
		Actions a = new Actions(driver);
		Thread.sleep(5000);
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"ui-id-4\"]/span[2]"))).build().perform();
		a.moveToElement(driver.findElement(By.id("ui-id-10"))).perform();
		a.moveToElement(driver.findElement(By.id("ui-id-16"))).click().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[2]/div/div/strong/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("option-label-size-143-item-172")).click();
		driver.findElement(By.id("option-label-color-93-item-50")).click();
		driver.findElement(By.id("product-addtocart-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("top-cart-btn-checkout")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button")).click();
		Thread.sleep(10000);
		String s1 = driver.findElement(By.xpath("//*[@id=\"opc-sidebar\"]/div[1]/table/tbody/tr[4]/td")).getText();
		System.out.println("the price of 1product" + s1);
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);

		driver.navigate().back();
		Thread.sleep(5000);

		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.id("option-label-size-143-item-172")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("option-label-color-93-item-50")).click();
		driver.findElement(By.name("qty")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("qty")).sendKeys("2");

		Thread.sleep(2000);
		driver.findElement(By.id("product-addtocart-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("top-cart-btn-checkout")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button")).click();
		Thread.sleep(10000);
		String s2 = driver.findElement(By.xpath("//*[@id=\"opc-sidebar\"]/div[1]/table/tbody/tr[4]/td")).getText();

		System.out.println("the price after adding 2nd item in cart" + s2);

	}

	public static void main(String[] args) throws Exception {
		setproperty();
		signin();
		order();
	}

}
