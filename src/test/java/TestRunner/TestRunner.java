package TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features/chatServer.feature"
,glue = "stepdefinitions"
      , tags = "@singleRequest"
)
public class TestRunner {
}
