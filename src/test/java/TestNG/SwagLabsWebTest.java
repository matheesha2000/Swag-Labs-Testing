package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class SwagLabsWebTest {

    //Global Variable Section

    String BaseURL = "https://www.saucedemo.com/";
    WebDriver driver;
    String actualText;
    String expectedText;
    Boolean status;

    @BeforeTest
    public void BeforeTestMethod() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

















    //Supportive methods
    public void userLogin() throws InterruptedException {

        driver.get(BaseURL);
        Thread.sleep(3000);

        //Identify the Username text and send value
        driver.findElement(By.name("username")).sendKeys("standard_user");
        Thread.sleep(1000);

        //Identify the Password txt and send value
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        Thread.sleep(1000);

        //Clicked the login button
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        Thread.sleep(3000);
    }



}
