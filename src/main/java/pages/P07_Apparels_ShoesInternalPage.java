package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class P07_Apparels_ShoesInternalPage {
    //1- Define the Driver
    WebDriver driver;
    //2- Define the Constructor and initialize the driver
    public P07_Apparels_ShoesInternalPage (WebDriver driver){
        this.driver = driver;
    }
    //3- Define the locators
    private final By size = By.xpath("//select[@id=\"product_attribute_9\"]");
    private final By color = By.xpath("//label/span[@title=\"Red\"]");
    private final By addToCartBtn = By.id("add-to-cart-button-25");
    //4- Define Action Methods
    public P07_Apparels_ShoesInternalPage selectSize(int index){
        Select size= new Select(driver.findElement(this.size));
        size.selectByIndex(index);
        return this;
    }
    public P07_Apparels_ShoesInternalPage selectColor(){
        driver.findElement(this.color).click();
        return this;
    }
    public P07_Apparels_ShoesInternalPage clickAddToCartBtn(){
        driver.findElement(this.addToCartBtn).click();
        return this;
    }
}
