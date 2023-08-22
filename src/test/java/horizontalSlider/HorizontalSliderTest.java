package horizontalSlider;

import org.eva.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class HorizontalSliderTest extends BaseTests {
    @Test
    public void  horizontalSliderTest(){
        driver.get(Baseurl);
        var hSlider=page.horizontalSlider();
        String rightValue="4";
         hSlider.slideMEthod(rightValue);
        Assertions.assertEquals(hSlider.slideToGetNumber(),rightValue);
    }
}
