package testcases;

import org.testng.annotations.Test;
import pages.*;

import static util.Utility.generateRandomInt2;

//import static testcases.TC01_Register.email;
public class TC09_AddProductToShoppingCart extends TestBase{
    //Declaration
    String password = "Test@1234";
    String email = "test@mail.com";
    int index = generateRandomInt2(4);
    //Test Cases
    @Test(priority = 1, description = "Add Product To Shopping Cart")
    public void addProductToShoppingCard_P() throws InterruptedException {
        new P01_LandingPage(driver).clickLoginTab();
        new P03_LoginPage(driver).enterEmail(email).enterPassword(password).clickRememberMe().clickLoginBtn();
        new P05_HomePage(driver).hoverOnApparels().selectShoesTag();
        new P06_Apparels_ShoesPage(driver).addShoesToCart();
        new P07_Apparels_ShoesInternalPage(driver).selectSize(index).selectColor().clickAddToCartBtn();
        Thread.sleep(3000);
    }
}
