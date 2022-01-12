package co.com.choucair.certification.starsharpreto.tasks;

import co.com.choucair.certification.starsharpreto.userinterface.CredentialPage;
import co.com.choucair.certification.starsharpreto.userinterface.RegisterUnitBusiness;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Creating implements Task {
    private  String nameUnit;

    public Creating(String nameUnit) {
        this.nameUnit = nameUnit;
    }

    public static Creating newUnitBusiness(String nameUnit) {
        return Tasks.instrumented(Creating.class,nameUnit );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RegisterUnitBusiness.BUTTON_ORGANIZATION),
                Click.on(RegisterUnitBusiness.BUTTON_BUSINESS_UNIT),
                Click.on(RegisterUnitBusiness.OPTION_NEW_BUSINESS_UNIT),
                Enter.theValue(nameUnit).into(RegisterUnitBusiness.INPUT_BUSINESS_UNIT),
                Click.on(RegisterUnitBusiness.BUTTON_SAVE)
        );
    }
}
