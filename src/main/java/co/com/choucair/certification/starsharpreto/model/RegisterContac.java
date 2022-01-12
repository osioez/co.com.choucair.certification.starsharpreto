package co.com.choucair.certification.starsharpreto.model;

public class RegisterContac {
    private  String title;
    private  String firstName;
    private  String lastName;
    private  String Email;

    public RegisterContac(String title, String firstName, String lastName, String email) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        Email = email;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
