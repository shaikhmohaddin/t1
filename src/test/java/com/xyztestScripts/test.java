package com.xyztestScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class test extends base {
	@Test
	public void AddCustomer() {
	rv.findElement(By.xpath(".//button[contains(text(),'Add Customer')]")).click();
	rv.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	rv.findElement(By.xpath("(.//input[contains(@class,'form-control ng-pristine')])[1]")).sendKeys("Asif");
	rv.findElement(By.xpath(".//input[contains(@placeholder,'Last Name')]")).sendKeys("shaikh");
	rv.findElement(By.xpath(".//input[contains(@placeholder,'Post Code')]")).sendKeys("12365");
	rv.findElement(By.xpath(".//button[contains(@class,'btn btn-default')]")).click();
	}
	

}
