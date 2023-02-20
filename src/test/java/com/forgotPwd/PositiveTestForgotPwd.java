package com.forgotPwd;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveTestForgotPwd {

	@Test
	public static void fpTest() {
		System.out.println("Positive Test case");
		//Create Driver
				System.setProperty("webdriver.chrome.driver", "/Users/raviraju/Documents/NeeluMars/Drivers/chromedriver");
				WebDriver driver = new ChromeDriver();
				System.out.println("chrome started for PositiveTest forgot Password");

				// open test page 
				String url = "http://zippy-react-app.s3-website-us-east-1.amazonaws.com/";
				driver.get(url);
				System.out.println("page opened PositiveTest");
				
				// max 
				driver.manage().window().maximize();
				sleep(1000);
				
				// enter username 
				WebElement username = driver.findElement(By.id("username"));
				username.sendKeys("sujatha.psoft@gmail.com");
				System.out.println("username entered for positive test");

				
				// click Forgot Password Link button 
				WebElement forgotpwdlink = driver.findElement(By.xpath("//*[@id=\"root\"]/section/section/form/div/div[5]/a"));
				forgotpwdlink.click();
				sleep(1000);
				System.out.println("Forgot Password Link is clicked ");
				
				// new url
				String expectedUrl = "http://zippy-react-app.s3-website-us-east-1.amazonaws.com/forgotpassword";
				String actualUrl = driver.getCurrentUrl();
				Assert.assertEquals(actualUrl, expectedUrl);
				System.out.println("url is validated for PositiveTestForgotPwd");

				try {
					File f =new File("src/test/java/com/forgotPwd/fpwddata.xlsx");
					FileInputStream fis = new FileInputStream(f);
					
					XSSFWorkbook wb = new XSSFWorkbook(fis);
					XSSFSheet sh = wb.getSheetAt(0);
				
					System.out.print(sh.getRow(0).getCell(0).getStringCellValue());
   				System.out.print(sh.getRow(0).getCell(1).getStringCellValue());
				}
				catch (IOException e) {
					
					e.printStackTrace();
				}

	
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
