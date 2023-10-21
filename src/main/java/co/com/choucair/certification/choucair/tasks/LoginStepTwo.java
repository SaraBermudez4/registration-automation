package co.com.choucair.certification.choucair.tasks;

import co.com.choucair.certification.choucair.userinterface.UTestLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginStepTwo implements Task {
    private String strUserCity;
    private String strUserZip;

    public LoginStepTwo(String strUserCity, String strUserZip) {
        this.strUserCity = strUserCity;
        this.strUserZip = strUserZip;
    }

    public static LoginStepTwo onThePage(String strUserCity, String strUserZip) {
        return Tasks.instrumented(LoginStepTwo.class, strUserCity, strUserZip);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Enter.theValue(strUserCity).into(UTestLoginPage.INPUT_CITY),
                Enter.theValue(strUserZip).into(UTestLoginPage.INPUT_ZIP),
                Click.on(UTestLoginPage.ENTER_BUTTON_DEVICES));
    }
}