package co.com.choucair.certification.choucair.tasks;

import co.com.choucair.certification.choucair.userinterface.UTestLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginStepFour implements Task {
    private String strUserPassword;
    private String strUserPasswordConfirm;

    public LoginStepFour(String strUserPassword, String strUserPasswordConfirm) {
        this.strUserPassword = strUserPassword;
        this.strUserPasswordConfirm = strUserPasswordConfirm;
    }

    public static LoginStepFour onThePage(String strUserPassword, String strUserPasswordConfirm) {
        return Tasks.instrumented(LoginStepFour.class, strUserPassword, strUserPasswordConfirm);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strUserPassword).into(UTestLoginPage.INPUT_PASSWORD),
                Enter.theValue(strUserPasswordConfirm).into(UTestLoginPage.INPUT_CONFIRMPASSWORD),
                Click.on(UTestLoginPage.CHECK_TERMS_USE),
                Click.on(UTestLoginPage.CHECK_PRIVACY_POLICY),
                Click.on(UTestLoginPage.ENTER_BUTTON_COMPLETE_SETUP)
        );
    }
}
