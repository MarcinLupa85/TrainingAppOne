import config.TestBase;
import operations.NavbarOperations;
import org.junit.jupiter.api.Test;
import org.testng.annotations.BeforeMethod;

public class FootballTests extends TestBase {
    private NavbarOperations navbarOperations;

    @BeforeMethod
    private void initOperations(){
        navbarOperations = new NavbarOperations(driver);
    }

    @Test
    public void premierLeagueTest(){
        navbarOperations.goToPremierLeague();
        navbarOperations.checkPremierLeague();
    }
}
