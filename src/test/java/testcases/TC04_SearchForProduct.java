package testcases;

import org.testng.annotations.Test;
import pages.P01_LandingPage;
import pages.P03_LoginPage;
import pages.P05_HomePage;
//import static testcases.TC01_Register.email;

public class TC04_SearchForProduct extends TestBase {
    //Declaration
    String password = "Test@1234";
    String email = "test@mail.com";
    String searchKeyword = "Laptop";
    //Test Cases
    @Test(priority = 1, description = "Search for product with matching results")
    public void searchProduct_P() throws InterruptedException {
        new P01_LandingPage(driver).clickLoginTab();
        new P03_LoginPage(driver).enterEmail(email).enterPassword(password).clickRememberMe().clickLoginBtn();
        new P05_HomePage(driver).enterSearchKeyword(searchKeyword).clickSearchBtn();
        Thread.sleep(3000);
    }
}
