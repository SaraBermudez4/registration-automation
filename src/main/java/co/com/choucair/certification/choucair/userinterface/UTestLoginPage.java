package co.com.choucair.certification.choucair.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestLoginPage extends PageObject {

    // Tutorial
    //public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login").located(By.xpath("*//div[@class='d-none d-lg-block']//strong[contains(text(), 'Ingresar')]"));
    //public static final Target INPUT_USER = Target.the("where do we write user").located(By.id("username"));
    //public static final Target INPUT_PASSWORD = Target.the("where do we write password").located(By.id("password"));
    //public static final Target ENTER_BUTTON = Target.the("button to confirm login").located(By.xpath("//button[contains(text(),'Acceder')]"));

    // Step 1
    public static final Target SIGNUP_BUTTON = Target.the("button that shows us the form to login").located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up' and text()='Join Today']"));
    public static final Target INPUT_NAME = Target.the("where do we write the user name").located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("where do we write the user lastname").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("where do we write the user email").located(By.id("email"));
    public static final Target INPUT_DATE_BIRTH_MONTH = Target.the("where do we write the user date of birth month").located(By.xpath("//option[@label='February' and text()='February']"));
    public static final Target INPUT_DATE_BIRTH_DAY = Target.the("where do we write the user date of birth day").located(By.xpath("//option[@label='28' and text()='28']"));
    public static final Target INPUT_DATE_BIRTH_YEAR = Target.the("where do we write the user date of birth year").located(By.xpath("//option[@label='2001' and text()='2001']"));
    public static final Target ENTER_BUTTON_LOCATION = Target.the("button to next step:location").located(By.xpath("//a[@aria-label='Next step - define your location' and @class='btn btn-blue']"));

    // Step 2
    public static final Target INPUT_CITY= Target.the("where do we write the user city").located(By.id("city"));
    public static final Target INPUT_ZIP = Target.the("where do we write the user zip").located(By.id("zip"));
    public static final Target ENTER_BUTTON_DEVICES = Target.the("button to next step:devices").located(By.xpath("//a[@aria-label='Next step - select your devices' and @class='btn btn-blue pull-right']"));

    // Step 3
    /* static final Target INPUT_DEVICE_COMPUTER = Target.the("where do we write the user device computer").located(By.xpath("//div[@class='ui-select-choices-row active' and @role='option' and @ng-click='$select.select(device,$select.skipFocusser,$event)']"));
    public static final Target INPUT_DEVICE_VERSION = Target.the("where do we write the user device version").located(By.xpath("//div[@class='ui-select-choices-row active' and @role='option' and @ng-click='$select.select(version,$select.skipFocusser,$event)']"));
    public static final Target INPUT_DEVICE_LANGUAGE = Target.the("where do we write the user device language").located(By.xpath("//div[@class='ui-select-choices-row active' and @role='option' and @ng-click='$select.select(language,$select.skipFocusser,$event)']"));*/
    public static final Target ENTER_BUTTON_LAST = Target.the("button to next step:last").located(By.xpath("//a[@aria-label='Next - final step' and @class='btn btn-blue pull-right']"));

    // Step 4
    public static final Target INPUT_PASSWORD= Target.the("where do we write the user password").located(By.id("password"));
    public static final Target INPUT_CONFIRMPASSWORD = Target.the("where do we write the user confirm password").located(By.id("confirmPassword"));
    public static final Target CHECK_TERMS_USE = Target.the("where do we write the user accept terms use").located(By.xpath("//span[@class='checkmark signup-consent__checkbox error' and @ng-class=\"{error: userForm.termOfUse.$error.required}\"]"));

    public static final Target CHECK_PRIVACY_POLICY = Target.the("where do we write the user accept terms use").located(By.xpath("//span[@class='checkmark signup-consent__checkbox error' and @ng-class=\"{error: userForm.privacySetting.$error.required}\"]"));

    public static final Target ENTER_BUTTON_COMPLETE_SETUP = Target.the("button to Complete Setup").located(By.xpath("//a[@class='btn btn-blue' and @aria-label='Complete Setup' and @ng-click='submitForm(userForm);']"));

}
