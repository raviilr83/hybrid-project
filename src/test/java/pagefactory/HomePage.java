package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver = null;
	
	 @FindBy(linkText="Gmail")
	 WebElement gmail;
	 
	public HomePage(WebDriver driver){
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
		 
	 }
	 public void gmail() {
		 gmail.click();
	 }
}
