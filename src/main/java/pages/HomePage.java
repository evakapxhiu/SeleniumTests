package pages;

import org.checkerframework.checker.units.qual.C;
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

    public ShiftingContent shContentPage(){
        linkTexts("Shifting Content");
        return new ShiftingContent(driver);
    }

    public HorizontalSlider horizontalSlider(){
        linkTexts("Horizontal Slider");
        return new HorizontalSlider(driver);
    }

    public ContextMenu contextMenu(){
        linkTexts("Context Menu");
        return new ContextMenu(driver);
    }
    //generic method
    private void linkTexts(String links){
        driver.findElement(By.linkText(links)).click();

    }
}
