package pom;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import objectaccess.ObjectReader;

public class HomePage {


	WebDriver driver;
	
	By gmail =By.linkText("Gmail");
		
	
	HomePage(WebDriver driver){
		this.driver = driver;
		
	}
	
	public void gmail() {
		
		driver.findElement(gmail).click();
		
		
	}
	

	
}
