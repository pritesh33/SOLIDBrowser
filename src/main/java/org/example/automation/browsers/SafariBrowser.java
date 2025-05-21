package org.example.automation.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariBrowser implements Browser {
    public WebDriver createDriver() {
        return new SafariDriver(); // Safari has limited support for capabilities
    }
}

