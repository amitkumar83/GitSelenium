package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesforceForgotPwdPF {
	//Salesforce Forgot Password class implemented in Page Object Factory methods
	
	WebDriver driver;
	
	public SalesforceForgotPwdPF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(id="forgot_password_link")
	WebElement forgotpwd;
	
	@FindBy(name="un")
	WebElement username;
	
	@FindBy(id="continue")
	WebElement contbuton;
	
	public WebElement ForgoturPwdLink() {
		return forgotpwd;
	}
	
	public WebElement Username() {
		return username;
	}
	
	public WebElement Continue() {
		return contbuton;
	}
}
