package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SalesforceLoginPage {
//Salesforce Login Page class implemented in normal Page Object Pattern style
	
	WebDriver driver;
	
	public SalesforceLoginPage(WebDriver driver) {
			this.driver=driver;
	}
	
	By username=By.id("username");
	By password=By.id("password");
	By login=By.id("Login");
	
	public WebElement Username() {
		return driver.findElement(username);
	}
	
	public WebElement Password() {
		return driver.findElement(password);
	}
	
	public WebElement Login() {
		return driver.findElement(login);
	}
}
