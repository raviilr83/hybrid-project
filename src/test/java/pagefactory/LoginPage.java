package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver = null;
	
	 @FindBy(name="identifier")
	 WebElement emailid;
	 
	 @FindBy(id="identifierNext")
	 WebElement next;
	 
	 
public	 LoginPage(WebDriver driver){
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
		 
	 }

	 public void login(String email) {
		 emailid.sendKeys(email);
		 next.click();
	 }
	 
}
