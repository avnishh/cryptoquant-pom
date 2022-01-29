package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Firstseleniumscript {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","C:\\java projects\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://cryptoquant.com/sign-in?next=%2Foverview%2Fbtc-exchange-flows");	
		String url = driver.getCurrentUrl();
		System.out.println(url);
	//	String title= driver.getTitle();
		//System.out.println(title);
		driver.findElement(By.xpath("//button[normalize-space()='Accept']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("raj.273273@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Raj.273273@");
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//span[normalize-space()='Flow Indicator']")).click();
		
		//driver.close();
		
		
		
		

	}

}
