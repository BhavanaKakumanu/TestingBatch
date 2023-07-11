package qwe.rty.abc;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class ClassC {



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
public void test3() {
	System.out.println("test3");
}

@Test
public void test4() {
	System.out.println("test4");
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
