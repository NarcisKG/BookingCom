package PageMethods;

import Core.BasePage;
import Core.Locators;

public class SearchResultPage extends BasePage {

    public SearchResultPage selectFilters(){
        clickOnElement(Locators.filterItemPropertyType);
        clickOnElement(Locators.filterItemFacilities);
        clickOnElement(Locators.filterItemPropertyRatings);
        clickOnElement(Locators.filterItemMeals);
    return new SearchResultPage();}
    public SearchResultPage selectSortType (String selSortType){
        clickOnElement(Locators.sortType);
        clickOnElement(Locators.setSortType(selSortType));
    return new SearchResultPage();}
}
