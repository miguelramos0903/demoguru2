package co.com.capgemini.retodemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static co.com.capgemini.retodemo.userinterfaces.registro.RegistroUsuarioPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegistroUsuarioTask implements Task {
    private final List<String> data;

    public RegistroUsuarioTask(List<String> data) {
        this.data = data;
    }

    public static RegistroUsuarioTask inElPortalWeb(List<String> data) {
        return instrumented(RegistroUsuarioTask.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LINK_REGISTER),
                Enter.theValue(data.get(1)).into(FIRST_NAME),
                Enter.theValue(data.get(2)).into(LAST_NAME),
                Enter.theValue(data.get(3)).into(PHONE),
                Enter.theValue(data.get(4)).into(EMAIL),
                Enter.theValue(data.get(5)).into(ADDRESS),
                Enter.theValue(data.get(6)).into(CITY),
                Enter.theValue(data.get(7)).into(STATE),
                Enter.theValue(data.get(8)).into(POSTAL_CODE),
                Click.on(COUNTRY.of(data.get(9))),
                SelectFromOptions.byVisibleText(data.get(9)).from(COUNTRY2),
                Enter.theValue(data.get(10)).into(USER_NAME),
                Enter.theValue(data.get(11)).into(PASSWORD),
                Enter.theValue(data.get(12)).into(CONFRIM_PASSWORD),
                Scroll.to(ENVIAR),
                Click.on(ENVIAR));
    }
}
