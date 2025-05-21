package org.example.automation.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

// 5. Sample Test Class
// === L: Liskov Substitution Principle (LSP) ===
// We use the WebDriver interface only, so all concrete drivers can be swapped without breaking tests.

public class LoginTest extends BaseTest {

    @Test
    public void verifyLoginPageTitle() {
        driver.get("https://www.google.com/");
        String title = driver.getTitle();
        Assert.assertEquals(title, "Google", "Login page title mismatch");
    }
}

