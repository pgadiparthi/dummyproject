package com.selenium.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class Facebook
{
    public static void main( String[] args ) throws InterruptedException
    {
                
        System.setProperty("webdriver.chrome.driver", "C:\\Prathap\\Azure\\Bootcamp-TCS\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        
        ChromeOptions chromeoptions = new ChromeOptions();
        
        WebDriver driver = new ChromeDriver(chromeoptions);
        
        driver.get("https://www.facebook.com/");
        
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        
        //driver.findElement(By.className("v-button")).click();
        
        driver.findElement(By.id("email")).sendKeys("PrathapAutomation@gmail.com");
        
        Thread.sleep(1000);
        
        driver.findElement(By.id("pass")).sendKeys("abc123abc");
      
        Thread.sleep(1000);
                  
        driver.findElement(By.className("_42ft")).click();
        
        Thread.sleep(3000);
        
        System.out.println("Login Clicked");
        
        driver.quit();
    }
}		
