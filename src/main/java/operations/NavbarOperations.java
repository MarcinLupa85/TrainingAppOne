package operations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pageobjects.NavbarPageObject;

import static org.assertj.core.api.Assertions.assertThat;

public class NavbarOperations {
    private NavbarPageObject navbarPageObject;
    private WebDriver driver;

    public NavbarOperations(WebDriver driver) {
        this.driver = driver;
    }

    public void goToPremierLeague() {
        Actions action = new Actions(driver);
        action.moveToElement(navbarPageObject.getFootballNavbarElement()).perform();
        navbarPageObject.getPremierLeagueLink().click();
    }

    public void checkPremierLeague() {
        assertThat(driver.getCurrentUrl()).contains("/news/football/premier-league/");
        assertThat(navbarPageObject.getPremierLeagueTitle().isDisplayed());
    }
}
