package seleniumTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MySqlJDBCConnect {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		String host="localhost";
		String port="3306";
		
		//DriverManager.getConnection(url, user, password)
		//Connection URL    "jdbc:mysql://" + host + ":" + port + "/databasename"
		Connection con=DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/mydb", "root", "welcome");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from employee where id=1007");
		rs.next();
		
		System.out.println(rs.getString("username"));
		System.out.println(rs.getString("password"));
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amitm\\Documents\\MY RESUME & COURSES\\SELENIUMNEWPROJ\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=eu");
		
		driver.findElement(By.id("username")).sendKeys(rs.getString("username"));
		driver.findElement(By.id("password")).sendKeys(rs.getString("password"));
		driver.findElement(By.id("Login")).click();
	}

}
