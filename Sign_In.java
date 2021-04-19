package com.register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sign_In {
	
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();

	driver.get("http://automationpractice.com/index.php");
	
	driver.manage().window().maximize();
	
WebElement Auto_Sign_In = driver.findElement(By.xpath("//a[@class='login']"));
	Auto_Sign_In.click();
	
	WebElement Email_Address = driver.findElement(By.name("email_create"));
	Email_Address.sendKeys("dhruv12@gmail.com");

WebElement Create_Account = driver.findElement(By.name("SubmitCreate"));
Create_Account.click();
Thread.sleep(3000);
WebElement Gender_Btn = driver.findElement(By.id("id_gender2"));
Gender_Btn.click();
Thread.sleep(3000);

WebElement First_Name = driver.findElement(By.id("customer_firstname"));
First_Name.sendKeys("Dhruv");

WebElement Last_Name = driver.findElement(By.id("customer_lastname"));
Last_Name.sendKeys("vidhya");

WebElement Password = driver.findElement(By.id("passwd"));
Password.sendKeys("Karthick");

WebElement Day_Btn = driver.findElement(By.id("days"));
 Select s = new Select(Day_Btn);
 s.selectByValue("4");
 
 
 WebElement Months_Btn = driver.findElement(By.xpath("//select[@id='months']"));
 Select s1 = new Select(Months_Btn);
 s1.selectByValue("3");
 
 
 WebElement Year_Btn = driver.findElement(By.id("years"));
 Select s2 = new Select(Year_Btn);
 s2.selectByValue("2019");

WebElement Company_Btn = driver.findElement(By.id("company"));
Company_Btn.sendKeys("Access");

WebElement Address_Btn = driver.findElement(By.id("address1"));
Address_Btn.sendKeys("PO Box 986020");

WebElement City_btn = driver.findElement(By.id("city"));
City_btn.sendKeys("Boston");

WebElement State_Btn = driver.findElement(By.id("id_state"));
State_Btn.sendKeys("massachusetts");

WebElement Zip_code = driver.findElement(By.id("postcode"));
Zip_code.sendKeys("02298");

WebElement Mobile = driver.findElement(By.id("phone_mobile"));
Mobile.sendKeys("888 630 2583");

WebElement Alias = driver.findElement(By.id("alias"));
Alias.sendKeys(" POBox 1854,NY,1854");

WebElement Register = driver.findElement(By.id("submitAccount"));
Register.click();










}

}
