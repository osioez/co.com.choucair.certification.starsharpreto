package co.com.choucair.certification.starsharpreto.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/starSharp.feature",
        tags = "@scenario",
        glue = "co.com.choucair.certification.starsharpreto.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerStarSharp {
}
