package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class HoversPage {
    public WebDriver driver;
    private By figureBox=By.className("figure");
    private By caption=By.className("figcaption");

    public HoversPage(WebDriver driver) {
        this.driver = driver;
    }
    /**
     * @param index starts at 1
     */
    public FigureCaption hoversCheck(int index){
        WebElement figure=driver.findElements(figureBox).get(index-1);
        Actions action=new Actions(driver) ;
        action.moveToElement(figure).perform();
       return new FigureCaption(figure.findElement(caption));
    }

    public class FigureCaption{
        public WebElement caption;
        private By header = By.tagName("h5");

        private By link= By.tagName("a");

        public FigureCaption(WebElement caption) {
            this.caption = caption;
        }
        public boolean isCapDisplayed(){
            return caption.isDisplayed();
        }
        public String getText(){
            return caption.findElement(header).getText();
        }
        public String getLink(){
            return caption.findElement(link).getAttribute("href");
        }


    }
}
