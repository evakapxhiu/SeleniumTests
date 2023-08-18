package dropdown;

import org.eva.BaseTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DropDownTests extends BaseTests {
    @Test
    public void testDropDown(){
        var dropDownPage=page.dropDownPage();
        String option="Option 1";
        dropDownPage.selectDropDown(option);
        var selectedOpt=dropDownPage.getSelectedOption();
        assertEquals(selectedOpt.size(),1,"incorrect number");
        assertTrue(selectedOpt.contains(option),"Option not selected");
    }
}
