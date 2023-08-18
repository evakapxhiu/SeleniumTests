package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public LoginPage loginPage (){
    linkTexts("Form Authentication");
        return new LoginPage(driver);
    }

    public DropDownPage dropDownPage(){
        linkTexts("Dropdown");
        return new DropDownPage(driver);
    }

    public HoversPage hoversPage(){
        linkTexts("Hovers");
        return new HoversPage(driver);
    }

    //generic method
    private void linkTexts(String links){
        driver.findElement(By.linkText(links)).click();

    }



}
