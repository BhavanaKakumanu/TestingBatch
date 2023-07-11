package qwe.rty.abc;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class ClassA {

	public static WebDriver driver;


@Test
public void test1() throws InterruptedException {
	//setting the properties
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhava\\OneDrive\\Desktop\\DriversAndJars\\chromedriver.exe");
		
		//WebDriver Initialization
		 driver = new ChromeDriver();
		
		Thread.sleep(10000);
		
		//maximise
		driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
	username.sendKeys("manual");
	//assert -> hard assert
	Assert.assertEquals("manual", username.getAttribute("value"));
	Assert.assertEquals("manual", username.getAttribute("value"));
	Assert.assertEquals("testing", username.getAttribute("value"));
	Assert.assertEquals("manual", username.getAttribute("value"));
	driver.quit();
}



}
