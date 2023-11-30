package project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class5_test {
	
	
	public WebDriver driver;
	
	@Test
	public void  data() {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		
		
	}

}
