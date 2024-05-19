package maventest.Pages;
import org.openqa.selenium.chrome.ChromeDriver;
public class VirginMainPage {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://stg.virginatlantic.com/");
        Thread.sleep(2000);
        System.out.println("Virgin Atlantic Airways Main Page");
    }   
}