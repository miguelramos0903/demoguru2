package co.com.capgemini.retodemo.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/registro_usuario.feature",
        glue = {"co.com.capgemini.retodemo.stepdefinitions"},
        snippets = SnippetType.CAMELCASE,
        plugin = {"json:target/cucumber_json/cucumber.json"}
)
public class RegistroUsuario {
}
