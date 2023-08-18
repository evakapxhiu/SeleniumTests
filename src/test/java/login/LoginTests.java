package login;

import org.eva.BaseTests;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.SecureAres;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class LoginTests extends BaseTests {
    @Test
public void testSuccessfulLogin(){
    LoginPage loginPage=page.loginPage();
    loginPage.setUsername("tomsmith");
    loginPage.setPass("SuperSecretPassword!");
    SecureAres secureAres=loginPage.clickLoginButton();
    assertTrue(secureAres.getAlertText().contains("You logged into a secure area!"),"Alert text is incorrect!");
}

}
