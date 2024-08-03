package com.fitpio.assgn;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fitpeo_Assignment {
	
	public static void main(String[] args) throws Exception{
	    //WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// 1: URL Navigate
		driver.get("https://fitpeo.com/");
		Thread.sleep(4500);
		
		// 2: From the home page, navigate to the Revenue Calculator Page.
		
		driver.navigate().to("https://fitpeo.com/revenue-calculator");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// 3: Scroll Down
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)", "");
		
		// 4: Adjust the Slider:820
		
		WebElement slider = driver.findElement(By.xpath("//span[@data-index='0']"));
		System.out.println("Location of the minimum slider : " +slider.getLocation());//getLoacation belongs to webelement  x axes and y axes
		System.out.println("Location of the minimum slider X : " +slider.getLocation().getX());
		System.out.println("Location of the minimum slider Y: " +slider.getLocation().getY());
		Actions ac = new Actions(driver);
		ac.dragAndDropBy(slider,93, 0).perform();
		System.out.println("Location of the minimum slider after moving : "+slider.getLocation());
		Thread.sleep(4500);
		Robot rc = new Robot();
		
		rc.keyPress(KeyEvent.VK_RIGHT); 
		rc.keyRelease(KeyEvent.VK_RIGHT);
		rc.keyPress(KeyEvent.VK_RIGHT); 
		rc.keyRelease(KeyEvent.VK_RIGHT);
		rc.keyPress(KeyEvent.VK_RIGHT); 
		rc.keyRelease(KeyEvent.VK_RIGHT);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// 5: Update the Text Field:560
		driver.findElement(By.xpath("//input[@id=':R57alklff9da:'][@type='number']")).click();
		driver.findElement(By.xpath("//input[@id=':R57alklff9da:'][@type='number']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//input[@id=':R57alklff9da:'][@type='number']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//input[@id=':R57alklff9da:'][@type='number']")).sendKeys(Keys.BACK_SPACE);

		Thread.sleep(4500);
		driver.findElement(By.xpath("//input[@id=':R57alklff9da:'][@type='number']")).sendKeys("560");
		Thread.sleep(4500);
		System.out.println("Our Slider is gone to 560 ");

		Thread.sleep(4500);
		
		driver.findElement(By.xpath("//input[@id=':R57alklff9da:'][@type='number']")).click();
		driver.findElement(By.xpath("//input[@id=':R57alklff9da:'][@type='number']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//input[@id=':R57alklff9da:'][@type='number']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//input[@id=':R57alklff9da:'][@type='number']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//input[@id=':R57alklff9da:'][@type='number']")).sendKeys("820");
		Thread.sleep(3000);
		
		// 6: Scroll Down 
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(3000);
		
		//7: Check Boxes
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/label/span[1]/input")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/label/span[1]/input")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/label/span[1]/input")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[8]/label/span[1]/input")).click();
		Thread.sleep(1500);
		
		// 8: Total Recurring Reimbursement for all Patients Per Month: shows the value $110700.	
        // 9: Verify that the header displaying Total Recurring Reimbursement for all Patients Per Month: shows the value $110700.	
		
		String str = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/div[3]/p[1]")).getText();
	    System.out.println(str);
	    
	    String std = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/div[3]/p[2]")).getText();
	    System.out.println(std);
	    
		driver.quit();
}
}



