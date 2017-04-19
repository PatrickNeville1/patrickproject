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

	@Test 1
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
	
	@Test 2
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
	
	@Test 3
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
	
	@Test 4
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
	
	@Test 5
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
	
	@Test 6

            public void Testcase2aaaa() {

            wd.get("http://www.floraindia.com");

            wd.findElement(By.id("kwsch")).sendKeys("Blue");

            wd.findElement(By.xpath("//input[@src='images/go.gif']")).click();

            result = wd.findElement(By.xpath("//font[text()='Total Items  :']//following::td[1]")).getText();

            Assert.assertEquals(result, "13");

             }

            @Test 7

            public void Testcase3() {

            wd.get("http://www.floraindia.com");

            wd.findElement(By.id("kwsch")).sendKeys("Yellow");

            wd.findElement(By.xpath("//input[@src='images/go.gif']")).click();

            result = wd.findElement(By.xpath("//font[text()='Total Items  :']//following::td[1]")).getText();

            Assert.assertEquals(result, "27");

             }

            @Test 8

            public void Testcase4() {

            wd.get("http://www.floraindia.com");

            wd.findElement(By.id("kwsch")).sendKeys("Purple");

            wd.findElement(By.xpath("//input[@src='images/go.gif']")).click();

            result = wd.findElement(By.xpath("//font[text()='Total Items  :']//following::td[1]")).getText();

            Assert.assertEquals(result, "10");

             }
	
	public void AfterMethod() {
		
		driver.quit();
	
	}
	
}
