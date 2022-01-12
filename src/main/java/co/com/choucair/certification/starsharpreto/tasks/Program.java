package co.com.choucair.certification.starsharpreto.tasks;

import co.com.choucair.certification.starsharpreto.model.RegisterNewMeeting;
import co.com.choucair.certification.starsharpreto.userinterface.RegisterMeeting;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.actions.selectactions.SelectByIndexFromTarget;
import net.serenitybdd.screenplay.questions.SelectOptions;
import org.openqa.selenium.support.ui.Select;

public class Program  implements Task {

    private String meetingName;
    private String meetingNumber;
    private String meetingType;
    private String startDate;
    private String startTime;
    private String endDate;
    private String endTime;
    private String location;
    private String unit;
    private String organized;
    private String reporter;
    private String attendee;

    public Program(String meetingName,
                   String meetingNumber,
                   String meetingType,
                   String startDate,
                   String startTime,
                   String endDate,
                   String endTime,
                   String location,
                   String unit,
                   String organized,
                   String reporter,
                   String attendee) {

        this.meetingName = meetingName;
        this.meetingNumber = meetingNumber;
        this.meetingType = meetingType;
        this.startDate = startDate;
        this.startTime = startTime;
        this.endDate = endDate;
        this.endTime = endTime;
        this.location = location;
        this.unit = unit;
        this.organized = organized;
        this.reporter = reporter;
        this.attendee = attendee;
    }

    public static Program aMeeting(String meetingName, String meetingNumber,String meetingType, String startDate, String startTime,
                                   String endDate, String endTime, String location, String unit, String organized,
                                   String reporter, String attendee) {
        return Tasks.instrumented(Program.class, meetingName,meetingNumber,meetingType,startDate,startTime,endDate,endTime,location,
                unit,organized,reporter,attendee);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RegisterMeeting.BUTTON_MEETING),
                Click.on(RegisterMeeting.BUTTON_AGENDA),
                Click.on(RegisterMeeting.BUTTON_NEW_MEETING),
                Enter.theValue(meetingName).into(RegisterMeeting.INPUT_NAME),
                Enter.theValue(meetingNumber).into(RegisterMeeting.INPUT_NUMBER),

                Click.on(RegisterMeeting.SELECT_TYPE0),
                Enter.theValue(meetingType).into(RegisterMeeting.SELECT_TYPE1),
                Click.on(RegisterMeeting.SELECT_TYPE2),
                Enter.theValue(meetingType).into(RegisterMeeting.SELECT_TYPE3),
                Click.on(RegisterMeeting.SAVE),

                Enter.theValue(startDate).into(RegisterMeeting.START_DATE),
                Click.on(RegisterMeeting.START_TIME),
                Enter.theValue(endDate).into(RegisterMeeting.END_DATE),
                Click.on(RegisterMeeting.END_TIME),

                Click.on(RegisterMeeting.SELECT_LOCATION1),
                Enter.theValue(location).into(RegisterMeeting.SELECT_LOCATION2),
                Click.on(RegisterMeeting.SELECT_LOCATION3),
                Enter.theValue(location).into(RegisterMeeting.INPUT_LOCATION),
                Click.on(RegisterMeeting.SAVE_LOCATION),


                Click.on(RegisterMeeting.SELECT_UNIT1),
                Enter.theValue(unit).into(RegisterMeeting.SELECT_UNIT2),

                //location
                Click.on(RegisterMeeting.SELECT_ORGANIZED1),
                Enter.theValue(organized).into(RegisterMeeting.SELECT_ORGANIZED2),
                Click.on(RegisterMeeting.SELECT_ORGANIZED3),

                Click.on(RegisterMeeting.FORM_TITLE),
                Enter.theValue("oneTitle").into(RegisterMeeting.FORM_TITLE),
                Click.on(RegisterMeeting.FORM_NAME),
                Enter.theValue("ensayo").into(RegisterMeeting.FORM_NAME),
                Click.on(RegisterMeeting.FORM_LASTN),
                Enter.theValue("masensayo").into(RegisterMeeting.FORM_LASTN),
                Click.on(RegisterMeeting.FORM_EMAIL),
                Enter.theValue("test@corre.com").into(RegisterMeeting.FORM_EMAIL),
                Click.on(RegisterMeeting.FORM_SAVE),


                //reporter
                Click.on(RegisterMeeting.SELECT_REPORTER1),
                Enter.theValue(reporter).into(RegisterMeeting.SELECT_REPORTER2),
                Click.on(RegisterMeeting.SELECT_REPORTER3),

                Click.on(RegisterMeeting.FORM_TITLE),
                Enter.theValue("oneTitle").into(RegisterMeeting.FORM_TITLE),
                Click.on(RegisterMeeting.FORM_NAME),
                Enter.theValue("ensayo").into(RegisterMeeting.FORM_NAME),
                Click.on(RegisterMeeting.FORM_LASTN),
                Enter.theValue("masensayo").into(RegisterMeeting.FORM_LASTN),
                Click.on(RegisterMeeting.FORM_EMAIL),
                Enter.theValue("test@corre.com").into(RegisterMeeting.FORM_EMAIL),
                Click.on(RegisterMeeting.FORM_SAVE),

                //ATTENDEE
                Click.on(RegisterMeeting.SELECT_ATTENDEE1),
                Enter.theValue(reporter).into(RegisterMeeting.SELECT_ATTENDEE2),
                Click.on(RegisterMeeting.SELECT_ATTENDEE3),

                Click.on(RegisterMeeting.FORM_TITLE),
                Enter.theValue("oneTitle").into(RegisterMeeting.FORM_TITLE),
                Click.on(RegisterMeeting.FORM_NAME),
                Enter.theValue("ensayo").into(RegisterMeeting.FORM_NAME),
                Click.on(RegisterMeeting.FORM_LASTN),
                Enter.theValue("masensayo").into(RegisterMeeting.FORM_LASTN),
                Click.on(RegisterMeeting.FORM_EMAIL),
                Enter.theValue("test@corre.com").into(RegisterMeeting.FORM_EMAIL),
                Click.on(RegisterMeeting.FORM_SAVE)
        );

    }
}
