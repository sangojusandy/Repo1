package stepdefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Loginpage;

public class stepDefinition {
WebDriver driver;
Loginpage lp;
int z;
@Given("^I am on the login page$")
	public void launchsite() throws InterruptedException, IOException {
	Properties p = new Properties();
	FileInputStream fs = new FileInputStream("C:/Selenium/space2/bdd/src/test/java/property.properties");
	p.load(fs);
	System.setProperty("webdriver.chrome.driver", p.getProperty("driver"));  
	driver = new ChromeDriver();
    //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandeep.Sangoju\\OneDrive - ZenQ\\Desktop\\Selenium\\chromedriver.exe");  
	//driver = new ChromeDriver();
	// Launch QA sales site
	driver.get(p.getProperty("URL"));
    driver.manage().window().maximize();
    }

@When("^Entered the login credentials username as(.*) and password as(.*)$")
public void cred(String arg1, String arg2) throws InterruptedException {
	//Map<String,String>data=testData.asMap(String.class,String.class);
	//driver.findElement(By.xpath("//*[@id='email']")).sendKeys(arg1);
	//driver.findElement(By.xpath("//*[@id='password']")).sendKeys(arg2);
	//Thread.sleep(3000);
	//driver.findElement(By.xpath("//*[@id='loginButton']")).click();
	lp = new Loginpage(driver);
	lp.enterusername(arg1);
	lp.enterpassword(arg2);
    Thread.sleep(3000);
    }

@Then("^I should be redirected to Dashboard$")
public void home() throws InterruptedException {
    WebElement web = driver.findElement(By.xpath("//*[@id='dealership']"));
    if(web.isDisplayed()) {
    	System.out.println("Test Passed");
    }
    else {
    	System.out.println("Test Failed");
    }
    driver.close();
	
}

}


