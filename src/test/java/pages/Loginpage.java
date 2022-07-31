package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver driver;
	@CacheLookup
	@FindBy(xpath="//*[@id='email']")
	WebElement username;
	@FindBy(xpath="//*[@id='password']")
	WebElement password;
	@FindBy(xpath="//*[@id='loginButton']")
	WebElement Loginbutton;
	
	
    public Loginpage(WebDriver driver) {
    	this.driver = driver;
    	PageFactory.initElements(driver, this);
    }
	public void enterusername(String arg1) throws InterruptedException{
	username.sendKeys(arg1);
	}
	public void enterpassword(String arg2) throws InterruptedException{
	password.sendKeys(arg2);
	Loginbutton.click();
	
	}
	

}
