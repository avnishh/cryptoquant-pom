
package project2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class project2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\java projects\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");	
		driver.getCurrentUrl();
	
		
		driver.close();

	}
 
}