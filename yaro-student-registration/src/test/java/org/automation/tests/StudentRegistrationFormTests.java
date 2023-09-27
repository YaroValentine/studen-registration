package org.automation.tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

//import static com.codeborne.selenide.Selenide.open;

public class StudentRegistrationFormTests {

    @Test
    void canOpenStudentRegistrationFormsTest() {

        Selenide.open("https://demoqa.com/automation-practice-form");

    }
}
