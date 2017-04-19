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

	@Test 
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
		
		final String searchKeyA = "Twitter";
		System.out.println("Search " + searchKeyA + " in google");
		driver.navigate().to("http://www.google.com");
		WebElement elementA = driver.findElement(By.name("q"));
		System.out.println("Enter " + searchKeyA);
		elementA.sendKeys(searchKeyA);
		System.out.println("submit");
		elementA.submit();
		
		System.out.println("Got " + searchKeyA + " results");
		
		
		final String searchKeyB = "Facebook";
		System.out.println("Search " + searchKeyB + " in google");
		driver.navigate().to("http://www.google.com");
		WebElement elementB = driver.findElement(By.name("q"));
		System.out.println("Enter " + searchKeyB);
		elementB.sendKeys(searchKeyB);
		System.out.println("submit");
		elementB.submit();
		
		System.out.println("Got " + searchKeyB + " results");
		
		final String searchKeyC = "Instagram";
		System.out.println("Search " + searchKeyC + " in google");
		driver.navigate().to("http://www.google.com");
		WebElement elementC = driver.findElement(By.name("q"));
		System.out.println("Enter " + searchKeyC);
		elementC.sendKeys(searchKeyC);
		System.out.println("submit");
		elementC.submit();
		
		System.out.println("Got " + searchKeyC + " results");
		
		final String searchKeyD = "RTE";
		System.out.println("Search " + searchKeyD + " in google");
		driver.navigate().to("http://www.google.com");
		WebElement elementD = driver.findElement(By.name("q"));
		System.out.println("Enter " + searchKeyD);
		elementD.sendKeys(searchKeyD);
		System.out.println("submit");
		elementD.submit();
		
		System.out.println("Got " + searchKeyD + " results");
		
		
		final String searchKeyE = "MyCIT";
		System.out.println("Search " + searchKeyE + " in google");
		driver.navigate().to("http://www.google.com");
		WebElement elementE = driver.findElement(By.name("q"));
		System.out.println("Enter " + searchKeyE);
		elementE.sendKeys(searchKeyE);
		System.out.println("submit");
		elementE.submit();
		
		System.out.println("Got " + searchKeyE + " results");
		
		final String searchKeyF = "BBC";
		System.out.println("Search " + searchKeyF + " in google");
		driver.navigate().to("http://www.google.com");
		WebElement elementF = driver.findElement(By.name("q"));
		System.out.println("Enter " + searchKeyF);
		elementF.sendKeys(searchKeyF);
		System.out.println("submit");
		elementF.submit();
		
		System.out.println("Got " + searchKeyF + " results");
	}
	
	
		
	
	
	
	public void AfterMethod() {
		
		driver.quit();
	
	}
	
}
