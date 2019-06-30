package com.it;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class PrivateBrowsing {
    public static void main(String args[]){
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\IdeaProjects\\Testemail\\Drivers\\chromedriver2.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://i.ua");

    }
}