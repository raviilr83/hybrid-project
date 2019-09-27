package testcase;

import org.testng.annotations.Test;

import objectaccess.ObjectReader;
import pagefactory.HomePage;

import org.testng.annotations.DataProvider;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class NewTest {
  
	WebDriver driver = null;
	Properties prop = null;
	
	@Test(priority=0)
	public void googlePage() {
		
		HomePage p = new HomePage(driver);
		p.gmail();
		
		
	}
	
	@Test(priority=1)
	public void login() {
		
		
	}
	@Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  
	  	
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  
	  prop = ObjectReader.readObject();
	  
	  driver.get(prop.getProperty("url"));
	  
  }

}
