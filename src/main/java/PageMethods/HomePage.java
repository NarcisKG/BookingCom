package PageMethods;

import Core.BasePage;
import Core.Locators;

public class HomePage extends BasePage {

    public HomePage clickOnDestinationSearchField(){
        moveToElement(Locators.destinationSearchField);
        return this;}
    public HomePage selectDestination (String selDestination){
        typeText(selDestination, Locators.searchDestination);
        clickOnElement(Locators.setSearchDestination(selDestination));
        return this;}

    public HomePage clickOnCheckInOutDate(){
        clickOnElement(Locators.checkInCheckOutDateField);
        return this;}
    public HomePage selectCheckInOutMonth (String selectMonth){
        moveToElement(Locators.setCheckInCheckOutMonth(selectMonth));
        clickOnElement(Locators.setCheckInCheckOutMonth(selectMonth));
        return this;}
    public HomePage selectCheckInDate (int checkInDate){
        clickOnElement(Locators.setCheckInDate(Integer.toString(checkInDate)));
        return this;}
    public HomePage selectCheckOutDate (int checkOutDate){
        clickOnElement(Locators.setCheckOutDate(Integer.toString(checkOutDate)));
        return this;}
}
