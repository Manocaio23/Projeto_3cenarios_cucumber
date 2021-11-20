package Runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/inserir_conta.feature",
		glue = {""},
		dryRun = false,
		monochrome = true,
		tags = "~@ignore",
		plugin = {"pretty", "html:target/cucumber-report.html"})
public class RunnerClass {

}
