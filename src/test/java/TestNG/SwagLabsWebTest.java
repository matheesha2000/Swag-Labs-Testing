package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        System.out.println("Test Case 001 Actual Text: "+ actualText);

        if (expectedText.equals(actualText)) {

            System.out.println("TC 001: PASS");
            System.out.println("Login Success, Load the Product Page\n");
        }
        else {
            System.out.println("TC 001: FAIL");
            System.out.println("Login Failure, Can't Load the Product Page\n");
        }

        System.out.println("----------------------------------------------------------------------------------------\n");

        Thread.sleep(2000);



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

        expectedText = "Sauce Labs Backpack";
        actualText = driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]")).getText();

        //Print actual text
        System.out.println("Test Case 002 Product 01 Title Actual Text: " + actualText);

        if (expectedText.equals(actualText)) {
            System.out.println("Product 01 Title Test Passed\n");
        } else {
            System.out.println("Product 01 Title Test Failed\n");
        }



        //Check Product 01 Description
        System.out.println("Product 01 Description Test");

        expectedText = "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.";
        actualText = driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[2]")).getText();

        //Print actual text
        System.out.println("Test Case 002 Product 02 Description Actual Text: " + actualText);

        if (expectedText.equals(actualText)) {
            System.out.println("Product 01 Description Test Passed\n");
        } else {
            System.out.println("Product 01 Description Test Failed\n");
        }



        //Check Product 01 Price
        System.out.println("Product 01 Price Test");

        expectedText = "$29.99";
        actualText = driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[3]")).getText();

        //Print actual text
        System.out.println("Test Case 002 Product 01 Price Actual Text: " + actualText);

        if (expectedText.equals(actualText)) {
            System.out.println("Product 01 Price Test Passed\n");
        } else {
            System.out.println("Product 01 Price Test Failed\n");
        }

        Thread.sleep(2000);


        //Click back to products button
        driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();

        Thread.sleep(2000);

        System.out.println("------------------------------------------------\n");


        //------------------------------ Product 2: Sauce Labs Bike Light ----------------------------------//

        //--------------Check Product 02 Details----------------//
        System.out.println("Verify the Product 02 details\n");

        //Clicked the card product title
        driver.findElement(By.xpath("//*[@id=\"item_0_title_link\"]/div")).click();

        //Check Product 02 title
        System.out.println("Product 02 Title Test");

        expectedText = "Sauce Labs Bike Light";
        actualText = driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]")).getText();

        //Print actual text
        System.out.println("Test Case 002 Product 02 Title Actual Text: " + actualText);

        if (expectedText.equals(actualText)) {
            System.out.println("Product 02 Title Test Passed\n");
        } else {
            System.out.println("Product 02 Title Test Failed\n");
        }



        //Check Product 02 Description
        System.out.println("Product 02 Description Test");

        expectedText = "A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included.";
        actualText = driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[2]")).getText();

        //Print actual text
        System.out.println("Test Case 002 Product 02 Description Actual Text: " + actualText);

        if (expectedText.equals(actualText)) {
            System.out.println("Product 02 Description Test Passed\n");
        } else {
            System.out.println("Product 02 Description Test Failed\n");
        }



        //Check Product 02 Price
        System.out.println("Product 02 Price Test");

        expectedText = "$9.99";
        actualText = driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[3]")).getText();

        //Print actual text
        System.out.println("Test Case 002 Product 02 Price Actual Text:" + actualText);

        if (expectedText.equals(actualText)) {
            System.out.println("Product 02 Price Test Passed\n");
        } else {
            System.out.println("Product 02 Price Test Failed\n");
        }
        Thread.sleep(2000);


        //Click back to products button
        driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();

        Thread.sleep(2000);

        System.out.println("------------------------------------------------\n");


        //------------------------------ Product 3: Sauce Labs Bolt T-Shirt ----------------------------------//

        //--------------Check Product 03 Details----------------//
        System.out.println("Verify the Product 03 details\n");

        //Clicked the card product title
        driver.findElement(By.xpath("//*[@id=\"item_1_title_link\"]/div")).click();

        //Check Product 02 title
        System.out.println("Product 03 Title Test");

        expectedText = "Sauce Labs Bolt T-Shirt";
        actualText = driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]")).getText();

        //Print actual text
        System.out.println("Test Case 002 Product 03 Title Actual Text: " + actualText);

        if (expectedText.equals(actualText)) {
            System.out.println("Product 03 Title Test Passed\n");
        } else {
            System.out.println("Product 03 Title Test Failed\n");
        }



        //Check Product 03 Description
        System.out.println("Product 03 Description Test");

        expectedText = "Get your testing superhero on with the Sauce Labs bolt T-shirt. From American Apparel, 100% ringspun combed cotton, heather gray with red bolt.";
        actualText = driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[2]")).getText();

        //Print actual text
        System.out.println("Test Case 002 Product 03 Description Actual Text: " + actualText);

        if (expectedText.equals(actualText)) {
            System.out.println("Product 03 Description Test Passed\n");
        } else {
            System.out.println("Product 03 Description Test Failed\n");
        }



        //Check Product 03 Price
        System.out.println("Product 03 Price Test");

        expectedText = "$15.99";
        actualText = driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[3]")).getText();

        //Print actual text
        System.out.println("Test Case 002 Product 03 Price Actual Text: " + actualText);

        if (expectedText.equals(actualText)) {
            System.out.println("Product 03 Price Test Passed\n");
        } else {
            System.out.println("Product 03 Price Test Failed\n");
        }

        Thread.sleep(2000);


        //Click back to products button
        driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();


        System.out.println("----------------------------------------------------------------------------------------\n");

        Thread.sleep(2000);


    }


    //Test Case - Add To Cart Button Test (TC: 003)
  @Test(priority = 3)
  public void addToCartButton() throws InterruptedException {

      System.out.println("================================= Test 003 ============================================\n");
      System.out.println("ADD TO CART BUTTON TEST CASE\n");

      //------------------------------ Product 1: Sauce Labs Backpack-------------------------------

      System.out.println("Verify the Product 01 : Sauce Labs Backpack ");

      //click the Product 1 add to cart button
      driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();

      expectedText = "1";
      actualText = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).getText();

      //Print actual text
      System.out.println("Test Case 003 Product 01 Add to Cart Button Actual Text: " + actualText);

      if (expectedText.equals(actualText)) {
          System.out.println("Passed: The Product 01 Successfully added to the Cart\n");
      } else {
          System.out.println("Failed: The Product 01 Can't added to the Cart\n");
      }

      Thread.sleep(2000);

      //Click the Remove Button to Remove the add product 01
      driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]")).click();

      Thread.sleep(2000);

      System.out.println("------------------------------------------------\n");



      //------------------------------ Product 2: Sauce Labs Bike Light-------------------------------

      System.out.println("Verify the Product 02 : Sauce Labs Bike Light ");

      //click the Product 2 add to cart button
      driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();

      expectedText = "1";
      actualText = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).getText();

      //Print actual text
      System.out.println("Test Case 003 Product 02 Add to Cart Button Actual Text: " + actualText);

      if (expectedText.equals(actualText)) {
          System.out.println("Passed: The Product 02 Successfully added to the Cart\n");
      } else {
          System.out.println("Failed: The Product 02 Can't added to the Cart\n");
      }

      Thread.sleep(2000);

      //Click the Remove Button to Remove the add product 02
      driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-bike-light\"]")).click();

      Thread.sleep(2000);

      System.out.println("------------------------------------------------\n");



      //------------------------------ Product 3: Sauce Labs Bolt T-Shirt-------------------------------

      System.out.println("Verify the Product 03 : Sauce Labs Bolt T-Shirt ");

      //click the Product 3 add to cart button
      driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();

      expectedText = "1";
      actualText = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).getText();

      //Print actual text
      System.out.println("Test Case 003 Product 03 Add to Cart Button Actual Text: " + actualText);

      if (expectedText.equals(actualText)) {
          System.out.println("Passed: The Product 03 Successfully added to the Cart\n");
      } else {
          System.out.println("Failed: The Product 03 Can't added to the Cart\n");
      }

      Thread.sleep(2000);

      //Click the Remove Button to Remove the add product 03
      driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-bolt-t-shirt\"]")).click();

      Thread.sleep(2000);

      System.out.println("----------------------------------------------------------------------------------------\n");

      Thread.sleep(3000);
  }

    //Test Case - Multiple Add To Cart Buttons Test (TC: 004)
  @Test(priority = 4)
  public void multipleAddToCartButtons() throws InterruptedException {

      System.out.println("================================= Test 004 ============================================\n");
      System.out.println("MULTIPLE ADD TO CART BUTTONS TEST CASE\n");

      System.out.println("Verify the Multiple Add To Cart Buttons");

      //click product 1 add to cart button
      driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
      Thread.sleep(1000);

      //click product 2 add to cart button
      driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
      Thread.sleep(1000);

      //click product 3 add to cart button
      driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
      Thread.sleep(1000);



      expectedText = "3";
      actualText = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).getText();

      //Print actual text
      System.out.println("Test Case 004 Multiple Add to Cart Buttons Actual Text: " + actualText);

      if (expectedText.equals(actualText)) {
          System.out.println("Passed: Multiple Products Successfully added to the Cart\n");
      } else {
          System.out.println("Failed: Multiple Products UnSuccessfully added to the Cart\n");
      }

      Thread.sleep(2000);

      //Click the Remove Button to Remove the add product 03
      driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-bolt-t-shirt\"]")).click();

      //Click the Remove Button to Remove the add product 02
      driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-bike-light\"]")).click();

      //Click the Remove Button to Remove the add product 01
      driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]")).click();

      System.out.println("----------------------------------------------------------------------------------------\n");

      Thread.sleep(3000);

  }


    //Test Case - Sorting Dropdown Test (TC: 005)
  @Test(priority = 5)
  public void sortingDropDown() throws InterruptedException {

      System.out.println("================================= Test 005 ============================================\n");
      System.out.println("SORTING DROPDOWN TEST CASE\n");

      //------------------------- Shorting Dropdown 1 : (A - Z) ----------------------------//


      System.out.println("Verify the (A - Z) Sorting Drop Down ");

      //select the (A - Z) dropdown shortlist
      driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[1]")).click();

      expectedText = "Name (A to Z)";
      actualText = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[1]")).getText();

      System.out.println("Test Case 005 Sorting Drop Down 1 Actual Text: " + actualText);

      if (expectedText.equals(actualText)) {
          System.out.println("Passed: Products are correctly Sorted (A - Z) order");
      } else {
          System.out.println("Failed: Products are not Sorted (A - Z) order");
      }

      Thread.sleep(2000);

      System.out.println("------------------------------------------------\n");


      //------------------------- Shorting Dropdown 2 : (Z - A) ----------------------------//


      System.out.println("Verify the (Z -A) Sorting Drop Down ");

      //select the (Z - A) dropdown shortlist
      driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[2]")).click();

      expectedText = "Name (Z to A)";
      actualText = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[2]")).getText();

      System.out.println("Test Case 005 Sorting Drop Down 2 Actual Text: " + actualText);

      if (expectedText.equals(actualText)) {
          System.out.println("Passed: Products are correctly Sorted (Z - A) order");
      } else {
          System.out.println("Failed: Products are not Sorted (Z - A) order");
      }

      Thread.sleep(2000);


      System.out.println("------------------------------------------------\n");



      //------------------------- Shorting Dropdown 3 : (low - high) ----------------------------//



      System.out.println("Verify the (low - high) Sorting Drop Down ");

      //select the (low - high) dropdown shortlist
      driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]")).click();

      expectedText = "Price (low to high)";
      actualText = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]")).getText();

      System.out.println("Test Case 005 Sorting Drop Down 3 Actual Text: " + actualText);

      if (expectedText.equals(actualText)) {
          System.out.println("Passed: Products are correctly Sorted (low - high) order");
      } else {
          System.out.println("Failed: Products are not Sorted (low - high) order");
      }

      Thread.sleep(2000);


      System.out.println("------------------------------------------------\n");



      //------------------------- Shorting Dropdown 4 : (high - low) ----------------------------//


      System.out.println("Verify the (high - low) Sorting Drop Down ");

      //select the (high - low) dropdown shortlist
      driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[4]")).click();

      expectedText = "Price (high to low)";
      actualText = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[4]")).getText();

      System.out.println("Test Case 005 Sorting Drop Down 4 Actual Text: " + actualText);

      if (expectedText.equals(actualText)) {
          System.out.println("Passed: Products are correctly Sorted (high - low) order");
      } else {
          System.out.println("Failed: Products are not Sorted (high - low) order");
      }

      Thread.sleep(2000);

      //select the (A - Z) dropdown shortlist
      driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[1]")).click();

      System.out.println("----------------------------------------------------------------------------------------\n");

  }


    //Test Case - Navigate To Cart Page (TC: 006)
  @Test(priority = 6)
  public void navigateToCart() throws InterruptedException {

      System.out.println("================================= Test 006 ============================================\n");
      System.out.println("NAVIGATE TO CART PAGE TEST CASE\n");

      //click add to cart button product 1
      driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();

      //click add to cart button product 2
      driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();

      //click cart navigate icon
      driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();

      //verify the cart page
      expectedText = "Your Cart";
      actualText = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();

      //Print actual text
      System.out.println("Test Case 006 Navigate to Cart Page Actual Text: " + actualText);

      if (expectedText.equals(actualText)) {
          System.out.println("TC006: PASS");
          System.out.println("Successfully Navigated to Cart Page");
      } else {
          System.out.println("TC006: FAIL");
          System.out.println("Unsuccessfully navigated to Cart Page");
      }

      Thread.sleep(2000);

      System.out.println("----------------------------------------------------------------------------------------\n");

  }


    //Test Case - Check Cards (TC: 007)
  @Test(priority = 7)
  public void checkCards() throws InterruptedException {

      System.out.println("================================= Test 007 ============================================\n");
      System.out.println("CHECK CARDS TEST CASE\n");

      //------------------------------ Card 1: Sauce Labs Backpack ----------------------------------//

      //--------------Check Card 01 Details----------------//

      System.out.println("Verify the Card 01 details\n");

      //check card 01 quantity
      System.out.println("Card 01 Quantity Test");

      //Verify Item quantity
      expectedText = "1";
      actualText = driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[1]")).getText();

      //print actual text
      System.out.println("Test Case 007 Card 01 Quantity Actual Text: " + actualText);

      if (expectedText.equals(actualText)) {
          System.out.println("Passed: Valid Card 01 Item Quantity\n");
      } else {
          System.out.println("Failed: Invalid Card 01 Item Quantity\n");
      }


      //Check card 01 title
      System.out.println("Card 01 Title Test");

      //Verify Item title
      expectedText = "Sauce Labs Backpack";
      actualText = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();

      //print actual text
      System.out.println("Test Case 007 Card 01 Title Actual Text: " + actualText);

      if (expectedText.equals(actualText)) {
          System.out.println("Passed: Valid Card 01 Item Title\n");
      } else {
          System.out.println("Failed: Invalid Card 01 Item Title\n");
      }


      //Check card 01 description
      System.out.println("Card 01 Description Test");

      //Verify Item title
      expectedText = "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.";
      actualText = driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[2]/div[1]")).getText();

      //print actual text
      System.out.println("Test Case 007 Card 01 Description Actual Text: " + actualText);

      if (expectedText.equals(actualText)) {
          System.out.println("Passed: Valid Card 01 Item Description\n");
      } else {
          System.out.println("Failed: Invalid Card 01 Item Description\n");
      }


      //Check card 01 Price
      System.out.println("Card 01 Price Test");

      //Verify Item Price
      expectedText = "$29.99";
      actualText = driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[2]/div[2]/div")).getText();

      //print actual text
      System.out.println("Test Case 007 Card 01 Price Actual Text: " + actualText);

      if (expectedText.equals(actualText)) {
          System.out.println("Passed: Valid Card 01 Item Price\n");
      } else {
          System.out.println("Failed: Invalid Card 01 Item Price\n");
      }

      System.out.println("------------------------------------------------\n");

      Thread.sleep(2000);



      //------------------------------ Card 2: Sauce Labs Bike Light ----------------------------------//


      //--------------Check Card 02 Details----------------//

      System.out.println("Verify the Card 02 details\n");

      //check card 02 quantity
      System.out.println("Card 02 Quantity Test");

      //Verify Item quantity
      expectedText = "1";
      actualText = driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[4]/div[1]")).getText();

      //print actual text
      System.out.println("Test Case 007 Card 02 Quantity Actual Text: " + actualText);

      if (expectedText.equals(actualText)) {
          System.out.println("Passed: Valid Card 02 Item Quantity\n");
      } else {
          System.out.println("Failed: Invalid Card 02 Item Quantity\n");
      }


      //Check card 02 title
      System.out.println("Card 02 Title Test");

      //Verify Item title
      expectedText = "Sauce Labs Bike Light";
      actualText = driver.findElement(By.xpath("//*[@id=\"item_0_title_link\"]/div")).getText();

      //print actual text
      System.out.println("Test Case 007 Card 02 Title Actual Text: " + actualText);

      if (expectedText.equals(actualText)) {
          System.out.println("Passed: Valid Card 02 Item Title\n");
      } else {
          System.out.println("Failed: Invalid Card 02 Item Title\n");
      }


      //Check card 02 description
      System.out.println("Card 02 Description Test");

      //Verify Item title
      expectedText = "A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included.";
      actualText = driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[4]/div[2]/div[1]")).getText();

      //print actual text
      System.out.println("Test Case 007 Card 02 Description Actual Text: " + actualText);

      if (expectedText.equals(actualText)) {
          System.out.println("Passed: Valid Card 02 Item Description\n");
      } else {
          System.out.println("Failed: Invalid Card 02 Item Description\n");
      }


      //Check card 02 Price
      System.out.println("Card 02 Price Test");

      //Verify Item Price
      expectedText = "$9.99";
      actualText = driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[4]/div[2]/div[2]/div")).getText();

      //print actual text
      System.out.println("Test Case 007 Card 02 Price Actual Text: " + actualText);

      if (expectedText.equals(actualText)) {
          System.out.println("Passed: Valid Card 02 Item Price\n");
      } else {
          System.out.println("Failed: Invalid Card 02 Item Price\n");
      }

      System.out.println("----------------------------------------------------------------------------------------\n");

      Thread.sleep(2000);


  }


    //Test Case - Load Checkout Page (TC: 008)
  @Test(priority = 8)
  public void loadCheckoutPage() throws InterruptedException {

      System.out.println("================================= Test 008 ============================================\n");
      System.out.println("LOAD CHECKOUT PAGE TEST CASE\n");

      //click checkout button
      driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();

      //verify the checkout page
      expectedText = "Checkout: Your Information";
      actualText = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();

      //Print actual text
      System.out.println("Test Case 008 load to Checkout Page Actual Text: " + actualText);

      if (expectedText.equals(actualText)) {
          System.out.println("TC008: PASS");
          System.out.println("Successfully load to Checkout Page");
      } else {
          System.out.println("TC008: FAIL");
          System.out.println("Unsuccessfully load to Checkout Page");
      }

      Thread.sleep(2000);

      System.out.println("----------------------------------------------------------------------------------------\n");


  }


    //Test Case - Load Checkout Overview Page (TC: 009)
    @Test(priority = 9)
    public void loadCheckoutOverviewPage() throws InterruptedException {

        System.out.println("================================= Test 009 ============================================\n");
        System.out.println("LOAD CHECKOUT OVERVIEW PAGE TEST CASE\n");

        //Enter First Name
        driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Matheesha");

        //Enter Last Name
        driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Kalatuwawa");

        //Enter Zip Code
        driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("60330");

        Thread.sleep(1000);

        //Click Continue Button
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();

        //Verify Checkout Overview Page
        expectedText = "Checkout: Overview";
        actualText = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();

        //Print Actual Text
        System.out.println("Test Case 009 load to Checkout Overview Page Actual Text: " + actualText);

        if (expectedText.equals(actualText)) {
            System.out.println("TC009: PASS");
            System.out.println("Successfully load to Checkout Overview Page");
        } else {
            System.out.println("TC009: FAIL");
            System.out.println("Unsuccessfully load to Checkout Overview Page");
        }

        Thread.sleep(2000);


        System.out.println("----------------------------------------------------------------------------------------\n");


    }


    @Test(priority = 10)
    public void checkCheckoutOverviewPageCards() throws InterruptedException {

        System.out.println("================================= Test 0010 ============================================\n");
        System.out.println("CHECK CHECKOUT OVERVIEW PAGE CARDS TEST CASE\n");

        //--------------------------- Verify Checkout Overview Page Card Details ------------------------------//


        //------------------------------ Card 1: Sauce Labs Backpack ----------------------------------//

        //--------------Check Card 01 Details----------------//

        System.out.println("Verify the Card 01 details\n");

        //check card 01 quantity
        System.out.println("Card 01 Quantity Test");

        //Verify Item quantity
        expectedText = "1";
        actualText = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[1]/div[3]/div[1]")).getText();

        //print actual text
        System.out.println("Test Case 0010 Checkout Overview Page Card 01 Quantity Actual Text: " + actualText);

        if (expectedText.equals(actualText)) {
            System.out.println("Passed: Valid Checkout Overview Page Card 01 Item Quantity\n");
        } else {
            System.out.println("Failed: Invalid Checkout Overview Page Card 01 Item Quantity\n");
        }


        //Check card 01 title
        System.out.println("Card 01 Title Test");

        //Verify Item title
        expectedText = "Sauce Labs Backpack";
        actualText = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();

        //print actual text
        System.out.println("Test Case 0010 Checkout Overview Page Card 01 Title Actual Text: " + actualText);

        if (expectedText.equals(actualText)) {
            System.out.println("Passed: Valid Checkout Overview Page Card 01 Item Title\n");
        } else {
            System.out.println("Failed: Invalid Checkout Overview Page Card 01 Item Title\n");
        }


        //Check card 01 description
        System.out.println("Card 01 Description Test");

        //Verify Item title
        expectedText = "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.";
        actualText = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[1]/div[3]/div[2]/div[1]")).getText();

        //print actual text
        System.out.println("Test Case 0010 Checkout Overview Page Card 01 Description Actual Text: " + actualText);

        if (expectedText.equals(actualText)) {
            System.out.println("Passed: Valid Checkout Overview Page Card 01 Item Description\n");
        } else {
            System.out.println("Failed: Invalid Checkout Overview Page Card 01 Item Description\n");
        }


        //Check card 01 Price
        System.out.println("Card 01 Price Test");

        //Verify Item Price
        expectedText = "$29.99";
        actualText = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[1]/div[3]/div[2]/div[2]/div")).getText();

        //print actual text
        System.out.println("Test Case 0010 Checkout Overview Page Card 01 Price Actual Text: " + actualText);

        if (expectedText.equals(actualText)) {
            System.out.println("Passed: Valid Checkout Overview Page Card 01 Item Price\n");
        } else {
            System.out.println("Failed: Invalid Checkout Overview Page Card 01 Item Price\n");
        }

        System.out.println("------------------------------------------------\n");



        //------------------------------ Card 2: Sauce Labs Bike Light ----------------------------------//


        //--------------Check Card 02 Details----------------//

        System.out.println("Verify the Card 02 details\n");

        //check card 02 quantity
        System.out.println("Card 02 Quantity Test");

        //Verify Item quantity
        expectedText = "1";
        actualText = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[1]/div[4]/div[1]")).getText();

        //print actual text
        System.out.println("Test Case 0010 Checkout Overview Page Card 02 Quantity Actual Text: " + actualText);

        if (expectedText.equals(actualText)) {
            System.out.println("Passed: Valid Checkout Overview Page Card 02 Item Quantity\n");
        } else {
            System.out.println("Failed: Invalid Checkout Overview Page Card 02 Item Quantity\n");
        }


        //Check card 02 title
        System.out.println("Card 02 Title Test");

        //Verify Item title
        expectedText = "Sauce Labs Bike Light";
        actualText = driver.findElement(By.xpath("//*[@id=\"item_0_title_link\"]/div")).getText();

        //print actual text
        System.out.println("Test Case 0010 Checkout Overview Page Card 02 Title Actual Text: " + actualText);

        if (expectedText.equals(actualText)) {
            System.out.println("Passed: Valid Checkout Overview Page Card 02 Item Title\n");
        } else {
            System.out.println("Failed: Invalid Checkout Overview Page Card 02 Item Title\n");
        }


        //Check card 02 description
        System.out.println("Card 02 Description Test");

        //Verify Item title
        expectedText = "A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included.";
        actualText = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[1]/div[4]/div[2]/div[1]")).getText();

        //print actual text
        System.out.println("Test Case 0010 Checkout Overview Page Card 02 Description Actual Text: " + actualText);

        if (expectedText.equals(actualText)) {
            System.out.println("Passed: Valid Checkout Overview Page Card 02 Item Description\n");
        } else {
            System.out.println("Failed: Invalid Checkout Overview Page Card 02 Item Description\n");
        }


        //Check card 02 Price
        System.out.println("Card 02 Price Test");

        //Verify Item Price
        expectedText = "$9.99";
        actualText = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[1]/div[4]/div[2]/div[2]/div")).getText();

        //print actual text
        System.out.println("Test Case 0010 Checkout Overview Page Card 02 Price Actual Text: " + actualText);

        if (expectedText.equals(actualText)) {
            System.out.println("Passed: Valid Checkout Overview Page Card 02 Item Price\n");
        } else {
            System.out.println("Failed: Invalid Checkout Overview Page Card 02 Item Price\n");
        }

        System.out.println("----------------------------------------------------------------------------------------\n");

        Thread.sleep(2000);



    }

























    //Supportive methods

    /*----------------- login user supportive method ------------------------*/
    public void userLogin() throws InterruptedException {

        driver.get(BaseURL);
        Thread.sleep(1000);

        //Identify the Username text and send value
        driver.findElement(By.name("user-name")).sendKeys("standard_user");

        //Identify the Password txt and send value
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        Thread.sleep(1000);

        //Clicked the login button
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        Thread.sleep(2000);
    }


    /*---------------------------- Dropdown icon supportive method -----------------*/
    public void dropdownIcon() throws InterruptedException {

        //click the dropdown icon
        driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
        Thread.sleep(1000);
    }












}
