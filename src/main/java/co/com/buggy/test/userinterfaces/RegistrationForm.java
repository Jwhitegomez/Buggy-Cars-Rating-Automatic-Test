package co.com.buggy.test.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistrationForm {

    public static final Target USERNAME = Target.the("Username field").located(By.id("username"));
    public static final Target FIRST_NAME = Target.the("First name field").located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("Last name field").located(By.id("lastName"));
    public static final Target PASSWORD = Target.the("Password field").located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("Confirm password field").located(By.id("confirmPassword"));

    public static final Target REGISTER_BUTTON =
            Target.the("Register submit button")
                    .located(By.xpath("//my-register//form//button[contains(text(),'Register')]"));
}
