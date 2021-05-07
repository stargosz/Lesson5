package Selenium.Tests;

import Selenium.TestBase.TestBase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class test extends TestBase {

    @ParameterizedTest
    @DisplayName("Test verifies if page title matches with expected")
    @ValueSource(strings = {"https://www.google.com/"})
    public void shouldOpenGoogleWebsite(String url) {
        getDriver().get("https://www.google.com/");
        assertEquals(getDriver().getCurrentUrl(), url);
    }

    @ParameterizedTest
    @DisplayName("Test verifies if page title matches with expected - FAIL ")
    @ValueSource(strings = {"https://stackoverflow.com/"})
    public void shouldOpenGoogleWebsiteAndFail(String url) {
        getDriver().get("https://www.google.com ");
        assertEquals(getDriver().getCurrentUrl(), url);
    }
}
