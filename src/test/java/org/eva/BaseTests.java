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
    private WebDriver driver;
    protected HomePage page;

    @BeforeEach
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        page=new HomePage(driver);
//Shembull1
        //WebElement inpitsLink=driver.findElement(By.linkText("Inputs"));
        //inpitsLink.click();
//Shembull2
        //List<WebElement> links=driver.findElements(By.tagName("a"));
       // System.out.println(links.size());

//Ex.1
//        WebElement content=driver.findElement(By.linkText("Shifting Content"));
//        content.click();
//        driver.findElement(By.linkText(("Example 1: Menu Element"))).click();
//        List<WebElement>  liElements=driver.findElements(By.tagName("li"));
//         System.out.println(liElements.size());

    }
//    @AfterEach
//    public void tearDown(){
//        driver.quit();
//    }


//    public static void main(String[] args){
//        BaseTests tests=new BaseTests();
//        tests.setUp();
//    }
}
