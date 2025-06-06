package org.example.automation.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

// 2. Implementations for Each Browser with Options and Capabilities
// === S: Single Responsibility Principle (SRP) ===
// Each class (like ChromeBrowser, FirefoxBrowser) is responsible only for creating that specific browser instance

public class SafariBrowser implements Browser {
    public WebDriver createDriver() {
        return new SafariDriver(); // Safari has limited support for capabilities
    }
}

