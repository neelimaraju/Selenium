package com.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveTest {

	@Test
	public static void pTest() {

		System.out.println("Positive Test case");
//Create Driver
		System.setProperty("webdriver.chrome.driver", "/Users/raviraju/Documents/NeeluMars/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		System.out.println("chrome started for PositiveTest");

// open test page 
		String url = "http://zippy-react-app.s3-website-us-east-1.amazonaws.com/";
		driver.get(url);
		System.out.println("page opened PositiveTest");

// max 
		driver.manage().window().maximize();
		sleep(1000);

		// new url
		String expectedUrl = "http://zippy-react-app.s3-website-us-east-1.amazonaws.com/";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
		System.out.println("url is validated for PositiveTest");

// enter username 
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("neelima.psoft@gmail.com");
		sleep(1000);
		System.out.println("username entered for positive test");

// enter password 
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("Neelima@1234");
		sleep(1000);
		System.out.println("pwd entered for positive test");

// click Login button 
		WebElement Login = driver.findElement(By.className("login_btn"));
		Login.click();
		sleep(1000);
		System.out.println("logged in for positive test");
		
//		 //successful login msg        
//		 WebElement succMsg = driver.findElement(By.xpath("//*[@id=\"root\"]/section"));
//		System.out.println(succMsg.getText());
		
//		//logout button is visible
//		 WebElement logout = driver.findElement(By.xpath("//*[@id=\"root\"]/section/nav/a"));
//		 Assert.assertTrue(logout.isDisplayed(), "logout button is not visible");
//		 logout.click();
//		 System.out.println("logged out from positive test");
//		 
		 
	//driver.quit();

	
		
	}

	private static void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
