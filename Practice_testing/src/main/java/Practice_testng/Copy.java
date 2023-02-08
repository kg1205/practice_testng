package Practice_testng;

import java.security.Key;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Copy {

	public static WebDriver driver;

	public static void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://soap2day.mx/");
		driver.manage().window().maximize();
	}

	public static void moviesearch() throws Exception {
		driver.findElement(By.id("btnhome")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Puss in Boots");
		String actual_input = "Puss in Boots";
		String expectdresult = "Puss in Boots: The Last Wish";

		driver.findElement(By.id("btnSearch")).click();
		String s1 = driver
				.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div[1]/div[2]/div/div/div/div/div[1]"))
				.getText();
		String[] n = s1.split("\n");
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
			if (n[i].equalsIgnoreCase(expectdresult)) {
				/* System.out.println(n[i]); */
				driver.findElement(By.linkText("Puss in Boots: The Last Wish")).click();
				Thread.sleep(5000);
			}
		}

	}

	public static void playtest() throws Exception {

		driver.findElement(By.xpath("//div[@class='jw-icon jw-icon-display jw-button-color jw-reset']")).click();
		Thread.sleep(5000);
		List<String> s1 = new ArrayList<String>(driver.getWindowHandles());
		System.out.println("new tab opened");
		driver.switchTo().window(s1.get(1)).close();
		System.out.println("new tab closed");
		driver.switchTo().window(s1.get(0));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='jw-icon jw-icon-display jw-button-color jw-reset']")).click();
		ArrayList<String> s2 = new ArrayList<String>(driver.getWindowHandles());
		System.out.println("new tab opened");
		driver.switchTo().window(s2.get(1)).close();
		System.out.println("new tab closed");
		driver.switchTo().window(s2.get(0));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='jw-icon jw-icon-display jw-button-color jw-reset']")).click();
		ArrayList<String> s3 = new ArrayList<String>(driver.getWindowHandles());
		System.out.println("new tab opened");
		driver.switchTo().window(s3.get(1)).close();
		System.out.println("new tab closed");
		driver.switchTo().window(s3.get(0));

	}

	public static void download() throws Exception {
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);
		driver.findElement(By.linkText("urlLink")).sendKeys(selectLinkOpeninNewTab);
		/*
		 * driver = new ChromeDriver(); driver.get("https://www.google.com/");
		 * driver.manage().window().maximize();
		 * 
		 * driver.findElement(By.name("q")).sendKeys(
		 * "https://q5.s2dstore.to/a/extra/m2/2022/puss.in.boots.the.last.wish.2022.mp4?tok=634B44302533444B797343686662754C7A5A7A4C6E46525A53687563456174636E6839616749466456774D76724A4A5857423957524D4A677650644B58756E61326C4570474A6772344F66636E56366241737775306B2D6834634B464877484C423030746A517462576D31596D64416D6D4E76646B4B3262336843582533446837724651397658387659473138585252377569636F62433165584731486E46796C6245437665574E386167412D6441414473726C775A6D30414C53634C6776627A&valid=pyX1TPY6Tcbdbj-1YM30lg&t=1673346690"
		 * ); Thread.sleep(15000); driver.findElement(By.xpath(
		 * "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[6]/center/input[1]"
		 * )).click();
		 */

	}

	public static void main(String[] args) throws Exception {
		beforeTest();
		moviesearch();
		playtest();
		download();

	}

}
