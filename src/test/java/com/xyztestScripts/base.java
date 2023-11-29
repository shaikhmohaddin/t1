package com.xyztestScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class base {
	WebDriver rv;
	@Parameters("BrowserName")
	@BeforeClass
	public void openBrowser(String BrowserName)
	{
		if (BrowserName.equals("Firefox")) {
			rv=new FirefoxDriver();
		} else if(BrowserName.equals("Chrome")) {
	     rv=new ChromeDriver();
		}
		else{
			rv=new EdgeDriver();
		}
	}
	@BeforeMethod
	public void openApp()
	{
		rv.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		rv.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		rv.findElement(By.xpath(".//button[contains(text(),'Bank Manager Login')]")).click();
	}
	@AfterMethod
	public void testItestResult(ITestResult result)
	{
		String testMethod=result.getName();
		if (result.getStatus()==1) {
				Reporter.log(testMethod+"execution is pass",true);
			}
		else {
			Reporter.log(testMethod+"execution is fail",true);
		}
		}
	@AfterClass
	public void closeBrowser()
	{
		rv.close();
	}
}
