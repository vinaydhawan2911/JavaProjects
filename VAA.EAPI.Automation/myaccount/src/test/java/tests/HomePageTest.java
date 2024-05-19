package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomePageTest {

    private WebDriver driver;

    @BeforeClass
    public void setup() {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\chrome-win64\\chrome.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testLaunchPage() {
        // Navigate to the Virgin Atlantic website
        driver.get("http://www.stg.virginatlantic.com");

        // Verify the page title
        String expectedTitle = "Virgin Atlantic";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Unexpected page title");

        // Verify the presence of the "Book" button
        WebElement bookButton = driver.findElement(By.xpath("//a[contains(@href, '/book')]"));
        Assert.assertTrue(bookButton.isDisplayed(), "Book button not found");

        // Verify the presence of the "Manage" button
        WebElement manageButton = driver.findElement(By.xpath("//a[contains(@href, '/manage')]"));
        Assert.assertTrue(manageButton.isDisplayed(),"Manage button not found");

        // Verify the presence of the "Fly" button
        WebElement flyButton = driver.findElement(By.xpath("//a[contains(@href, '/fly')]"));
        Assert.assertTrue(flyButton.isDisplayed(),"Fly button not found");
    }

    @AfterClass
    public void teardown() {
        // Close the browser
        driver.quit();
    }
}