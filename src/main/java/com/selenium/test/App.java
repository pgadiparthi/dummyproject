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
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.out.println( "Hello World!" );
        
        System.setProperty("webdriver.chrome.driver", "C:\\Prathap\\Azure\\Bootcamp-TCS\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        
        ChromeOptions chromeoptions = new ChromeOptions();
        
        WebDriver driver = new ChromeDriver(chromeoptions);
        
        driver.get("http://35.172.118.253:8080/addressbook-2.0/");
        
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        
        driver.findElement(By.className("v-button")).click();
        
        driver.findElement(By.id("gwt-uid-5")).sendKeys("PrathapAutomationFirstName");
        
        Thread.sleep(1000);
        
        driver.findElement(By.id("gwt-uid-7")).sendKeys("PrathapAutomationLastName");
      
        Thread.sleep(1000);
        
        driver.findElement(By.id("gwt-uid-9")).sendKeys("PrathapAutomation99999999");
        
        Thread.sleep(1000);
        
        driver.findElement(By.id("gwt-uid-11")).sendKeys("PrathapAutomation@xyz.com");
        
        Thread.sleep(1000);
        
        driver.findElement(By.id("gwt-uid-13")).sendKeys("2/1/24,");
        
        Thread.sleep(1000);
        
        driver.findElement(By.className("v-button-primary")).click();
        
        
        driver.quit();
    }
}		
