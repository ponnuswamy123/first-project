package CucumberMainclass;
import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features = {"features"}, glue = {"login","fetch","Addfields","Contentsearch"},dryRun=false)
public class Cucumbermain {

}
