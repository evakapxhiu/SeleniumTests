package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSlider {
    private WebDriver driver;

    public HorizontalSlider(WebDriver driver) {
        this.driver = driver;
    }
    private By number=By.id("range");
    private By slider=By.xpath("//input[@onChange='showValue(this.value)']");
    public void slideMEthod(String keys){
        while (!slideToGetNumber().equals(keys))
        driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
    }
    public String slideToGetNumber(){
       return driver.findElement(number).getText();
    }
}
