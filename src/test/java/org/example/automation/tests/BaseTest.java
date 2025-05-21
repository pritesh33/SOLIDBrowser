package org.example.automation.tests;

import org.example.automation.browsers.factory.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

// 4. Base Test Class
// === D: Dependency Inversion Principle (DIP) ===
// Depends on abstraction (Browser interface) rather than concrete WebDriver types.
// Also adheres to SRP — setup/teardown only, not test logic.

public class BaseTest {
    protected WebDriver driver;

    @Parameters("browser")
    @BeforeTest
    public void setUp(@Optional("chrome") String browser) {
        driver = BrowserFactory.getDriver(browser);
        driver.manage().deleteAllCookies();
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) driver.quit();
    }
}

