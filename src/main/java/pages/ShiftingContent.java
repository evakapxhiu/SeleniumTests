package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ShiftingContent {
    public WebDriver driver;


    private By example1Link=By.linkText("Example 1: Menu Element");

    public ShiftingContent(WebDriver driver) {
        this.driver = driver;
    }
    public void clickExample1(){
        driver.findElement(example1Link).click();
    }
    public int getTheSize(){
        List<WebElement> listEl=driver.findElements(By.xpath("//*[@id='content']/div/ul/li"));
        return listEl.size();
    }

}
