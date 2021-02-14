package StepDefinition;

//import PageObjectModel.*;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"StepDefinition"},
plugin = {"pretty", "html:target/HTMLReports/report", "json:target/JsonReports/report.json","junit:target/JUnitReports/report.xml"}
, monochrome = true
//, tags = "@ContactPage"
)
public class TestRunner {

}
