import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;
import utilities.DriverManager;

public class LogoutTests extends BaseTest {
    @Test
    public void verifyLogoutTest()  {
        LoginPage loginPage = new LoginPage(DriverManager.getDriver().driver);
        loginPage.setUserNameTextBox("standard_user");
        loginPage.setPasswordTextBox("secret_sauce");
        loginPage.clickOnLoginButton();
        HomePage homepage= new HomePage(DriverManager.getDriver().driver);
        homepage.clickOnHamburguerButton();
        homepage.clickOnLogoutLink();
        Assert.assertTrue(loginPage.loginButtonIsDisplayed());
    }
}
