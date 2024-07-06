package Core;

import org.openqa.selenium.By;

public class Locators {

    public static By destinationSearchField = By.xpath("//div[@class='c2c15e496d']");
    public static By searchDestination = By.xpath("//input[@class='a263b5b5e8']");
    public static By setSearchDestination (String destination){
        String destinationLocator = "//div[@class='d2827c16ec']//div[text()='*****']";
    return By.xpath(destinationLocator.replace("*****", destination));}

    public static By checkInCheckOutDateField = By.xpath("//div[@class='baca574774']");
    //public static By
}
