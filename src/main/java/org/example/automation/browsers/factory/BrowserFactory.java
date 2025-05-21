package org.example.automation.browsers.factory;

import org.example.automation.browsers.*;
import org.openqa.selenium.WebDriver;

// 3. Browser Factory
// === O: Open/Closed Principle (OCP) ===
// Easily add support for new browsers without modifying other parts of the code.

public class BrowserFactory {
    public static WebDriver getDriver(String browserName) {
        Browser browser;
        switch (browserName.toLowerCase()) {
            case "chrome":
                browser = new ChromeBrowser(); break;
            case "firefox":
                browser = new FirefoxBrowser(); break;
            case "edge":
                browser = new EdgeBrowser(); break;
            case "safari":
                browser = new SafariBrowser(); break;
            default:
                throw new IllegalArgumentException("Unsupported browser: " + browserName);
        }
        return browser.createDriver();
    }
}
