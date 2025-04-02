package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("standard_user")).sendKeys("standard_user");
        driver.findElement(By.id("secret_sauce")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }
}
