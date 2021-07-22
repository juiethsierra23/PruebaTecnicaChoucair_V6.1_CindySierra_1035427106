package co.com.choucair.certification.proyecto1.stepdefinitions;
import co.com.choucair.certification.proyecto1.model.AcademyChoucairData;
import co.com.choucair.certification.proyecto1.questions.Answer;
import co.com.choucair.certification.proyecto1.tasks.Login;
import co.com.choucair.certification.proyecto1.tasks.OpenUp;
import co.com.choucair.certification.proyecto1.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefinitions {

@Before
public void setStage(){
    OnStage.setTheStage(new OnlineCast());
}

    @Given("^than Cindy wants to learn automation at the academy Choucair$")
    public void thanCindyWantsToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorCalled("Cindy").wasAbleTo(OpenUp.thePage(), Login.
                onThePage(academyChoucairData.get(0).getStrUser(),academyChoucairData.get(0).getStrPassword()));
    }

    @When("^she search for the course Recursos Automatizacion Bancolombia on the Chaucair academy platform$")
    public void sheSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChaucairAcademyPlatform(List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));
    }

    @Then("^she finds the course called recursos$")
    public void sheFindsTheCourseCalledRecursosAutomatizacionBancolombia(List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse())));
    }
}
