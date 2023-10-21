package co.com.choucair.certification.choucair.tasks;

import co.com.choucair.certification.choucair.userinterface.UTestLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class LoginStepThree implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UTestLoginPage.ENTER_BUTTON_LAST));
    }
}