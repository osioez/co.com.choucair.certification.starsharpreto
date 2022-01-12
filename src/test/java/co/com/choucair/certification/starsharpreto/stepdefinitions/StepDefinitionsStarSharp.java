package co.com.choucair.certification.starsharpreto.stepdefinitions;

import co.com.choucair.certification.starsharpreto.model.RegisterBusinessUnit;
import co.com.choucair.certification.starsharpreto.model.RegisterContac;
import co.com.choucair.certification.starsharpreto.model.RegisterCredentialDate;
import co.com.choucair.certification.starsharpreto.model.RegisterNewMeeting;
import co.com.choucair.certification.starsharpreto.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import static net.serenitybdd.screenplay.actors.OnStage.*;
public class StepDefinitionsStarSharp {

   @Before
    public void setStage(){
        WebDriverManager.chromedriver().setup();
        setTheStage(new OnlineCast());
    }

    @Given("^that the user needs to log into the system with his username and password$")
    public void thatTheUserIsRequiredToLoginToTheSystem() {
        theActor("user").wasAbleTo(OpenUp.thePage());
    }
    @When("^he enters his details and logs in$")
    public void heEntersHisDetailsAndLogsIn(List<RegisterCredentialDate> registerCredentialDates) {
        theActorInTheSpotlight().attemptsTo(Login.yourCredential(
                registerCredentialDates.get(0).getStrUser(),
                registerCredentialDates.get(0).getStrPass()
        ));
    }

    @Then("^the system will display a home page$")
    public void theSystemWillDisplayAHomePage() {
        theActorInTheSpotlight().attemptsTo(OpenUp.thePage());
    }



    @When("^the user has entered his credentials$")
    public void theUserHasEnteredHisCredentials(List<RegisterCredentialDate> registerCredentialDates) {
        theActorInTheSpotlight().attemptsTo(Login.yourCredential(
                registerCredentialDates.get(0).getStrUser(),
                registerCredentialDates.get(0).getStrPass()
        ));
    }

    @Then("^he can create the business unit$")
    public void heCanCreateTheBusinessUnit(List<RegisterBusinessUnit> registerBusinessUnits) {
        theActorInTheSpotlight().attemptsTo(Creating.newUnitBusiness(
                registerBusinessUnits.get(0).getNameUnit()
        ));
    }

    @Then("^User will then be able to create a meeting$")
    public void userWillThenBeAbleToCreateAMeeting(List<RegisterNewMeeting> registerNewMeetings) {
      theActorInTheSpotlight().attemptsTo(Program.aMeeting(
              registerNewMeetings.get(0).getMeetingName(),
              registerNewMeetings.get(0).getMeetingNumber(),
              registerNewMeetings.get(0).getMeetingType(),
              registerNewMeetings.get(0).getStartDate(),
              registerNewMeetings.get(0).getStartTime(),
              registerNewMeetings.get(0).getEndDate(),
              registerNewMeetings.get(0).getEndTime(),
              registerNewMeetings.get(0).getLocation(),
              registerNewMeetings.get(0).getUnit(),
              registerNewMeetings.get(0).getOrganized(),
              registerNewMeetings.get(0).getReporter(),
              registerNewMeetings.get(0).getAttendee()
      ));
    }

}
