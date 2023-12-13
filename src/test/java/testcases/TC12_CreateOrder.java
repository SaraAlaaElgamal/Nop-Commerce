package testcases;


import com.github.javafaker.CreditCardType;
import org.testng.annotations.Test;
import pages.*;

import static util.Utility.generateRandomInt;
import static util.Utility.generateRandomInt2;

//import static testcases.TC01_Register.email;
public class TC12_CreateOrder extends TestBase{
    //Declaration
    String password = "Test@1234";
    String email = "test@mail.com";
    int index1 = generateRandomInt2(3);
    int index2 = generateRandomInt(20);
    String city = faker.address().cityName();
    String address1 = faker.address().fullAddress();
    String address2 = faker.address().secondaryAddress();
    String zipCode = faker.number().digits(5);
    String phoneNumber = faker.phoneNumber().cellPhone();;
    int creditCardType = 1;
    String creditCardHolderName = faker.name().fullName();
    String creditCardNumber = faker.finance().creditCard(CreditCardType.VISA);
    int month = generateRandomInt(12);
    int year = generateRandomInt(7);
    //String cardHolderName = creditCard;
    //Test Cases
    @Test(priority = 1, description = "Create Order")
    public void createOrder_P() throws InterruptedException {
        new P01_LandingPage(driver).clickLoginTab();
        new P03_LoginPage(driver).enterEmail(email).enterPassword(password).clickRememberMe().clickLoginBtn();
        new P05_HomePage(driver).hoverOnApparels().selectShoesTag();
        new P06_Apparels_ShoesPage(driver).addShoesToCart();
        new P07_Apparels_ShoesInternalPage(driver).selectSize(index1);
        Thread.sleep(3000);
        new P07_Apparels_ShoesInternalPage(driver).selectColor().clickAddToCartBtn();
        Thread.sleep(8000);
        new P05_HomePage(driver).clickShoppingCart();
        new P10_ShoppingCartPage(driver).clickAgreeTermsAndConditions().clickCheckOutBtn();
        new P11_BillingAddressPage(driver).selectCountry(index2).enterCity(city).enterAddress1(address1).enterAddress2(address2).enterZipCode(zipCode).enterPhoneNumber(phoneNumber).clickContinueBtn();
        new P13_ShippingMethodPage(driver).clickContinueBtn();
        new P14_PaymentMethodPage(driver).selectCreditCard().clickContinueBtn();
        new P15_PaymentInformationPage(driver).selectCreditCardType(creditCardType).enterCardHolderName(creditCardHolderName).enterCardNumber(creditCardNumber).selectExpirationMonth(month).selectExpirationYear(year).enterCardCode("156").clickContinueBtn();
        new P16_ConfirmOrder(driver).clickContinueBtn();
        Thread.sleep(3000);
    }

}
