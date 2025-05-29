package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SwagLabsWebTest {

    //Global Variable Section

    String BaseURL = "https://www.saucedemo.com/";
    WebDriver driver;
    String actualText;
    String expectedText;
    Boolean status;

    //Before Test Section
    @BeforeTest
    public void BeforeTestMethod() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    //Test Case Section

    //Test Case : 001
    @Test(priority = 1)
    public void loadProductPage() throws InterruptedException {

        System.out.print("\n----------------------|| Swag_Labs_Test || -----------------------------------------\n\n");
        System.out.println("================================= Test 001============================================\n");
        System.out.println("LOAD PRODUCT PAGE TEST CASE\n");

        //Login to the website
        userLogin();

        //Verify the correct page
        expectedText = "Products";
        actualText = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();

        //print actual text
        System.out.println("Test Case 001 Actual Text:"+ actualText);

        if (expectedText.equals(actualText)) {

            System.out.println("TC 001: PASS");
            System.out.println("Login Success, Load the Product Page\n");
        }
        else {
            System.out.println("TC 001: FAIL");
            System.out.println("Login Failure, Can't Load the Product Page\n");
        }

        System.out.println("----------------------------------------------------------------------------------------");

        Thread.sleep(5000);

    }



















    //Supportive methods
    public void userLogin() throws InterruptedException {

        driver.get(BaseURL);
        Thread.sleep(3000);

        //Identify the Username text and send value
        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        Thread.sleep(1000);

        //Identify the Password txt and send value
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        Thread.sleep(1000);

        //Clicked the login button
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        Thread.sleep(3000);
    }



}
