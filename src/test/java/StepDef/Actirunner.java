package StepDef;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions (features ="C:\\Users\\ab\\eclipse-workspace\\Future_Tester\\Feature\\Actilogin1.feature",glue= {"StepDef"},plugin = {"html:target\\HTML1\\reports.html"})
public class Actirunner {

}
