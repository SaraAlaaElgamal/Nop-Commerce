package testcases;


import org.testng.annotations.Test;
import pages.P01_LandingPage;
import pages.P03_LoginPage;
import pages.P05_HomePage;

//import static testcases.TC01_Register.email;
public class TC08_SelectDifferentTags extends TestBase{
    //Declaration
    String password = "Test@1234";
    String email = "test@mail.com";
    //Test Cases
    @Test(priority = 1, description = "Select Random Tag")
    public void selectTag_P() throws InterruptedException {
        new P01_LandingPage(driver).clickLoginTab();
        new P03_LoginPage(driver).enterEmail(email).enterPassword(password).clickRememberMe().clickLoginBtn();
        new P05_HomePage(driver).hoverOnComputers().selectComputersRandomTag();
        Thread.sleep(3000);
    }
}
