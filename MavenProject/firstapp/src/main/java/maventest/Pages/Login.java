package maventest.Pages;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");
        Thread.sleep(2000);
        System.out.println("Login");


    }

    
}
