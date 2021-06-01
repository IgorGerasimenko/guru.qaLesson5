package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class RegFormPage {

    private SelenideElement firstNameBar = $("#firstName");
    private SelenideElement lastNameBar = $("#lastName");
    private SelenideElement emailBar = $("#userEmail");
    private SelenideElement subjectBar = $("#subjectsInput");
    private SelenideElement adressBar = $("#currentAddress");
    private SelenideElement phoneNumberBar = $("#userNumber");

    private SelenideElement radioButtonGenderOther = $("[for='gender-radio-3']");
    private SelenideElement hobbiesCheckBoxMusic = $("[for='hobbies-checkbox-3']");

    private SelenideElement selectStateList = $("#react-select-3-input");
    private SelenideElement selectSityList = $("#react-select-4-input");

    private SelenideElement submitButton = $("#submit");


    public void open() {
        Selenide.open("https://demoqa.com/automation-practice-form");
    }

    public void typeFirstName(String value) {
        firstNameBar.val(value);
    }

    public void typeLastName(String value) {
        lastNameBar.val(value);
    }

    public void typeEmail(String value) {
        emailBar.val(value);
    }

    public void typePhoneNumber(String value) {
        phoneNumberBar.val(value);
    }

    public void typeSubject(String value) {
        subjectBar.val(value).pressEnter();
    }

    public void typeAddres(String value) {
        adressBar.val(value);
    }

    public void chechGenderOther() {
        radioButtonGenderOther.click();
    }

    public void chechMusicHobby() {
        hobbiesCheckBoxMusic.click();
    }

    public void typeStateList(String value) {
        selectStateList.setValue(value).pressEnter();
    }

    public void typeSityList(String value) {
        selectSityList.setValue(value).pressEnter();
    }

    public void submitForm() {
        submitButton.click();
    }

}
