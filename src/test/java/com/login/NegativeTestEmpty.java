package com.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeTestEmpty {

	@Test
	public static void negEmp() {
		
        //Create Driver
		System.setProperty("webdriver.chrome.driver", "/Users/raviraju/Documents/NeeluMars/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		System.out.println("chrome started for NegativeTestEmpty ");

		// open test page
		String url = "http://zippy-react-app.s3-website-us-east-1.amazonaws.com/";
		driver.get(url);
		System.out.println("page opened for NegativeTestEmpty");

		// max
		driver.manage().window().maximize();
		sleep(1000);

		// new url
		String expectedUrl = "http://zippy-react-app.s3-website-us-east-1.amazonaws.com/";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
		System.out.println("url is validated for NegativeTestEmpty");

		// enter username
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("");
		System.out.println("username entered for NegativeTestEmpty");

		// enter password
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("");
		System.out.println("pwd entered for NegativeTestEmpty");

		// click Login button
		WebElement Login = driver.findElement(By.className("login_btn"));
		Login.click();
		sleep(1000);
		System.out.println("logged in for NegativeTestEmpty");
		
//		// check invalid message
//		WebElement Msg = driver.findElement(By.xpath(" //*[@id=\"root\"]/section/section/form/div/div[2]/p"));
//		System.out.println(Msg.getText());
//
//		driver.quit();
//		System.out.println("App closed for NegativeTestEmpty");
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
