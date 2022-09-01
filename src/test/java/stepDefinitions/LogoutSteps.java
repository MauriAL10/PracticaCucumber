package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import utilities.DriverManager;

public class LogoutSteps {

    LoginPage loginPage = new LoginPage(DriverManager.getDriver().driver);
    HomePage homepage = new HomePage(DriverManager.getDriver().driver);
    /*
    @Given("I set the user name field with {string}")
    public void setUserName(String userName)
    {
        loginPage.setUserNameTextBox(userName);
    }
    @Given("I set the password field with {string}")
    public void setPassword(String password){
        loginPage.setPasswordTextBox(password);
    }

     */
    @And("I click on Login button")
    public void clickOnLoginButton(){loginPage.clickOnLoginButton();}

    @When("I click on sidebar button and logout link")
    public void clicksToLogout(){
        homepage.clickOnHamburguerButton();
        homepage.clickOnLogoutLink();
    }
    @Then("The login page should be displayed")
    public void loginPageIsDisplayed(){
        Assert.assertTrue(loginPage.loginButtonIsDisplayed());
    }
    //public void clickOnLogoutLink(){homepage.clickOnLogoutLink();}

}
