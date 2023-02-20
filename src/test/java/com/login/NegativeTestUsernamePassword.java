package com.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeTestUsernamePassword {

	@Test
	public static void negUnPass() {
		// TODO Auto-generated method stub

		// Create Driver
		System.setProperty("webdriver.chrome.driver", "/Users/raviraju/Documents/NeeluMars/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		System.out.println("chrome started for NegativeTestUsernamePassword");

		// open test page
		String url = "http://zippy-react-app.s3-website-us-east-1.amazonaws.com/";
		driver.get(url);
		System.out.println("page opened for NegativeTestUsernamePassword");

		// max
		driver.manage().window().maximize();
		sleep(1000);

		// new url
		String expectedUrl = "http://zippy-react-app.s3-website-us-east-1.amazonaws.com/";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
		System.out.println("url is validated for NegativeTestUsernamePassword");

		// enter username
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Sujatha.psoft@gmail.com");
		System.out.println("username entered for NegativeTestUsernamePassword");

		// enter password
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("Sujatha");
		System.out.println("pwd entered for NegativeTestUsernamePassword");

		// click Login button
		WebElement Login = driver.findElement(By.className("login_btn"));
		Login.click();
		sleep(1000);
		System.out.println("login for NegativeTestUsernamePassword");
		
//		// check invalid message
//		WebElement Msg = driver.findElement(By.xpath(" //*[@id=\"root\"]/section/section/form/div/div[2]/p"));
//		System.out.println(Msg.getText());
//		
//		driver.quit();
//		System.out.println("App closed for NegativeTestUsernamePassword");
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
