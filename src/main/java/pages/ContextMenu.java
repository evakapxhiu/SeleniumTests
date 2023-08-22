package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContextMenu {
    private WebDriver driver;
    public ContextMenu(WebDriver driver) {
        this.driver = driver;
    }
    private By box=By.id("hot-spot");


}
