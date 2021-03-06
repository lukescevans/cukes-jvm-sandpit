package step_defs;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

/**
 * Created by lukescevans on 25/11/15.
 */
public class Hooks extends BasePage {

    @Before
    public void setup() {
        System.out.println("*BEFORE hook initialised");
    }

    @After
    public void tearDown() {
        System.out.println("*AFTER hook initialised");
        if (driver != null) {
            driver.close();
        }
    }
}
