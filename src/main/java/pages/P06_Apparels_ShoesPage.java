package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static util.Utility.generateRandomInt;
import static util.Utility.generateRandomInt2;

public class P06_Apparels_ShoesPage {
    //1- Define the Driver
    WebDriver driver;
    //2- Define the Constructor and initialize the driver
    public P06_Apparels_ShoesPage (WebDriver driver){
        this.driver = driver;
    }
    //3- Define the locators
    private final By grey = By.xpath("//html/body/div[6]/div[3]/div/div[2]/div/div/div[2]/ul/li[2]/input");
    private final By red = By.xpath("//html/body/div[6]/div[3]/div/div[2]/div/div/div[2]/ul/li[3]/input");
    private final By blue = By.xpath("//html/body/div[6]/div[3]/div/div[2]/div/div/div[2]/ul/li[4]/input");
    private final By addToCartBtn = By.xpath("//div[@class=\"item-grid\"]/div[1]/div/div[2]/div[3]/div[2]/button[@class=\"button-2 product-box-add-to-cart-button\"]");
    //4- Define Action Methods
    public P06_Apparels_ShoesPage filterByColor(){
        driver.findElement(By.xpath("//html/body/div[6]/div[3]/div/div[2]/div/div/div[2]/ul/li["+generateRandomInt2(3)+"]/input")).click();
        return this;
    }
    public P06_Apparels_ShoesPage addShoesToCart(){
        //driver.findElement(By.xpath("//div[@class=\"item-grid\"]/div["+generateRandomInt(3)+"]/div/div[2]/div[3]/div[2]/button[@class=\"button-2 product-box-add-to-cart-button\"]")).click();
        driver.findElement(this.addToCartBtn).click();
        return this;
    }
}
