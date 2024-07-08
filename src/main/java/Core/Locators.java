package Core;

import org.openqa.selenium.By;

public class Locators {

    public static By destinationSearchField = By.xpath("//div[@class='c2c15e496d']");
    public static By searchDestination = By.xpath("//input[@class='a263b5b5e8']");
    public static By setSearchDestination (String destination){
        String destinationLocator = "//div[@class='d2827c16ec']//div[text()='*****']";
    return By.xpath(destinationLocator.replace("*****", destination));}

    public static By checkInCheckOutDateField = By.xpath("//div[@class='baca574774']");
    public static By checkInCheckOutNextMonth = By.xpath("//button[@class='bf33709ee1 a190bb5f27 dc0e35d124 a746857c37 bb5314095f b81c794d25 f0298d74a8 b4b12cd658 b97282b23a']");
    public static By checkInCheckOutPreviousMonth = By.xpath("//button[@class='bf33709ee1 a190bb5f27 dc0e35d124 a746857c37 bb5314095f b81c794d25 f0298d74a8 b4b12cd658 b8ee07418a']");
    public static By setCheckInCheckOutDate (String checkInCheckOutDate){
        String checkInCheckOutLocator = "(//span[@class='b7df311f35 aa9efce434']//span[text()='30'])[*****]";
    return  By.xpath(checkInCheckOutLocator.replace("*****", checkInCheckOutDate));}
}
