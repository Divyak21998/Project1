package project1;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Class2_test{
	public static WebDriver driver;
	
	public static void switchingControlToChildWindow(String expectedtitle,String parentid,Set<String> allid)
	{
		
		 allid.remove(parentid);
		for(String id:allid ) {
			driver.switchTo().window(id);
			if(driver.getTitle().contains(expectedtitle)) {
				break	;
			}
			}
		
		}
	
	public static void switchingbacktoMainWindow(String parentid)
	{
		driver.switchTo().window(parentid);
	}
	public static void addCart(WebElement element)
	{
		element.click();
		
	}


	@Test(groups = "smoketest")
	public void data() throws Throwable {

	 driver=new ChromeDriver();
	 String parentid=driver.getWindowHandle();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.get("https://www.snapdeal.com/");
	Thread.sleep(8000);
	Actions action = new Actions(driver);
	action.scrollByAmount(0, 500);
	driver.findElement(By.xpath("//div[contains(text(),'Bhawna Collection Loard Shiv Trishul')]")).click();
	switchingControlToChildWindow("Buy Bhawna Collection Loard",driver.getWindowHandle(),driver.getWindowHandles());
	Thread.sleep(5000);
	addCart(driver.findElement(By.xpath("//span[text()='add to cart']")));
	switchingbacktoMainWindow(parentid);
	Thread.sleep(8000);
	driver.findElement(By.xpath("//div[contains(text(),'Veirdo - Green Cotton')]")).click();
	switchingControlToChildWindow("Buy Veirdo - Green Cotton Regular",driver.getWindowHandle(),driver.getWindowHandles());
	addCart(driver.findElement(By.xpath("//span[text()='add to cart']")));
	switchingbacktoMainWindow(parentid);
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[contains(text(),'Stay Healthy - Foot')]")).click();
	switchingControlToChildWindow("Buy Stay Healthy - Foot Protect",parentid,driver.getWindowHandles());
	addCart(driver.findElement(By.xpath("//span[text()='ADD TO CART']")));
	switchingbacktoMainWindow(parentid);
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[contains(text(),'Bentag kitchenware Vegetable & Fruit ')]")).click();
	switchingControlToChildWindow("Buy Bentag kitchenware Vegetable & Fruit", parentid, driver.getWindowHandles());
	addCart(driver.findElement(By.xpath("//span[text()='add to cart']")));
	switchingbacktoMainWindow(parentid);
	Thread.sleep(7000);
	driver.findElement(By.xpath("//span[text()='Cart']")).click();
	
	List<WebElement> allprice = driver.findElements(By.xpath("//span[@class='item-price']"));
	for (WebElement  price : allprice) {
		String v=price.getText();
		System.out.println(v);
		
	}
	Thread.sleep(10000);
	
	driver.quit();
	}

	}	



