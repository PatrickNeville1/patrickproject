package Patrick.Patrick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class TestNGSeleniumSimpleSearchExample {
	private WebDriver driver;

	@BeforeSuite
	public void initDriver() throws Exception {
		System.out.println("You are testing in Chrome");
 		System.setProperty("webdriver.chrome.driver", "C:/Users/Administrator/Desktop/chromedriver_win321/chromedriver.exe");
  		driver = new ChromeDriver();
		
	}

	@Test1 
	public void searchTestNGInGoogle() {
		final String searchKey = "TestNG";
		System.out.println("Search " + searchKey + " in google");
		driver.navigate().to("http://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		System.out.println("Enter " + searchKey);
		element.sendKeys(searchKey);
		System.out.println("submit");
		element.submit();
		
		
		System.out.println("Got " + searchKey + " results");
		
		
	}
	
	@Test2 
	public void searchTestNGInGoogleA() {
		final String searchKey = "MyCIT";
		System.out.println("Search " + searchKey + " in google");
		driver.navigate().to("http://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		System.out.println("Enter " + searchKey);
		element.sendKeys(searchKey);
		System.out.println("submit");
		element.submit();
		
		
		System.out.println("Got " + searchKey + " results");
		
		
	}
	
	@Test3
	public void searchTestNGInGoogleAA() {
		final String searchKey = "Facebook";
		System.out.println("Search " + searchKey + " in google");
		driver.navigate().to("http://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		System.out.println("Enter " + searchKey);
		element.sendKeys(searchKey);
		System.out.println("submit");
		element.submit();
		
		
		System.out.println("Got " + searchKey + " results");
		
		
	}

	@Test4 
	public void searchTestNGInGoogleAAA() {
		final String searchKey = "Twitter";
		System.out.println("Search " + searchKey + " in google");
		driver.navigate().to("http://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		System.out.println("Enter " + searchKey);
		element.sendKeys(searchKey);
		System.out.println("submit");
		element.submit();
		
		
		System.out.println("Got " + searchKey + " results");
		
		
	}
	
	@Test5 
	public void searchTestNGInGoogleAAAA() {
		final String searchKey = "Instagram";
		System.out.println("Search " + searchKey + " in google");
		driver.navigate().to("http://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		System.out.println("Enter " + searchKey);
		element.sendKeys(searchKey);
		System.out.println("submit");
		element.submit();
		
		
		System.out.println("Got " + searchKey + " results");
		
		
	}
	
	@Test6 
	public void searchTestNGInGoogleAAAAA() {
		final String searchKey = "Selenium";
		System.out.println("Search " + searchKey + " in google");
		driver.navigate().to("http://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		System.out.println("Enter " + searchKey);
		element.sendKeys(searchKey);
		System.out.println("submit");
		element.submit();
		
		
		System.out.println("Got " + searchKey + " results");
		
		
	}
	
	@Test7 
	public void searchTestNGInGoogleAAAA() {
		final String searchKey = "Maven";
		System.out.println("Search " + searchKey + " in google");
		driver.navigate().to("http://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		System.out.println("Enter " + searchKey);
		element.sendKeys(searchKey);
		System.out.println("submit");
		element.submit();
		
		
		System.out.println("Got " + searchKey + " results");
		
		
	}
	
	@Test8 
	public void searchTestNGInGoogleAAAA() {
		final String searchKey = "RTE";
		System.out.println("Search " + searchKey + " in google");
		driver.navigate().to("http://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		System.out.println("Enter " + searchKey);
		element.sendKeys(searchKey);
		System.out.println("submit");
		element.submit();
		
		
		System.out.println("Got " + searchKey + " results");
		
		
	}
	
	@Test9 
	public void searchTestNGInGoogleAAAA() {
		final String searchKey = "Instagram";
		System.out.println("Search " + searchKey + " in google");
		driver.navigate().to("http://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		System.out.println("Enter " + searchKey);
		element.sendKeys(searchKey);
		System.out.println("submit");
		element.submit();
		
		
		System.out.println("Got " + searchKey + " results");
		
		
	}
	
	
	public void AfterMethod() {
		
		driver.quit();
	
	}
	
}
