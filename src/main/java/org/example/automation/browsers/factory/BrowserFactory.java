package org.example.automation.browsers.factory;

import org.example.automation.browsers.*;
import org.openqa.selenium.WebDriver;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// 3. Browser Factory
// === O: Open/Closed Principle (OCP) ===
// Easily add support for new browsers without modifying other parts of the code.

public class BrowserFactory {
    private static final Map<String, Browser> browsers = new ConcurrentHashMap<>();

        // Register browsers
        public static void registerBrowser(String browserName, Browser browser) {
            browsers.put(browserName.toLowerCase(), browser);
        }

        public static WebDriver getDriver(String browserName) {
            Browser browser = browsers.get(browserName.toLowerCase());
            if (browser == null) {
                throw new IllegalArgumentException("Unsupported browser: " + browserName);
            }
            return browser.createDriver();
        }
    }
