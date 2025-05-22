package org.example.automation.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

// 2. Implementations for Each Browser with Options and Capabilities
// === S: Single Responsibility Principle (SRP) ===
// Each class (like ChromeBrowser, FirefoxBrowser) is responsible only for creating that specific browser instance

public class EdgeBrowser implements Browser {
    public WebDriver createDriver() {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--start-maximized");
        return new EdgeDriver(options);
    }
}

