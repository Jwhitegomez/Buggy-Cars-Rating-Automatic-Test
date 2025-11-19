package co.com.autoex.QA.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.By;

public class EnterNameAndEmail implements Task {

    private final String name;
    private final String email;

    public EnterNameAndEmail(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public static EnterNameAndEmail withRandomEmail() {
        String randomEmail = "test" + System.currentTimeMillis() + "@mail.com";
        return new EnterNameAndEmail("Levi", randomEmail);
    }

    public static EnterNameAndEmail with(String name, String email) {
        return new EnterNameAndEmail(name, email);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(name).into(By.name("name")),
                Enter.theValue(email).into(By.cssSelector("input[data-qa='signup-email']"))
        );
    }
}
