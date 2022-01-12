package co.com.choucair.certification.starsharpreto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CredentialPage extends PageObject {

    public static final Target INPUT_USERNAME = Target.the("Insert the username")
            .located(By.xpath("//input[@id='StartSharp_Membership_LoginPanel0_Username']"));

    public static final Target INPUT_PASSWORD = Target.the("Insert the password")
            .located(By.xpath("//input[@id='StartSharp_Membership_LoginPanel0_Password']"));

    public static final Target BUTTON_LOGIN = Target.the("press the button")
            .located(By.xpath("//button[@id='StartSharp_Membership_LoginPanel0_LoginButton']"));
}
