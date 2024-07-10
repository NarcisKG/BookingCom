package Core;

import org.openqa.selenium.By;

public class Locators {

    public static By destinationSearchField = By.xpath("//div[@class='c2c15e496d']");
    public static By searchDestination = By.xpath("//input[@name='ss']");
    public static By setSearchDestination (String destination){
        String destinationLocator = "//div[@class='d2827c16ec']//div[text()='*****']";
        return By.xpath(destinationLocator.replace("*****", destination));}

    public static By checkInCheckOutDateField = By.xpath("//div[@class='baca574774']");
    public static By setCheckInCheckOutMonth (String checkInCheckOutMonth){
        String checkInCheckOutMotnhLoc = "//button[@aria-label='***** month']";
        return By.xpath(checkInCheckOutMotnhLoc.replace("*****",checkInCheckOutMonth));}
    public static By checkInCheckOutPreviousMonth = By.xpath("//button[@aria-label='Previous month']");
    public static By setCheckInDate (String checkInDate){
        String checkInLocator = "(//span[@class='b7df311f35 aa9efce434']//span[text()='*****'])[1]";
        return  By.xpath(checkInLocator.replace("*****", checkInDate));}
    public static By setCheckOutDate (String checkOutDate){
        String checkOutLocator = "(//span[@class='b7df311f35 aa9efce434']//span[text()='*****'])[2]";
        return  By.xpath(checkOutLocator.replace("*****", checkOutDate));}

    public static By occupancyConfig = By.xpath ("//div[@class='dc5a65e435']");
    public static By occupancyConfigAdultMinus1 = By.xpath("(//span[@class='c3d4b5d161'])[1]");
    public static By occupancyConfigAdultPlus1 = By.xpath("(//span[@class='c3d4b5d161'])[2]");
    public static By occupancyConfigChildMinus1 = By.xpath("(//span[@class='c3d4b5d161'])[3]");
    public static By occupancyConfigChildPlus1 = By.xpath("(//span[@class='c3d4b5d161'])[4]");
    public static By occupancyConfigRoomMinus1 = By.xpath("(//span[@class='c3d4b5d161'])[5]");
    public static By occupancyConfigRoomPlus1 = By.xpath("(//span[@class='c3d4b5d161'])[6]");

    public static By searchButton = By.xpath("//span[text()='Search']");
}
