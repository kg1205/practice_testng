package Practice_testng;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class list {
	@Test
	public void Login() {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver_win32\\chromedriverr.exe");
		driver.get("http://demo.guru99.com/V4/");

		// Creating the JavascriptExecutor interface object by Type casting
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Launching the Site.
		
		// Fetching the Domain Name of the site. Tostring() change object to name.
		String DomainName = js.executeScript("return document.domain;").toString();
		System.out.println("Domain name of  site = " + DomainName);

		// Fetching the URL of the site. Tostring() change object to name
		String url = js.executeScript("return document.URL;").toString();
		System.out.println("URL of the site = " + url);

		// Method document.title fetch the Title name of the site. Tostring() change
		// object to name
		String TitleName = js.executeScript("return document.title;").toString();
		System.out.println("Title of the page = " + TitleName);

		// Navigate to new Page i.e to generate access page. (launch new url)
		js.executeScript("window.location = 'http://demo.guru99.com/'");
	}
}
/*
 * public static void main(String[] args) {
 * 
 * 
 * List<String> names = new ArrayList<>();
 * 
 * // Adding elements in the List. names.add("Emma"); names.add("Adele");
 * names.add("Aria"); names.add("Ally"); boolean f = names.contains("Emma");
 * System.out.println(f); System.out.println(names);
 * 
 * for (String string : names) {
 * 
 * System.out.println(string); }
 * 
 * 
 * 
 * Set<String>a=new TreeSet<String>(); a.add("emma"); a.add("adele");
 * a.add("aria"); a.add("ally");
 * 
 * System.out.println(a);
 * 
 * for (String string : a) {
 * 
 * System.out.println(string); }
 * 
 * 
 * Map<String, Integer> m=new TreeMap<>();
 * 
 * m.put("gani", 54); m.put("ganni", 54); m.put("gahni", 54); m.put("ganli",
 * 54);
 * 
 * System.out.println(m);
 */
