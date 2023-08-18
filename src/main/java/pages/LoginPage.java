package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By setUsername=By.id("username");
    private By setPass=By.id("password");

    private By loginButton=By.cssSelector("#login button");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsername(String username){
        driver.findElement(setUsername).sendKeys(username);
    }

    public void setPass(String password){
        driver.findElement(setPass).sendKeys(password);
    }

    public SecureAres clickLoginButton(){
        driver.findElement(loginButton).click();
        return new SecureAres(driver);

    }
}
