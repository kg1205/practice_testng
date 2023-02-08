package Practice_testng;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {

	//public static WebDriver driver;

	public static void beforetest() throws Exception {
		//System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
		//driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		String baseUrl = "http://www.google.co.uk/";
		driver.get(baseUrl);
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("D:\\New folder\\image.png"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        String a = "window.open('https://stackoverflow.com/questions/17547473/how-to-open-a-new-tab-using-selenium-webdriver-in-java','_blank');";
		jse.executeScript(a);
//        driver.quit();
		/*	
		 * driver.manage().window(); WebElement link =
		 * driver.findElement(By.tagName("a")); String keyString = Keys.CONTROL +
		 * Keys.SHIFT.toString() + Keys.ENTER.toString(); link.sendKeys(keyString);
		 */
		
	}

	public static void main(String[] args) throws Exception {
		beforetest();

	}

}
