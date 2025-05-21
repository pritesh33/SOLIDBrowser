package org.example.automation.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

// 2. Implementations for Each Browser with Options and Capabilities
// === S: Single Responsibility Principle (SRP) ===
// Each class (like ChromeBrowser, FirefoxBrowser) is responsible only for creating that specific browser instance

public class ChromeBrowser implements Browser {
    public WebDriver createDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--start-maximized");
        return new ChromeDriver(options);
    }
}

