package org.eva;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

import java.util.List;

public class BaseTests  {
    public WebDriver driver;
    protected HomePage page;

    public static final String Baseurl = "https://the-internet.herokuapp.com/";
    @BeforeEach
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver=new ChromeDriver();
        page=new HomePage(driver);
    }
    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
