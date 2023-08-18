package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownPage {
    private WebDriver driver;
    private By dropwdown=By.id("dropdown");

    public DropDownPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectDropDown(String option){
    findDropEle().selectByVisibleText(option);
    }

    public List<String> getSelectedOption(){
   List<WebElement> selectedEl= findDropEle().getAllSelectedOptions();
    return selectedEl.stream().map(e->e.getText()).collect(Collectors.toList());
    }

    private  Select findDropEle(){
        return new Select(driver.findElement(dropwdown));
    }
}
