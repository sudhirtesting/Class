package com.student;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Open the Firefox Browser
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//open the Application
		driver.get("http://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("Admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

		//Thread.sleep(5000);
		driver.findElement(By.id("logoutLink")).click();



	}



}
