package selenium;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadFile {




	public static void main(String[] args) throws AWTException {
		/*
		 * //System.setProperty(
		 * "webdriver.chrome.driver","C:\\java projects\\chromedriver\\chromedriver.exe"
		 * ); System.setProperty(
		 * "webdriver.gecko.driver","C:\\java projects\\mozilla geckodriver\\geckodriver.exe"
		 * ); WebDriver driver = new FirefoxDriver(); //WebDriver driver = new
		 * ChromeDriver();
		 * driver.get("https://github.com/mozilla/geckodriver/releases");
		 * 
		 * driver.findElement(By.xpath(
		 * "//span[normalize-space()='geckodriver-v0.29.1-win32.zip']")).click();
		 */
		 //System.setProperty("webdriver.chrome.driver","C:\\java projects\\chromedriver\\chromedriver.exe");
	    System.setProperty("webdriver.gecko.driver","C:\\java projects\\mozilla geckodriver\\geckodriver.exe");
	    FirefoxProfile profile=new FirefoxProfile();
	    profile.setPreference("browser.helperApps.neverAsk.openFile", "application/octet-stream");

	    WebDriver driver=new FirefoxDriver();
	    //WebDriver driver = new ChromeDriver();
			driver.get("https://github.com/mozilla/geckodriver/releases");	
			
			driver.findElement(By.xpath("//span[normalize-space()='geckodriver-v0.29.1-win32.zip']")).click();
			
			Robot robot=new Robot();
			  robot.keyPress(KeyEvent.VK_ENTER);
			  robot.keyRelease(KeyEvent.VK_ENTER);
		
		

	}}


