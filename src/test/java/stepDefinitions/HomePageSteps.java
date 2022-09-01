package stepDefinitions;

import com.google.common.collect.Ordering;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import utilities.DriverManager;

import java.util.List;

public class HomePageSteps {
    LoginPage loginPage = new LoginPage(DriverManager.getDriver().driver);
    HomePage homepage = new HomePage(DriverManager.getDriver().driver);
    @When("I click on sauce labs back pack add button")
    public void clickOnAddSauceLabsBackPackButton(){
        homepage.clickOnAddSauceLabsBackPackToCartButton();
    }

    @Then("Cart icon number should be incremented")
    public void verifyCartNumberIsAdded(){
        Assert.assertEquals("1", homepage.getCartIconText());
    }

    @When("I click on Price low to high")
    public void selectProductFilter(){
        homepage.selectProductFilter("Price (low to high)");
    }

    @Then("Products should be ordered from low to high price")
    public void pricesAreSorted(){
        List<Double> prices = homepage.getAllItemPrices();
        boolean pricesAreSorted = Ordering.natural().isOrdered(prices);
        Assert.assertTrue(pricesAreSorted);
    }
}
