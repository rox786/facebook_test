package com.selenium.facebook_test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
        System.out.println( "Hello, testing facebook on Jenkins!!!" );
    	//initialize driver property
    	//System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64");
    	
    	//setup chrome options parameters
    	ChromeOptions chromeOptions = new ChromeOptions();
    	//headless to execute chrome as backend
    	//chromeOptions.addArguments("--headless");

    	//initialize web driver
    	WebDriver webDriver = new ChromeDriver(chromeOptions);

    	//open url
    	webDriver.get("https://www.facebook.com/");
    	System.out.println( "Opening Facebook" );
    	
		//Invoke wait to load application page
    	webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    	
    	//locate user and password
    	webDriver.findElement(By.id("email")).sendKeys("yunkiemail@gmail.com");
    	System.out.println( "Setting email" );    	
    	webDriver.findElement(By.id("pass")).sendKeys("koibumi");
    	System.out.println( "Setting pass" );
    	
    	//press "login"
 	   	webDriver.findElement(By.name("login")).click();
    	System.out.println( "Logging in" );
    	try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	webDriver.close();
    	System.out.println( "web driver closing");
    }
}
