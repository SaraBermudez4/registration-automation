package co.com.choucair.certification.choucair.stepdefinitions;

import co.com.choucair.certification.choucair.model.UTestRegisterData;
import co.com.choucair.certification.choucair.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Rose want register on UTest$")
    public void thatRoseWantRegisterOnUTest() throws Exception{
        OnStage.theActorCalled("Rose").wasAbleTo(OpenUp.thePage());
    }

    @When("^she complete form step one$")
    public void sheCompleteFormStepOne(List<UTestRegisterData> academyChoucairData) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginStepOne.onThePage(
                        academyChoucairData.get(0).getStrUserName(),
                        academyChoucairData.get(0).getStrUserLastname(),
                        academyChoucairData.get(0).getStrUserEmail()));
    }

    @When("^she complete form step two$")
    public void sheCompleteFormStepTwo(List<UTestRegisterData> academyChoucairData) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginStepTwo.onThePage(
                        academyChoucairData.get(0).getStrUserCity(),
                        academyChoucairData.get(0).getStrUserZip()));
    }
    @When("^she complete form step three$")
    public void sheCompleteFormStepThree() throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(
                new LoginStepThree());
    }
    @Then("^she finsh register$")
    public void sheFinshRegister(List<UTestRegisterData> academyChoucairData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginStepFour.onThePage(
                        academyChoucairData.get(0).getStrUserPassword(),
                        academyChoucairData.get(0).getStrUserConfirmPassword()));
    }


    // Guia
    /*@When("^she search for the course on the choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform(List<AcademyChoucairData> academyChoucairData) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));
    }

    @Then("^she finds the course called$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia(List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse())));
    }*/
}
