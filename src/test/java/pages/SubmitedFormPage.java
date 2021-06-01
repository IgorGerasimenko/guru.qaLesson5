package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class SubmitedFormPage {

    public SelenideElement title = $("#example-modal-sizes-title-lg");
    public SelenideElement studentName = $x("//td[text()='Student Name']").parent();
    public SelenideElement studentEmail = $x("//td[text()='Student Email']").parent();
    public SelenideElement gender = $x("//td[text()='Gender']").parent();
    public SelenideElement phoneNumber = $x("//td[text()='Mobile']").parent();
    public SelenideElement dateOfBirth = $x("//td[text()='Date of Birth']").parent();
    public SelenideElement subject = $x("//td[text()='Subjects']").parent();
    public SelenideElement hobbies = $x("//td[text()='Hobbies']").parent();
    public SelenideElement studentAdress = $x("//td[text()='Address']").parent();
    public SelenideElement stateAndSity = $x("//td[text()='State and City']").parent();

    public void assertTitle() {
        title.shouldHave(text("Thanks for submitting the form"));
    }

    public void assertStudentName(String firstName, String lastName) {
        studentName.shouldHave(text(firstName + " " + lastName));
    }

    public void assertEmail(String email) {
        studentEmail.shouldHave(text(email));
    }

    public void assertGender(String gender1) {
        gender.shouldHave(text(gender1));
    }

    public void assertPhoneNumber(String phoneNbr) {
        phoneNumber.shouldHave(text(phoneNbr));
    }

    public void assertDateOfBirth(String dayOfBirth, String monthOfBirth, String yearOfBirth) {
        dateOfBirth.shouldHave(text(dayOfBirth + " " + monthOfBirth + "," + yearOfBirth));
    }

    public void assertSubject(String subject1, String subject2) {
        subject.shouldHave(text(subject1 + "," + " " + subject2));
    }

    public void assertHobbies(String hobby) {
        hobbies.shouldHave(text(hobby));
    }

    public void assertAdress(String adress) {
        studentAdress.shouldHave(text(adress));
    }

    public void assertStateAndSity(String state, String sity) {
        stateAndSity.shouldHave(text(state + " " + sity));
    }

}
