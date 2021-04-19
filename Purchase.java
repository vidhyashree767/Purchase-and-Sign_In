package com.register;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Purchase  {
	public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		WebElement Sign_In = driver.findElement(By.className("login"));
		Sign_In.click();
		
WebElement Email_Address = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
Email_Address.sendKeys("dhruv12@gmail.com");
		 
		 
		 
		
		WebElement Password = driver.findElement(By.id("passwd"));
		Password.sendKeys("Karthick");
		
		
		WebElement submit = driver.findElement(By.id("SubmitLogin"));
		submit.click();
		

	
	Thread.sleep(3000);
	
	Actions a = new Actions(driver);
	
	WebElement Women_Btn = driver.findElement(By.xpath("//a[@title='Women']"));
	a.moveToElement(Women_Btn).build().perform();
	Thread.sleep(6000);
	
	WebElement Casual_Dresses = driver.findElement(By.xpath("(//a[text()= 'Casual Dresses'])[1]"));
	Casual_Dresses.click();
	
	WebElement Img = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
	a.moveToElement(Img).build().perform();
	
	
   WebElement Quick_view = driver.findElement(By.xpath("//span[text()='Quick view']"));
    Quick_view.click();	
	
    WebElement Frame = driver.findElement(By.className("fancybox-iframe"));
    driver.switchTo().frame(Frame);
    Thread.sleep(3000);
    
   WebElement Icon_Btn = driver.findElement(By.xpath("/html/body/div/div/div[3]/form/div/div[2]/p[1]/a[2]/span"));
	
    Icon_Btn.click();
    
   WebElement Size_Btn = driver.findElement(By.id("group_1"));

    Select s= new Select(Size_Btn);
    		s.selectByValue("3");
    		
    		WebElement Add_to_card = driver.findElement(By.xpath("/html/body/div/div/div[3]/form/div/div[3]/div[1]/p/button/span"));
    		
    		Add_to_card.click();
    		
    		Thread.sleep(6000);
    		
    		WebElement Proceed = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span"));
    		Proceed.click();
    		
    		WebElement Procced_two = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]/span"));
    		Procced_two.click();
    		
    		
    		WebElement Procced_three = driver.findElement(By.name("processAddress"));
    		Procced_three.click();
    		
    		WebElement Agree_Btn = driver.findElement(By.name("cgv"));
    		Agree_Btn.click();
    		
    		WebElement Proceed_Three = driver.findElement(By.name("processCarrier"));
    		Proceed_Three.click();
    		
    		
    		WebElement Payment = driver.findElement(By.className("bankwire"));
    		Payment.click();
    
    		WebElement confirm = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button/span"));
    		confirm.click();
    		
    		WebElement Scroll = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div"));
    		
    		JavascriptExecutor js = (JavascriptExecutor) driver;
    		js.executeScript("arguments[0].scrollIntoView();", Scroll);
    		Thread.sleep(4000);
    		TakesScreenshot ts = (TakesScreenshot)driver;
    		File source = ts.getScreenshotAs(OutputType.FILE);
    		File destination = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Automation_Project\\screenshot\\snp1.png");
    		FileUtils.copyFile(source, destination);
    		
    		Thread.sleep(3000);
    		
    		WebElement Back = driver.findElement(By.xpath("//a[@title='Back to orders']"));
    
    		Back.click();
    		
    		
    		WebElement Dresses = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a"));
    		a.moveToElement(Dresses).build().perform();
    		
    		WebElement Evening = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[2]/a"));
    		Evening.click();
    		
    		WebElement Img_two = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div/a[1]/img"));
    	a.moveToElement(Img_two).build().perform();
    		
    		WebElement More = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[2]/div[2]/a[2]/span"));
    		More.click();
    		
    		WebElement Pink = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[2]/div[2]/div/ul/li[2]/a/img"));
            a.moveToElement(Pink).build().perform();
            
            WebElement Two = driver.findElement(By.className("icon-plus"));
            Two.click();
           
            
            WebElement Add_To = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div[1]/p/button/span"));
            Add_To.click();
            Thread.sleep(6000);
            
            WebElement Checkout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
            Checkout.click();
            
            WebElement Checkout_Two = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]/span"));
            Checkout_Two.click();
            
            WebElement Checkout_Three = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button/span"));
            
            Checkout_Three.click();
            
            
            WebElement Agree = driver.findElement(By.id("cgv"));
            
            Agree.click();
            
            WebElement Checkout_Four = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/p/button/span"));
            
            Checkout_Four.click();
            
            WebElement Paymeny_Check = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[3]/div[2]/div/p/a"));
            
            Paymeny_Check.click();
            
            WebElement Confirm = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button/span"));
            Confirm.click();
            WebElement scroll_two = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/a"));
            JavascriptExecutor js1 = (JavascriptExecutor) driver;
    		js1.executeScript("arguments[0].scrollIntoView();", scroll_two);
    		Thread.sleep(4000);
    		
    		TakesScreenshot ts1 = (TakesScreenshot)driver;
    		File source1 = ts1.getScreenshotAs(OutputType.FILE);
    		File destination1 = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Automation_Project\\screenshot\\snp2.png");
    	FileUtils.copyFile(source1, destination1);
    		
    		Thread.sleep(6000);

	
            WebElement Back_Two = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a"));
            Back_Two.click();
            
            WebElement Sign_out = driver.findElement(By.xpath("//a[@title='Log me out']"));
            Sign_out.click();
            
            
	}}
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
    
    
    
    
    
	
	