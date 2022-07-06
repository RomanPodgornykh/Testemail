package com.it;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class BasePage {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\IdeaProjects\\Testemail\\Drivers\\chromedriver2.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.i.ua");
        driver.manage().window().maximize();


        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[3]/div[2]/div[1]/div[3]/form/ul/li[1]/p[2]/input")).sendKeys("mailname");
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[3]/div[2]/div[1]/div[3]/form/ul/li[1]/input")).sendKeys("pass");
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[3]/div[2]/div[1]/div[3]/form/p/input")).click();  //логин в почту
        driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[1]/div[1]/p/a")).click();
        driver.findElement(By.xpath("//*[@id=\"to\"]")).sendKeys("testoff1@protonmail.com");
        driver.findElement(By.xpath("/html/body/div[4]/div[6]/div[1]/div[1]/div[1]/div/form/div[5]/div[2]/span/input[1]")).sendKeys("test");
        driver.findElement(By.xpath("//*[@id=\"text\"]")).sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
        //driver.findElement(By.xpath("//*[@id=\"label_req\"]")).click(); // Запросить уведомление о прочтении
        driver.findElement(By.xpath("/html/body/div[4]/div[6]/div[1]/div[1]/p[1]/input[1]")).click(); //отправка письма
        //driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[2]/div[1]/div[2]/div[3]/ul/li[1]/a")).click();// проверка получения i.ua
        driver.get("http://www.protonmail.com");
        Object example;
        driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[7]/a")).click();
        driver.findElement(By.id("username")).sendKeys("testoff1@protonmail.com");
        driver.findElement(By.id("password")).sendKeys("Mailinator1");
        driver.findElement(By.id("login_btn")).click();//логин в почту получателя
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"conversation-list-columns\"]/section/div[1]/div[2]/div[1]/h4/span[3]")).click();
        driver.findElement(By.xpath("//*[@id=\"message0\"]/div[1]/div[1]/div[1]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"message0\"]/div[2]/div[1]/section/div/button")).click();//подтверждение прочтения

        driver.get("http://www.i.ua");
        //driver.manage().window().maximize();


        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[3]/div[2]/div[1]/div[3]/form/ul/li[1]/p[2]/input")).sendKeys("buckley1");
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[3]/div[2]/div[1]/div[3]/form/ul/li[1]/input")).sendKeys("Tester11");
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[3]/div[2]/div[1]/div[3]/form/p/input")).click();  //логин в почту
        driver.findElement(By.xpath("//*[@id=\"mesgList\"]/form/div[1]/a/span[3]/span")).click();//уведомление о прочтении









        //driver.quit();

    }



}
