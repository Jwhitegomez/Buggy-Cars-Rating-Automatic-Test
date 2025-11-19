package co.com.buggy.test.tasks;

import co.com.buggy.test.userinterfaces.RegistrationForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.By;

public class ProvideRegistrationCredentials implements Task {

    public static ProvideRegistrationCredentials completely() {
        return new ProvideRegistrationCredentials();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue("jimmy.gomez123").into(RegistrationForm.USERNAME),
                Enter.theValue("Jimmy").into(RegistrationForm.FIRST_NAME),
                Enter.theValue("Gomez").into(RegistrationForm.LAST_NAME),
                Enter.theValue("Password123@").into(RegistrationForm.PASSWORD),
                Enter.theValue("Password123@").into(RegistrationForm.CONFIRM_PASSWORD)
        );
    }
}
