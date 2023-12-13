package testcases;

import org.testng.annotations.Test;
import pages.*;

//import static testcases.TC01_Register.email;

public class TC10_AddProductToWishList extends TestBase{
    //Declaration
    String password = "Test@1234";
    String email = "test@mail.com";
    //Test Cases
    @Test(priority = 1, description = "Add Product To Wish List")
    public void addProductToWishList_P() throws InterruptedException {
        new P01_LandingPage(driver).clickLoginTab();
        new P03_LoginPage(driver).enterEmail(email).enterPassword(password).clickRememberMe().clickLoginBtn();
        new P05_HomePage(driver).hoverAndClickOnBooks();
        new P08_BooksPage(driver).clickAddToWishList();
        Thread.sleep(3000);
    }
}
