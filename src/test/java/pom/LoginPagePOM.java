package pom;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import objectaccess.ObjectReader;

public class LoginPagePOM {


	WebDriver driver;
	Properties prop  = null;
	
	//By emailid =By.name(prop.getProperty("email"));
	//By next =By.id(prop.getProperty("next"));
	
	By emailid =By.name("identifier");
	By next =By.id("identifierNext");
		
	
	LoginPagePOM(WebDriver driver){
		this.driver = driver;
		prop  = ObjectReader.readObject();
		
		
	}
	
	public void login(String email) {
		
		driver.findElement(emailid).sendKeys(email);
		driver.findElement(next).click();
		
	}
	
	
}
