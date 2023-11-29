package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class4_test {
	
	public void class4() {
	String BROWSER= System.getProperty("browser");
	 String URL= System.getProperty("url");
	 String USERNAME = System.getProperty("username");
 	 String PASSWORD= System.getProperty("password");
	 
	 
	 WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.get(URL);
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
	  
	}
}
