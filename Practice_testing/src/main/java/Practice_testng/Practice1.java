package Practice_testng;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class Practice1 {

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

		/*
		 * Actions a = new Actions(driver); a.moveToElement(driver.findElement(By.xpath(
		 * "/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button")))
		 * .click().perform(); driver.findElement(By.xpath(
		 * "/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a")).click();
		 * Thread.sleep(10000);
		 */

	}

	@Test(enabled = false)
	// validating with invalid creditionals
	public void signin2() throws Exception {
		// using valid email and invalid password
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.name("login[username]")).sendKeys("gk@mail.com");
		driver.findElement(By.name("login[password]")).sendKeys("gk@12345");
		Thread.sleep(2000);
		/*
		 * driver.findElement(By.xpath("//*[@id=\"send2\"]/span")).click();
		 * driver.findElement(By.name("login[username]")).sendKeys("gk@mail.com");
		 * driver.findElement(By.name("login[password]")).sendKeys("gk@12345");
		 * Thread.sleep(2000); String ss= driver.findElement(By.xpath(
		 * "//*[@id=\"captcha-container-user_login\"]/div/img")).getText();
		 * System.out.println(ss);
		 * driver.findElement(By.name("captcha[user_login]")).sendKeys(ss);
		 */
		WebElement imageelement = driver.findElement(By.xpath("//*[@id=\"captcha-container-user_login\"]/div/img"));
		driver.findElement(By.xpath("//*[@id=\"send2\"]/span")).click();
		String expected_result = "The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.";
		String actual_result = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div"))
				.getText();
		Assert.assertEquals(actual_result, expected_result);
		System.out.println("result matched");
	}

	@Test(enabled = false)
	// using with out username and password
	public void signin3() throws Exception {

		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.name("login[username]")).sendKeys("");
		driver.findElement(By.name("login[password]")).sendKeys("");
		System.out.println("signin tried without values");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"send2\"]/span")).click();
		String s5 = driver.findElement(By.id("email-error")).getText();
		System.out.println(s5);
		String s6 = driver.findElement(By.id("pass-error")).getText();
		System.out.println(s6);
		if (s5.equals(s6)) {
			System.out.println("both invalid msgs are valid");
		} else {
			System.out.println("both invalid msgs are invalid");
		}
	}

	@Test(enabled = false)
	public void women() throws Exception {
		Thread.sleep(3000);
		Actions b = new Actions(driver);
		b.moveToElement(driver.findElement(By.xpath("//*[@id=\"ui-id-4\"]/span[1]"))).build().perform();
		b.moveToElement(driver.findElement(By.id("ui-id-9"))).perform();
		b.moveToElement(driver.findElement(By.id("ui-id-11"))).click().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/div/strong/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("option-label-size-143-item-169")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("option-label-color-93-item-50")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("product-addtocart-button")).click();
		Thread.sleep(12000);
		driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a")).click();
		Thread.sleep(12000);
		driver.findElement(By.id("top-cart-btn-checkout")).click();
		Thread.sleep(25000);
		driver.findElement(By.name("company")).sendKeys("j");
		driver.findElement(By.name("street[0]")).sendKeys("h");
		driver.findElement(By.name("street[1]")).sendKeys("i");
		driver.findElement(By.name("street[2]")).sendKeys("l");
		driver.findElement(By.name("city")).sendKeys("m");
		Select s = new Select(driver.findElement(By.name("region_id")));
		s.selectByIndex(12);
		driver.findElement(By.name("postcode")).sendKeys("25445");
		Select se = new Select(driver.findElement(By.name("country_id")));
		se.selectByIndex(2);
		driver.findElement(By.name("telephone")).sendKeys("1455");
		// driver.findElement(By.name("ko_unique_3")).click();
		driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button")).click();
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button/span"))
				.click();

		String s2 = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/p[1]/a")).getText();
		System.out.println("the order num is" + s2);

	}

	@Test(priority = 2)
	public void test3() throws Exception{
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button")))
				.click().perform();
		driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tbody/tr/td[6]/a[1]/span")).click();
		driver.findElement(By.linkText("Reorder")).click();
		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]/ul/li[1]/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button")).click();
		
		
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
	}

}

/*
 * driver.findElement(By.linkText("Sign In")).click();
 * driver.findElement(By.name("login[username]")).sendKeys("gk@gmail.com"); //
 * System.out.println("signin tried with valid username:gk@gmail.com");
 * driver.findElement(By.name("login[password]")).sendKeys("gk@1234"); //
 * System.out.println("signin tried with invalid password:gk@1234");
 * Thread.sleep(4000);
 * driver.findElement(By.xpath("//*[@id=\"send2\"]/span")).click(); String s1 =
 * driver.findElement(By.xpath(
 * "//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div")).getText();
 * System.out.println(s1);
 * 
 * driver.findElement(By.name("login[username]")).clear();
 * driver.findElement(By.name("login[password]")).clear();
 * 
 * // using valid password and invalid email id
 * driver.findElement(By.name("login[username]")).sendKeys("gk@mail.com");
 * //System.out.println("signin tried with invalid username:gk@mail.com");
 * driver.findElement(By.name("login[password]")).sendKeys("gk@12345");
 * //System.out.println("signin tried with valid password:gk@12345");
 * Thread.sleep(4000);
 * driver.findElement(By.xpath("//*[@id=\"send2\"]/span")).click();
 * 
 * String s2 = driver.findElement(By.xpath(
 * "//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div")).getText();
 * System.out.println(s2);
 * 
 * if (s1.equals(s2)) { System.out.println("error message is valid");
 * 
 * } else { System.out.println("both invalid msgs are invalid"); }
 */