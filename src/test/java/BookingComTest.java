import PageMethods.HomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BookingComTest extends HomePage {

public static final String DESTINATION = "Barcelona";
public static final String MONTH = "Next";
public static final int START_DATE = 1;
public static final int END_DATE = 10;

@BeforeEach
    public void setup(){
    createDriver();
    getDriver().navigate().to("https://www.booking.com/");}

@Test
    public void test() {
    HomePage test = new HomePage();
    test.clickOnDestinationSearchField().selectDestination(DESTINATION).
         clickOnCheckInOutDate().selectCheckInOutMonth(MONTH).
         selectCheckInDate(START_DATE).selectCheckOutDate(END_DATE);

}

//@AfterEach
//    public void close(){quitDriver();}

}
