package testcases;

import org.testng.annotations.Test;
import pages.P01_LandingPage;
import pages.P02_RegistrationPage;

import static util.Utility.generateRandomInt;

public class TC01_Register extends TestBase{
    //Declaration
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    int day = generateRandomInt(28);
    int month = generateRandomInt(12);
    int year = generateRandomInt(20);
    static String email = faker.internet().emailAddress();
    String companyName = "Test Company";
    String password = "Test@1234";
    String confirmPassword = "Test@1234";
    //Test Cases
    @Test(priority = 1, description = "Register new user with Valid Data")
    public void registerNewUserWithValidData_P() throws InterruptedException {
        //email = faker.internet().emailAddress();
        //Test Scenario
        new P01_LandingPage(driver).clickRegisterTab();
        new P02_RegistrationPage(driver).chooseGender().enterFirstName(firstName).enterLastName(lastName).selectDay(day).selectMonth(month).selectYear(year).enterEmail(email).enterCompanyName(companyName).enterPassword(password).enterConfirmPassword(confirmPassword).clickRegisterBtn();
        Thread.sleep(3000);
    }
}
