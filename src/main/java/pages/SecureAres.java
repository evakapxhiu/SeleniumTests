package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAres {
    private WebDriver driver;
    private By alertText=By.id("flash");



    public SecureAres(WebDriver driver) {
        this.driver = driver;
    }

    public String getAlertText(){
       return driver.findElement(alertText).getText();

    }

}
