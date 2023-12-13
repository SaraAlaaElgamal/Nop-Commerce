package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static util.Utility.generateRandomInt;

public class P09_JewelryPage {
    //1- Define the Driver
    WebDriver driver;
    //2- Define the Constructor and initialize the driver
    public P09_JewelryPage (WebDriver driver){
        this.driver = driver;
    }
    //3- Define the locators
    private final By addToCompareListBtn = By.xpath("//div[@class=\"item-grid\"]/div[1]/div/div[2]/div[3]/div[2]/button[@class=\"button-2 add-to-compare-list-button\"]");
    //4- Define Action Methods
    public P09_JewelryPage clickAddToCompareList(){
        driver.findElement(By.xpath("//div[@class=\"item-grid\"]/div["+generateRandomInt(3)+"]/div/div[2]/div[3]/div[2]/button[@class=\"button-2 add-to-compare-list-button\"]")).click();
        //driver.findElement(this.addToCompareListBtn).click();
        return this;
    }
}
