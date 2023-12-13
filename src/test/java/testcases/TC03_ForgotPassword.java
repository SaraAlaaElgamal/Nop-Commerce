package testcases;
import org.testng.annotations.Test;
import pages.P01_LandingPage;
import pages.P03_LoginPage;
import pages.P04_ForgotPasswordPage;

//import static testcases.TC01_Register.email;

public class TC03_ForgotPassword extends TestBase{
    //Declarations
    String email = "test@gmail.com";
    //Test Cases
    @Test(priority = 1, description = "Forgot Password")
    public void forgotPassword_P() throws InterruptedException {
        //ToDo: Define Pages

        new P01_LandingPage(driver).clickLoginTab();
        new P03_LoginPage(driver).clickForgotPassword();
        new P04_ForgotPasswordPage(driver).enterEmail(email).clickRecoverBtn();
        Thread.sleep(2000);
    }
}
