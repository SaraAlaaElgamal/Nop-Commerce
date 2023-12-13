package testcases;


import org.testng.annotations.Test;
import pages.P01_LandingPage;
import pages.P03_LoginPage;
import pages.P05_HomePage;
import pages.P06_Apparels_ShoesPage;

//import static testcases.TC01_Register.email;
public class TC07_FilterWithColor extends TestBase{
    //Declaration
    String password = "Test@1234";
    String email = "test@mail.com";
    //Test Cases
    @Test(priority = 1, description = "Filter With Color")
    public void filterWithColor_P() throws InterruptedException {
        new P01_LandingPage(driver).clickLoginTab();
        new P03_LoginPage(driver).enterEmail(email).enterPassword(password).clickRememberMe().clickLoginBtn();
        new P05_HomePage(driver).hoverOnApparels().selectShoesTag();
        new P06_Apparels_ShoesPage(driver).filterByColor();
        Thread.sleep(3000);
    }

}
