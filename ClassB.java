package qwe.rty.abc;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassB {


	public static WebDriver driver;
	
@BeforeClass	
public static void beforeClass() {
	System.out.println("Before Class");
}

@Before
public void before() {
	System.out.println("Before");
}

@Test
public void test1() {
	System.out.println("test1");
}

@Test
public void test2() {
	System.out.println("test2");
}

@After
public void after() {
	System.out.println("after");
}

@AfterClass
public static void afterClass() {
	System.out.println("After class");
}


}
