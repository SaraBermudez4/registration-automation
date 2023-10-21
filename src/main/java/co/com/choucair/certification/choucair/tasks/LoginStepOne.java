package co.com.choucair.certification.choucair.tasks;

import co.com.choucair.certification.choucair.userinterface.UTestLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginStepOne implements Task {
    private String strUserName;
    private String strUserLastname;
    private String strUserEmail;

    public LoginStepOne(String strUserName, String strUserLastname, String strUserEmail) {
        this.strUserName = strUserName;
        this.strUserLastname = strUserLastname;
        this.strUserEmail = strUserEmail;
    }

    public static LoginStepOne onThePage(String strUser, String strPassword, String strUserEmail) {
        return Tasks.instrumented(LoginStepOne.class, strUser, strPassword, strUserEmail);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
    actor.attemptsTo(Click.on(UTestLoginPage.SIGNUP_BUTTON),
            Enter.theValue(strUserName).into(UTestLoginPage.INPUT_NAME),
            Enter.theValue(strUserLastname).into(UTestLoginPage.INPUT_LASTNAME),
            Enter.theValue(strUserEmail).into(UTestLoginPage.INPUT_EMAIL),
            Click.on(UTestLoginPage.INPUT_DATE_BIRTH_MONTH),
            Click.on(UTestLoginPage.INPUT_DATE_BIRTH_DAY),
            Click.on(UTestLoginPage.INPUT_DATE_BIRTH_YEAR),
            Click.on(UTestLoginPage.ENTER_BUTTON_LOCATION));
    }
}
