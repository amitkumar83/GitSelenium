package seleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.SalesforceForgotPwdPF;
import objectRepository.SalesforceLoginPage;

public class SalesForce {
	
	@Test
	public void Login() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amitm\\Documents\\MY RESUME & COURSES\\SELENIUMNEWPROJ\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=eu");
		
		SalesforceLoginPage sf=new SalesforceLoginPage(driver);
		sf.Username().sendKeys("helloworld");
		sf.Password().sendKeys("abcd1234");
		sf.Login().click();
		
		SalesforceForgotPwdPF sp=new SalesforceForgotPwdPF(driver);
		sp.ForgoturPwdLink().click();
		sp.Username().sendKeys("helloworld");
		sp.Continue().click();
	}
}
