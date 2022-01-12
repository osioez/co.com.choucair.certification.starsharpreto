package co.com.choucair.certification.starsharpreto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterMeeting extends PageObject {

    public static final Target BUTTON_MEETING = Target.the("click on meeting menu")
            .located(By.xpath("//li//i[@class='s-sidebar-icon fa fa-comments premium-feature']"));
    public static final Target BUTTON_AGENDA = Target.the("click on meetings")
            .located(By.xpath("//*[@id='nav_menu1_3_2']/li[1]/a/span"));
    public static final Target BUTTON_NEW_MEETING = Target.the("click on create new meeting")
            .located(By.xpath("//div[@class='tool-buttons']//div[@class='tool-button add-button icon-tool-button']"));
    public static final Target INPUT_NAME = Target.the("Name of meeting")
            .located(By.xpath("//*[@id='Serenity_Pro_Meeting_MeetingDialog10_MeetingName']"));
    public static final Target INPUT_NUMBER = Target.the("Enter number of meeting")
            .located(By.xpath("//*[@id='Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber']"));

    //Meeting Type
    public static final Target SELECT_TYPE0 = Target.the("Select1 type of meeting")
            .located(By.xpath("//*[@id='s2id_Serenity_Pro_Meeting_MeetingDialog10_MeetingTypeId']/a"));
    public static final Target SELECT_TYPE1 = Target.the("Select2 type of meeting")
            .located(By.xpath("//*[@id='s2id_autogen6_search']"));
    public static final Target SELECT_TYPE2 = Target.the("Select3 type of meeting")
            .located(By.xpath("//div[.='*** No results. Click to define a new one ***']"));
    public static final Target SELECT_TYPE3 = Target.the("Select4 type of meeting")
            .located(By.xpath("/html/body/div[7]/div[2]/div/div[2]/form/div/div[1]/div/div/div/input"));
    public static final Target SAVE = Target.the("save new meeting type")
            .located(By.xpath("/html/body/div[7]/div[2]/div/div[1]/div/div/div/div[1]/div/span"));


   //Fecha
    public static  final Target START_DATE = Target.the("Enter to date to start")
           .located(By.xpath("//*[@id='Serenity_Pro_Meeting_MeetingDialog10_StartDate']"));
    public static  final Target END_DATE = Target.the("Enter to date to end")
            .located(By.xpath("//*[@id='Serenity_Pro_Meeting_MeetingDialog10_EndDate']"));
    //Hora
    public static  final Target START_TIME = Target.the("Enter to time to start")
            .located(By.xpath("//select//option[@value='10:30']"));
    public static  final Target END_TIME = Target.the("Enter to time to start")
            .located(By.xpath("//select//option[@value='11:45']"));

    //Location
    public static final Target SELECT_LOCATION1= Target.the("Select to location")
            .located(By.xpath("//*[@id='s2id_Serenity_Pro_Meeting_MeetingDialog10_LocationId']"));
    public static final Target SELECT_LOCATION2= Target.the("Select to location")
            .located(By.xpath("//*[@id='s2id_autogen7_search']"));
    public static final Target SELECT_LOCATION3= Target.the("Select to location")
            .located(By.xpath("//div[.='*** No results. Click to define a new one ***']"));
    public static final Target INPUT_LOCATION = Target.the("Input new location")
            .located(By.xpath("/html/body/div[8]/div[2]/div/div[2]/form/div/div[1]/div/div/div[1]/input"));
        public static final Target SAVE_LOCATION = Target.the("save the location")
            .located(By.xpath("/html/body/div[8]/div[2]/div/div[1]/div/div/div/div[1]/div/span/i"));

    //Select Unit
    public static final Target SELECT_UNIT1= Target.the("Select the unit")
            .located(By.xpath("//*[@id='s2id_Serenity_Pro_Meeting_MeetingDialog10_UnitId']"));
    public static final Target SELECT_UNIT2= Target.the("Select the unit")
            .located(By.xpath("//*[@id='s2id_autogen8_search']"));

    //Seleccion Organized
    public static final Target SELECT_ORGANIZED1 = Target.the("select to organized")
            .located(By.xpath("//*[@id='s2id_Serenity_Pro_Meeting_MeetingDialog10_OrganizerContactId']"));
    public static final Target SELECT_ORGANIZED2 = Target.the("select to organized")
            .located(By.xpath("//*[@id='s2id_autogen9_search']"));
    public static final Target SELECT_ORGANIZED3 = Target.the("select to organized")
            .located(By.xpath("/html/body/div[8]/ul/li/div"));

    //subformulario organized
    public static final Target FORM_TITLE = Target.the("select to organized")
            .located(By.xpath("//div[@class='categories']//input[@name='Title']"));
    public static final Target FORM_NAME = Target.the("select to organized")
            .located(By.xpath("//div[@class='categories']//input[@name='FirstName']"));
    public static final Target FORM_LASTN = Target.the("select to organized")
            .located(By.xpath("//div[@class='categories']//input[@name='LastName']"));
    public static final Target FORM_EMAIL= Target.the("select to organized")
            .located(By.xpath("//div[@class='categories']//input[@name='Email']"));
    public static final Target FORM_SAVE = Target.the("saved")
            .located(By.xpath("//div[@class='s-DialogContent']/div/div/div/div/div/div/span[contains (text(), ' Save')]"));

    //Reporte
    public static final Target SELECT_REPORTER1= Target.the("Select to reporter1")
            .located(By.xpath("//*[@id='s2id_Serenity_Pro_Meeting_MeetingDialog10_ReporterContactId']"));
        public static final Target SELECT_REPORTER2= Target.the("Select to reporter2")
            .located(By.xpath("//*[@id='s2id_autogen10_search']"));
    public static final Target SELECT_REPORTER3 = Target.the("select to reporter3")
            .located(By.xpath("//div[.='*** No results. Click to define a new one ***']"));

    //Attendee List
    public static final Target SELECT_ATTENDEE1= Target.the("Select to attendee1")
            .located(By.xpath("//div[@id='s2id_autogen11']/a/span[@id='select2-chosen-12']"));
    public static final Target SELECT_ATTENDEE2= Target.the("Select to attendee2")
            .located(By.xpath("//*[@id='s2id_autogen12_search']"));
    public static final Target SELECT_ATTENDEE3 = Target.the("select to attendee3")
            .located(By.xpath("//div[.='*** No results. Click to define a new one ***']"));





}
