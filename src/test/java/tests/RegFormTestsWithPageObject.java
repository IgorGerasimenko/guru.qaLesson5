package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.CalandarForm;
import pages.RegFormPage;
import pages.SubmitedFormPage;

public class RegFormTestsWithPageObject {

    RegFormPage regFormPage = new RegFormPage();
    CalandarForm calandarForm = new CalandarForm();
    SubmitedFormPage submitedFormPage = new SubmitedFormPage();

    String firstName = "Igor";
    String lastName = "Gerasimenko";
    String email = "1@1.ru";
    String phoneNumber = "9271234567";
    String adress = "ulitsa Pushkina, dom Kolotushkina";
    String state = "Haryana";
    String sity = "Karnal";
    String gender = "Other";
    String subject1 = "english";
    String subject2 = "math";
    String hobby = "Music";

    String dayOfBirth = "24".toString();
    String monthOfBirth = "June".toString();
    String yearOfBirth = "2010".toString();

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }


    @Test
    void succesfullSubmitFormTest() {
        regFormPage.open();

        regFormPage.typeFirstName(firstName);
        regFormPage.typeLastName(lastName);
        regFormPage.typeEmail(email);
        regFormPage.chechGenderOther();
        regFormPage.typePhoneNumber(phoneNumber);

        calandarForm.setDate(dayOfBirth, monthOfBirth, yearOfBirth);

        regFormPage.typeSubject("english");
        regFormPage.typeSubject("math");
        regFormPage.chechMusicHobby();
        regFormPage.typeAddres(adress);
        regFormPage.typeStateList(state);
        regFormPage.typeSityList(sity);
        regFormPage.submitForm();

        submitedFormPage.assertTitle();
        submitedFormPage.assertStudentName(firstName, lastName);
        submitedFormPage.assertEmail(email);
        submitedFormPage.assertGender(gender);
        submitedFormPage.assertPhoneNumber(phoneNumber);
        submitedFormPage.assertDateOfBirth(dayOfBirth, monthOfBirth, yearOfBirth);
        submitedFormPage.assertSubject(subject1, subject2);
        submitedFormPage.assertHobbies(hobby);
        submitedFormPage.assertAdress(adress);
        submitedFormPage.assertStateAndSity(state, sity);

    }

}


