package co.com.choucair.certification.starsharpreto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterUnitBusiness extends PageObject {

    public static  final  Target BUTTON_ORGANIZATION = Target.the("menu button to select organization")
            .located(By.xpath("//div//ul//li//i[@class='s-sidebar-icon fa fa-sitemap premium-feature']"));


    public static  final  Target BUTTON_BUSINESS_UNIT = Target.the("menu button to create business units")
            .located(By.xpath("//div//div//ul//li//a//i[@class='s-sidebar-icon fa fa-sitemap']"));

    public static final Target OPTION_NEW_BUSINESS_UNIT = Target.the("new selection")
            .located(By.xpath("//div[@class='buttons-outer']//i[@class='fa fa-plus-circle text-green']"));

    public static final Target INPUT_BUSINESS_UNIT = Target.the("enter unit name")
            .located(By.xpath("//div//div//form//input[@name='Name']"));

    public static final Target BUTTON_SAVE = Target.the("press to save")
            .located(By.xpath("//div[@class='s-TemplatedDialog ui-dialog-content ui-widget-content']//div[@class='tool-buttons']//i[@class= 'fa fa-floppy-o text-purple']"));

}
