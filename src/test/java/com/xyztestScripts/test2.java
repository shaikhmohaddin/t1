package com.xyztestScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class test2 extends test {
	@Test
	public void OpenAccount() {
		rv.findElement(By.xpath(".//button[contains(text(),'Open Account')]")).click();
		rv.findElement(By.xpath(".//select[contains(@id,'userSelect')]")).click();
		rv.findElement(By.xpath(".//option[contains(text(),'Asif Shaikh')]")).click();
		rv.findElement(By.xpath(".//select[contains(@id,'currency')]")).click();
		rv.findElement(By.xpath(".//option[contains(text(),'Rupee')]")).click();
		rv.findElement(By.xpath(".//button[contains(text(),'Process')]")).click();
	}
}
