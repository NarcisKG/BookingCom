package Core;

import org.openqa.selenium.By;

public class Locators {
    //HomePage
    public static By destinationSearchField = By.xpath("//div[@data-testid='destination-container']");
    public static By signInInfo = By.xpath("//button[@aria-label='Dismiss sign-in info.']");
    public static By searchDestination = By.xpath("//input[@name='ss']");
    public static By setSearchDestination (String destination){
        String destinationLocator = "//div[@data-testid='autocomplete-result']//div[text()='*****']";
        return By.xpath(destinationLocator.replace("*****", destination));}

    public static By checkInCheckOutDateField = By.xpath("//div[@data-testid='searchbox-dates-container']");
    public static By setCheckInCheckOutMonth (String checkInCheckOutMonth){
        String checkInCheckOutMotnhLoc = "//button[@aria-label='***** month']";
        return By.xpath(checkInCheckOutMotnhLoc.replace("*****",checkInCheckOutMonth));}
    public static By checkInCheckOutNextMonth = By.xpath("//button[@aria-label='Next month']");
    public static By checkInCheckOutPreviousMonth = By.xpath("//button[@aria-label='Previous month']");
    public static By setCheckInDate (String checkInDate){
        String checkInLocator = "//span[@aria-label='***** 2024']";
        return  By.xpath(checkInLocator.replace("*****", checkInDate));}
    public static By setCheckOutDate (String checkOutDate){
        String checkOutLocator = "//span[@aria-label='***** 2024']";
        return  By.xpath(checkOutLocator.replace("*****", checkOutDate));}

    public static By occupancyConfig = By.xpath ("//div[@class='dc5a65e435']");
    public static By occupancyConfigAdultMinus1 = By.xpath("(//span[@class='c3d4b5d161'])[1]");
    public static By occupancyConfigAdultPlus1 = By.xpath("(//span[@class='c3d4b5d161'])[2]");
    public static By occupancyConfigChildMinus1 = By.xpath("(//span[@class='c3d4b5d161'])[3]");
    public static By occupancyConfigChildPlus1 = By.xpath("(//span[@class='c3d4b5d161'])[4]");
    public static By occupancyConfigRoomMinus1 = By.xpath("(//span[@class='c3d4b5d161'])[5]");
    public static By occupancyConfigRoomPlus1 = By.xpath("(//span[@class='c3d4b5d161'])[6]");

    public static By searchButton = By.xpath("//span[text()='Search']");
    //SearchResultPage
    public static By filterItemPropertyType = By.xpath("(//div[@data-filters-item='ht_id:ht_id=204'])[1]");
    public static By filterItemFacilities = By.xpath("(//div[@data-filters-item='hotelfacility:hotelfacility=2'])[1]");
    public static By filterItemMeals = By.xpath("(//div[@data-filters-item='mealplan:mealplan=1'])[1]");
    public static By filterItemPropertyRatings = By.xpath("(//div[@data-filters-item='class:class=4'])[1]");
    public static By sortType = By.xpath("//button[@data-testid='sorters-dropdown-trigger']");
    public static By setSortType (String sortType){
        String sortTypeLocator = "//button[@data-id='*****']";
    return By.xpath(sortTypeLocator.replace("*****",sortType));}


}
