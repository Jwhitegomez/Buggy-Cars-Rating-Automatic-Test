package co.com.autoex.QA.stepdefinitions;

import co.com.autoex.QA.tasks.ClickButton;
import co.com.autoex.QA.tasks.EnterNameAndEmail;
import co.com.autoex.QA.tasks.FillRegisterForm;
import co.com.autoex.QA.tasks.GoToHomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

public class RegisterStepDefinition {

    private Actor user;

    @Managed(driver = "chrome")
    public WebDriver theDriver;

    @Before
    public void setUp() {
        user = Actor.named("Levi");
        user.can(BrowseTheWeb.with(theDriver));
    }

    @Given("I am on the AutomationExercises homepage")
    public void iAmOnTheAutomationExercisesHomepage() {
        user.attemptsTo(
                GoToHomePage.open()
        );
    }

    @When("I click on the {string} button")
    public void iClickOnTheButton(String button) {
        user.attemptsTo(
                ClickButton.withName(button)
        );
    }

    @When("I enter a valid name and email in the Signup section")
    public void iEnterAValidNameAndEmailInTheSignupSection() {
        user.attemptsTo(
                EnterNameAndEmail.withRandomEmail()
        );
    }

    @When("I touch the {string} button")
    public void iClickTheButton(String button) {
        user.attemptsTo(
                ClickButton.withName(button)
        );
    }

    @When("I fill in all required fields in the registration form")
    public void iFillInAllRequiredFieldsInTheRegistrationForm() {
        user.attemptsTo(
                FillRegisterForm.completely()
        );
    }

    @Then("I should see the message {string}")
    public void iShouldSeeTheMessage(String expectedMessage) {
        System.out.println("Checking message: " + expectedMessage);

    }

    @Then("I click the {string} button")
    public void iClickTheButtonContinue(String button) {
        user.attemptsTo(
                ClickButton.withName(button)
        );
    }
}
