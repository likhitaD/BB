package com.jbk;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGParallelTesting {

	
	
	@Test
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Google\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().pageLoadTimeout(1000,TimeUnit.SECONDS);
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("ekambar.deogade@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("motherfucker007");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}
	


	
}
