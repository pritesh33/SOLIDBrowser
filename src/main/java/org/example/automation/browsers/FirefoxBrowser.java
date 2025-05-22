package org.example.automation.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

// 2. Implementations for Each Browser with Options and Capabilities
// === S: Single Responsibility Principle (SRP) ===
// Each class (like ChromeBrowser, FirefoxBrowser) is responsible only for creating that specific browser instance

public class FirefoxBrowser implements Browser {
    public WebDriver createDriver() {
        FirefoxOptions options = new FirefoxOptions();
        options.addPreference("dom.webnotifications.enabled", false);
        return new FirefoxDriver(options);
    }
}

