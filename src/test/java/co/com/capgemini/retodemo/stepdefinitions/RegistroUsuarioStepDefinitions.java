package co.com.capgemini.retodemo.stepdefinitions;

import co.com.capgemini.retodemo.questions.VerificarRegistroUsuarioQuestions;
import co.com.capgemini.retodemo.tasks.RegistroUsuarioTask;
import co.com.capgemini.retodemo.userinterfaces.registro.RegistroUsuarioPage;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static co.com.capgemini.retodemo.questions.VerificarRegistroUsuarioQuestions.*;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistroUsuarioStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor miguel = Actor.named("Miguel");

    @Before
    public void initialConfiguration() {
        miguel.can(BrowseTheWeb.with(hisBrowser));
    }


    @Dado("^que (.*) quiero registrar un nuevo usuario en el portal web$")
    public void queYoQuieroRegistrarUnNuevoUsuarioEnElPortalWeb(Actor actor) {
        miguel.attemptsTo(Open.url("http://demo.guru99.com/test/newtours/"));
    }

    @Cuando("^ingreso los datos requeridos en el formulario$")
    public void ingresoLosDatosRequeridosEnElFormulario(List<String> data) {
        miguel.attemptsTo(RegistroUsuarioTask.inElPortalWeb(data));
    }

    @Entonces("^verifico el (.*) de l registro de usuario$")
    public void verificoElResultadoEsperadoDeLRegistroDeUsuario(String resultadoEsperado) {
        miguel.should(GivenWhenThen
                .seeThat(verificarRegistroQuestions(), Matchers.equalToIgnoringCase(resultadoEsperado)));
    }
}
