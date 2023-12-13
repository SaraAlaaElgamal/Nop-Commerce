package testcases;

import org.testng.annotations.Test;
import pages.P01_LandingPage;
import pages.P03_LoginPage;

import static testcases.TC01_Register.email;

public class TC02_Login extends TestBase{
    //Declaration
    String password = "Test@1234";
//    String email = "test@mail.com";
    //Test Cases
    @Test(priority = 1, description = "Login with Valid Data")
    public void loginWithValidData_P() throws InterruptedException {
        // registration
        // login
         new P01_LandingPage(driver).clickLoginTab();
         new P03_LoginPage(driver).enterEmail(email).enterPassword(password).clickRememberMe().clickLoginBtn();
        Thread.sleep(3000);
    }
    @Test(priority = 2, description = "Login with Valid Email and Invalid Password")
    public void loginWithValidEmail_N() throws InterruptedException {
        password = "56788uhg";
        new P01_LandingPage(driver).clickLoginTab();
        new P03_LoginPage(driver).enterEmail(email).enterPassword(password).clickRememberMe().clickLoginBtn();
        Thread.sleep(3000);
    }
    @Test(priority = 3, description = "Login with Invalid Email and Valid Password")
    public void loginWithValidPassword_N() throws InterruptedException {
        email = "wrong@mail.com";
        password = "Test@1234";
        new P01_LandingPage(driver).clickLoginTab();
        new P03_LoginPage(driver).enterEmail(email).enterPassword(password).clickRememberMe().clickLoginBtn();
        Thread.sleep(3000);
    }

    @Test(priority = 1, description = "Login with Invalid Data")
    public void loginWithInvalidData_N() throws InterruptedException {
        email = "wrong@mail.com";
        password = "56788uhg";
        new P01_LandingPage(driver).clickLoginTab();
        new P03_LoginPage(driver).enterEmail(email).enterPassword(password).clickRememberMe().clickLoginBtn();
        Thread.sleep(3000);
    }
}
