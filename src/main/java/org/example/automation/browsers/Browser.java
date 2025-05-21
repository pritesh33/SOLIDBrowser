package org.example.automation.browsers;
import org.openqa.selenium.WebDriver;

// 1. Interface for Browser
// === D: Dependency Inversion Principle (DIP) ===
// High-level modules (tests) depend on this abstraction, not concrete drivers.

public interface Browser {
    WebDriver createDriver();
}
