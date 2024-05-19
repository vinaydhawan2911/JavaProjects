package maventest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VirginAtlanticLaunchPageTest {
    private WebDriver driver;

    @Before
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
        Assert.assertTrue("Book button not found", bookButton.isDisplayed());

        // Verify the presence of the "Manage" button
        WebElement manageButton = driver.findElement(By.xpath("//a[contains(@href, '/manage')]"));
        Assert.assertTrue("Manage button not found", manageButton.isDisplayed());

        // Verify the presence of the "Fly" button
        WebElement flyButton = driver.findElement(By.xpath("//a[contains(@href, '/fly')]"));
        Assert.assertTrue("Fly button not found", flyButton.isDisplayed());
    }

    @After
    public void teardown() {
        // Close the browser
        driver.quit();
    }
}
