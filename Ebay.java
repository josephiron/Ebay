package com.cbt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ebay {

		WebDriver driver;
		String url = "https://ebay.com";
		
		@BeforeClass
		public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		}
//		@Test
//		public void hoverOverAndClick() throws InterruptedException {
//			driver.get(url);
//			WebElement hover = driver.findElement(By.linkText("My eBay"));
//			WebElement clickElement = driver.findElement(By.xpath("//a[@href='https://www.ebay.com/myb/Summary']"));
//			
//			Actions action = new Actions(driver);
//			action.moveToElement(hover).perform();
//			Thread.sleep(1000);
//			
//			clickElement.click();
//		}
		
		  @Test
		  public void scrollTest() throws InterruptedException {
		    driver.get("http://ebay.com");
		    Actions action = new Actions(driver);
		//
		    action.sendKeys(Keys.PAGE_DOWN).perform();
//		    action.sendKeys(Keys.ARROW_DOWN).perform();;
//
//		    action.sendKeys(Keys.ARROW_DOWN).perform();;
		    
		    }
		@Test
		public void hoverOver2() {
			driver.get(url);
			WebElement ScrollTop = driver.findElement(By.xpath("//img[@title='Scroll to top']"));
						
			Actions action = new Actions(driver);
			action.moveToElement(ScrollTop).click().perform();
		
		}

		
}
