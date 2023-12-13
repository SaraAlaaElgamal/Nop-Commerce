package testcases;

import org.testng.annotations.Test;
import pages.P01_LandingPage;
import pages.P03_LoginPage;
import pages.P05_HomePage;
//import static testcases.TC01_Register.email;

public class TC06_SelectCategory extends TestBase{
    //Declaration
    String password = "Test@1234";
    String email = "test@mail.com";
    //Test Cases
    @Test(priority = 1, description = "Select Random Category")
    public void selectCategory_P() throws InterruptedException {
        new P01_LandingPage(driver).clickLoginTab();
        new P03_LoginPage(driver).enterEmail(email).enterPassword(password).clickRememberMe().clickLoginBtn();
        new P05_HomePage(driver).hoverOnRandomCategory();
        Thread.sleep(3000);
    }
}
