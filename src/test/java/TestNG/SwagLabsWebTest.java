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

    /*--------------------Test Case Section-----------------------------*/

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

        System.out.println("----------------------------------------------------------------------------------------\n");

        Thread.sleep(3000);



    }


    //Test Case - Product details Test (TC: 002)
    @Test(priority = 2)
    public void productDetails() throws InterruptedException {

        System.out.println("================================= Test 002 ============================================\n");
        System.out.println("PRODUCT DETAILS TEST CASE\n");

        //------------------------------ Product 1: Sauce Labs Backpack ----------------------------------//

        //--------------Check Product 01 Details----------------//
        System.out.println("Verify the Product 01 details\n");

        //Clicked the card product title
        driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).click();

        //Check Product 01 title
        System.out.println("Product 01 Title Test");

        actualText = "Sauce Labs Backpack";
        expectedText = driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]")).getText();

        //Print actual text
        System.out.println("Test Case 002 Product 01 Title Actual Text:"+ actualText);

        if (expectedText.equals(actualText)) {
            System.out.println("Product 01 Title Test Passed\n");
        }else {
            System.out.println("Product 01 Title Test Failed\n");
        }

        Thread.sleep(2000);


        //Check Product 01 Description
        System.out.println("Product 01 Description Test");

        actualText = "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.";
        expectedText = driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[2]")).getText();

        //Print actual text
        System.out.println("Test Case 002 Product 02 Description Actual Text:"+ actualText);

        if (expectedText.equals(actualText)) {
            System.out.println("Product 01 Description Test Passed\n");
        }else {
            System.out.println("Product 01 Description Test Failed\n");
        }

        Thread.sleep(2000);


        //Check Product 01 Price
        System.out.println("Product 01 Price Test");

        actualText = "$29.99";
        expectedText = driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[3]")).getText();

        //Print actual text
        System.out.println("Test Case 002 Product 01 Price Actual Text:"+ actualText);

        if (expectedText.equals(actualText)) {
            System.out.println("Product 01 Price Test Passed\n");
        }else {
            System.out.println("Product 01 Price Test Failed\n");
        }

        Thread.sleep(2000);


        //Click back to products button
        driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();

        Thread.sleep(2000);




        //------------------------------ Product 2: Sauce Labs Bike Light ----------------------------------//

        //--------------Check Product 02 Details----------------//
        System.out.println("Verify the Product 02 details\n");

        //Clicked the card product title
        driver.findElement(By.xpath("//*[@id=\"item_0_title_link\"]/div")).click();

        //Check Product 02 title
        System.out.println("Product 02 Title Test");

        actualText = "Sauce Labs Bike Light";
        expectedText = driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]")).getText();

        //Print actual text
        System.out.println("Test Case 002 Product 02 Title Actual Text:"+ actualText);

        if (expectedText.equals(actualText)) {
            System.out.println("Product 02 Title Test Passed\n");
        }else {
            System.out.println("Product 02 Title Test Failed\n");
        }

        Thread.sleep(2000);


        //Check Product 01 Description
        System.out.println("Product 02 Description Test");

        actualText = "A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included.";
        expectedText = driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[2]")).getText();

        //Print actual text
        System.out.println("Test Case 002 Product 02 Description Actual Text:"+ actualText);

        if (expectedText.equals(actualText)) {
            System.out.println("Product 02 Description Test Passed\n");
        }else {
            System.out.println("Product 02 Description Test Failed\n");
        }

        Thread.sleep(2000);


        //Check Product 01 Price
        System.out.println("Product 02 Price Test");

        actualText = "$9.99";
        expectedText = driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[3]")).getText();

        //Print actual text
        System.out.println("Test Case 002 Product 01 Price Actual Text:"+ actualText);

        if (expectedText.equals(actualText)) {
            System.out.println("Product 02 Price Test Passed\n");
        }else {
            System.out.println("Product 02 Price Test Failed\n");
        }

        Thread.sleep(2000);


        //Click back to products button
        driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();

        Thread.sleep(2000);







    }


















    //Supportive methods

    /*----------------- login user supportive method ------------------------*/
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

//    /*------------------ add to card button supportive method -----------------------*/
//    public void addToCardButtonClick() throws InterruptedException {
//
//        //Click add to card button
//        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
//
//        Thread.sleep(2000);
//    }










}
