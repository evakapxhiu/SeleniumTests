package shiftingcontent.tests;

import org.eva.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.ShiftingContent;

public class Shi3ftingContentTests extends BaseTests {

    @Test
    public void getTheSizeOfTheMenuEL(){
        driver.get(Baseurl);
        var shiftingClontentPage=page.shContentPage();
        shiftingClontentPage.clickExample1();
        Assertions.assertEquals(shiftingClontentPage.getTheSize(),5);
    }
}
