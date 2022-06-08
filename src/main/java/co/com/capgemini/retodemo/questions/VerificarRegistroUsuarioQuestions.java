package co.com.capgemini.retodemo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.capgemini.retodemo.userinterfaces.registro.RegistroUsuarioPage.MENSAJE_REGISTRO_EXITOSO;

public class VerificarRegistroUsuarioQuestions implements Question<String> {

    public static Question<String> verificarRegistroQuestions() {
        return new VerificarRegistroUsuarioQuestions();
    }

    @Override
    public String answeredBy(Actor actor) {
        String resultadoObtenido = null;
        resultadoObtenido = Text.of(MENSAJE_REGISTRO_EXITOSO).viewedBy(actor).asString();
        return resultadoObtenido;
    }
}
