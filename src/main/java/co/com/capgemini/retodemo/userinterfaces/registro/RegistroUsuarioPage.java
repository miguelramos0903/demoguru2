package co.com.capgemini.retodemo.userinterfaces.registro;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroUsuarioPage {
    public static final Target LINK_REGISTER = Target
            .the("link para abrir formulario de registrar")
            .located(By.linkText("REGISTER"));

    public static final Target FIRST_NAME = Target
            .the("Campo para ingresar el nombre")
            .located(By.name("firstName"));

    public static final Target LAST_NAME = Target
            .the("Campo para ingresar el apellido")
            .located(By.name("lastName"));

    public static final Target PHONE = Target
            .the("Campo para ingresar el telefono")
            .located(By.name("phone"));

    public static final Target EMAIL = Target
            .the("Campo para ingresar el correo")
            .located(By.id("userName"));

    public static final Target ADDRESS = Target
            .the("Campo para ingresar la dirección")
            .located(By.name("address1"));

    public static final Target CITY = Target
            .the("Campo para ingresar la ciudad")
            .located(By.name("city"));

    public static final Target STATE = Target
            .the("Campo para ingresar el estado o la provincia")
            .located(By.name("state"));

    public static final Target POSTAL_CODE = Target
            .the("Campo para ingresar el codigo postal")
            .located(By.name("postalCode"));

    public static final Target COUNTRY = Target
            .the("Campo para ingresar el pais")
            .locatedBy("//*[@name='country']//*[contains(text(), '{0}')]");

    public static final Target COUNTRY2 = Target
            .the("Campo para ingresar el pais")
            .located(By.name("country"));

    public static final Target USER_NAME = Target
            .the("Campo para ingresar el nombre de usuario")
            .located(By.id("email"));

    public static final Target PASSWORD = Target
            .the("Campo para ingresar el password")
            .located(By.name("password"));

    public static final Target CONFRIM_PASSWORD = Target
            .the("Campo para ingresar la confirmación del password")
            .located(By.name("confirmPassword"));

    public static final Target ENVIAR = Target
            .the("Botón para envíar el registro")
            .located(By.name("submit"));

    public static final Target MENSAJE_REGISTRO_EXITOSO = Target
            .the("mensaje del registro de usuario")
            .located(By.cssSelector("p:nth-child(3) > font > b"));
}
