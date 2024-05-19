package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FlightSearchTest {
    private WebDriver driver;

    // Test data variables
    private static final String DEPARTURE_AIRPORT = "London Heathrow";
    private static final String ARRIVAL_AIRPORT = "New Delhi";
    private static final String TRIP_TYPE = "One-way";

    @BeforeClass
    public void setup() {
        // Set the path to the ChromeDriver executable
        //System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testSearchFlight() {
        // Navigate to the Virgin Atlantic website
        driver.get("https://www.stg.virginatlantic.com/");

        // Click the "Book" button
        WebElement bookButton = driver.findElement(By.xpath("//a[contains(@href, '/book')]"));
        bookButton.click();

        // Select the trip type
        WebElement tripTypeDropdown = driver.findElement(By.id("trip-type"));
        tripTypeDropdown.click();
        WebElement tripTypeOption = driver.findElement(By.xpath(String.format("//option[text()='%s']", TRIP_TYPE)));
        tripTypeOption.click();

        // Enter the departure airport
        WebElement departureAirportField = driver.findElement(By.id("departure-airport"));
        departureAirportField.sendKeys(DEPARTURE_AIRPORT);
        WebElement departureAirportOption = driver.findElement(By.xpath(String.format("//li[contains(text(), '%s')]", DEPARTURE_AIRPORT)));
        departureAirportOption.click();

        // Enter the arrival airport
        WebElement arrivalAirportField = driver.findElement(By.id("arrival-airport"));
        arrivalAirportField.sendKeys(ARRIVAL_AIRPORT);
        WebElement arrivalAirportOption = driver.findElement(By.xpath(String.format("//li[contains(text(), '%s')]", ARRIVAL_AIRPORT)));
        arrivalAirportOption.click();

        // Click the "Search" button
        WebElement searchButton = driver.findElement(By.xpath("//button[contains(text(), 'Search')]"));
        searchButton.click();

        // Wait for the search results page to load
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement searchResultsHeader = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(), 'Search results')]")));
        Assert.assertTrue(searchResultsHeader.isDisplayed(), "Search results page did not load");
    }

    @AfterClass
    public void teardown() {
        // Close the browser
        driver.quit();
    }
}