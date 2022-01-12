package co.com.choucair.certification.starsharpreto.tasks;

import co.com.choucair.certification.starsharpreto.model.RegisterCredentialDate;
import co.com.choucair.certification.starsharpreto.userinterface.CredentialPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {

    private  String strUser;
    private  String strPass;

    public Login(String strUser, String strPass) {
        this.strUser = strUser;
        this.strPass = strPass;
    }

    public static Login yourCredential(String strUser, String strPass) {
        return Tasks.instrumented(Login.class, strUser, strPass);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strUser).into(CredentialPage.INPUT_USERNAME),
                Enter.theValue(strPass).into(CredentialPage.INPUT_PASSWORD),
                Click.on(CredentialPage.BUTTON_LOGIN)
        );
    }
}
