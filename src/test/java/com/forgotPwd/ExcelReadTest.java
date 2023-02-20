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

public class ExcelReadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f =new File("src/test/java/com/forgotPwd/fpwddata.xlsx");
			FileInputStream fis = new FileInputStream(f);
			
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheetAt(0);
			
			//Create Driver
			System.setProperty("webdriver.chrome.driver", "/Users/raviraju/Documents/NeeluMars/Drivers/chromedriver3");
			WebDriver driver = new ChromeDriver();
			System.out.println("chrome started for PositiveTest forgot Password");

			// open test page 
			String url = "http://zippy-react-app.s3-website-us-east-1.amazonaws.com/";
			driver.get(url);
			System.out.println("page opened PositiveTest");
			
			// max 
			driver.manage().window().maximize();
			sleep(1000);
			
			// enter user name 
			WebElement username = driver.findElement(By.id("username"));
			username.sendKeys(sh.getRow(1).getCell(0).getStringCellValue());
			System.out.println("username entered for positive test");
			sleep(1000);
			
			// click Forgot Password Link button 
			WebElement forgotpwdlink = driver.findElement(By.xpath("//*[@id=\"root\"]/section/section/form/div/div[5]/a"));
			forgotpwdlink.click();
			sleep(1000);
			System.out.println("Forgot Password Link is clicked ");
			
			// enter user name 
			WebElement uname = driver.findElement(By.xpath("//*[@id=\"root\"]/div/form/div/div[3]/div/input"));
		    uname.sendKeys(sh.getRow(1).getCell(0).getStringCellValue());
			System.out.println("username entered for positive test");
			sleep(1000);
			
			// click Send Link button 
						WebElement sendlink = driver.findElement(By.className("submit_btn"));
						sendlink.click();
						sleep(1000);
						System.out.println("Send Link is clicked ");
						

	//		System.out.print(sh.getRow(1).getCell(0).getStringCellValue());
	//	System.out.print(sh.getRow(1).getCell(1).getStringCellValue());
			
//			System.out.println("Row count: " + sh.getLastRowNum());
//			System.out.println();
//			
//			for(int r=0; r<= sh.getLastRowNum();r++)
//			{
//				for(int c=0;c< sh.getRow(0).getLastCellNum();c++)
//				{
//					System.out.print(sh.getRow(r).getCell(c).getStringCellValue()+"  ");
//				}
//				System.out.println();
			
		} catch (IOException e) {
			
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

	


