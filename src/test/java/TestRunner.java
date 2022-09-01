import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //features = "src/test/resources/Logout.feature",
        features = "src/test/resources/HomePage.feature",
        glue = {"stepDefinitions"},
        //tags = "@verifyLogoutTest"
        //tags = "@verifyCartButtonNumberIsAdded"
        tags = "@lowToHighFilter"
)
public class TestRunner {
}
