package co.com.autoex.QA.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FillRegisterForm implements Task {

    public static FillRegisterForm completely() {
        return new FillRegisterForm();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                // Title
                Click.on(By.id("id_gender1")),

                // Password
                Enter.theValue("123456").into(By.id("password")),

                // Date of birth
                SelectFromOptions.byValue("1").from(By.id("days")),
                SelectFromOptions.byValue("1").from(By.id("months")),
                SelectFromOptions.byValue("1990").from(By.id("years")),

                // Name + Address
                Enter.theValue("Levi").into(By.id("first_name")),
                Enter.theValue("Torres").into(By.id("last_name")),
                Enter.theValue("Fake Street 123").into(By.id("address1")),

                // Location
                SelectFromOptions.byVisibleText("United States").from(By.id("country")),
                Enter.theValue("California").into(By.id("state")),
                Enter.theValue("Los Angeles").into(By.id("city")),
                Enter.theValue("90001").into(By.id("zipcode")),
                Enter.theValue("3005558899").into(By.id("mobile_number"))
        );
    }
}
