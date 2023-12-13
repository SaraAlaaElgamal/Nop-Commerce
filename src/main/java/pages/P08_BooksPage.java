package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static util.Utility.generateRandomInt;
import static util.Utility.generateRandomInt2;

public class P08_BooksPage {
    //1- Define the Driver
    WebDriver driver;
    //2- Define the Constructor and initialize the driver
    public P08_BooksPage (WebDriver driver){
        this.driver = driver;
    }
    //3- Define the locators
    private final By addToWishListBtn = By.xpath("//div[@class=\"item-grid\"]/div[1]/div/div[2]/div[3]/div[2]/button[@class=\"button-2 add-to-wishlist-button\"]");
    //4- Define Action Methods
    public P08_BooksPage clickAddToWishList(){
        driver.findElement(By.xpath("//div[@class=\"item-grid\"]/div["+generateRandomInt(3)+"]/div/div[2]/div[3]/div[2]/button[@class=\"button-2 add-to-wishlist-button\"]")).click();
        //driver.findElement(this.addToWishListBtn).click();
        return this;
    }
}
