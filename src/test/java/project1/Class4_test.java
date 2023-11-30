package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Class4_test {
	public  WebDriver driver;
	@Test
	public  void test() {
		
		 String BROWSER= System.getProperty("browser");
		 String URL= System.getProperty("url");
		 String USERNAME = System.getProperty("username");
      	 String PASSWORD= System.getProperty("password");
      	
		 if(BROWSER.equalsIgnoreCase("chrome")) {
			  driver=new ChromeDriver();
		 }
		 else if(BROWSER.equalsIgnoreCase("firefox")) {
			  driver=new FirefoxDriver();
		 }
		 else if(BROWSER.equalsIgnoreCase("edge")) {
			  driver=new EdgeDriver();
		 }
		 else
		 {
			 driver=new ChromeDriver();
		 }
		 
			driver.manage().window().maximize();
			driver.get(URL);
			driver.findElement(By.name("user_name")).sendKeys(USERNAME);
			driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		  
	}

}
