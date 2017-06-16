package com.HaimAndBen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/haimyyy/dev/chromedriver 5");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.one.co.il");

        // Print a Log In message to the screen
        System.out.println("Successfully opened the website www.Store.Demoqa.com");
        //Wait for 5 Sec
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Close the driver
        driver.quit();
    }
}
