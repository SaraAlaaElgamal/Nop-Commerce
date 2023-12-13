package testcases;

import org.testng.annotations.Test;
import pages.P01_LandingPage;
import pages.P03_LoginPage;
import pages.P05_HomePage;

public class TC05_SwitchCurrencies extends TestBase {
    //Declaration
    String password = "Test@1234";
    String email = "test@mail.com";
    String searchKeyword = "Laptop";

    //Test Cases
    @Test(priority = 1, description = "Switch Currency")
    public void switchCurrency_P() throws InterruptedException {
        new P01_LandingPage(driver).clickLoginTab();
        new P03_LoginPage(driver).enterEmail(email).enterPassword(password).clickRememberMe().clickLoginBtn();
        new P05_HomePage(driver).switchCurrency();
    }
}