package org.example;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import java.time.Clock;
import java.util.concurrent.TimeUnit;

public class RegistrationHomeWork5

{
    static protected WebDriver driver;

    //--------------------------------------------------NEXT-----------------------------------------------------------

    // Using Junit annotation
    @Test

    public void registerNext()
    {
        //create an instance of the chrome driver.
        System.setProperty("webdriver.chrome.driver", "src\\test\\java\\BrowserDrivers\\chromedriver.exe");
        // object created for chrome driver
        driver = new ChromeDriver();
        //Maximize the window
        driver.manage().window().maximize();
        //Add implicitly wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // open website
        driver.get("https://www.next.co.uk/secure/account/Login");
        driver.findElement(By.xpath("//a[@class=\"nxbtn primary large\"]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        // Find element and enter Valid Firstname
        driver.findElement(By.id("FirstName")).sendKeys("John");
        // Find element and enter Valid Lastname
        driver.findElement(By.id("LastName")).sendKeys("Smith");
        // Find element and enter Valid Email address
        driver.findElement(By.id("Email")).sendKeys("abcdxyz@gmail.com");
        // Find element and enter Valid Password
        driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("abcd123456");
        // Find element and enter Valid Date of Birth
        driver.findElement(By.xpath("//input[@id=\"DobDate\"]")).sendKeys("01 01 80");
        // Find element and enter Valid Phonenumber
        driver.findElement(By.id("PhoneNumber")).sendKeys("00023456945");
        // Find element and enter Valid HouseNumber
        driver.findElement(By.id("HouseNumberOrName")).sendKeys("116");
        // Find element and enter Valid PostCode
        driver.findElement(By.id("Postcode")).sendKeys("ub5 4tt");
        driver.findElement(By.id("SearchPostcode")).click();
        driver.findElement(By.xpath("//*[@id=\"SignupButton\"]")).click();
    }

    //---------------------------------------------------MATALAN--------------------------------------------------------

    // Using Junit annotation
    @Test
    public void registerMatalan() {
        //create an instance of the chrome driver.
        System.setProperty("webdriver.chrome.driver", "src\\test\\java\\BrowserDrivers\\chromedriver.exe");
        // object created for chrome driver
        driver = new ChromeDriver();
        //Maximize the window
        driver.manage().window().maximize();
        //Add implicitly wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.matalan.co.uk/");
        // Find element and click on My account
        driver.findElement(By.linkText("My Account")).click();
        // Find element and enter Valid Email address
        driver.findElement(By.id("account_form_email")).sendKeys("123@gmail.com");
        // Find element and click on New Account Form Button
        driver.findElement(By.xpath("//*[@id=\"new_account_form\"]/button")).click();
        // Find element and enter Valid Firstname
        driver.findElement(By.id("account_form_meta_attributes[first_name][value]")).sendKeys("John");
        // Find element and enter Valid Lastname
        driver.findElement(By.id("account_form_meta_attributes[last_name][value]")).sendKeys("Smith");
        // Find element and enter Valid Email address
        driver.findElement(By.id("account_form_email_confirmation")).sendKeys("123@gmail.com");
        // Find element and enter Valid Password
        driver.findElement(By.id("account_form_password")).sendKeys("123456abcd");
        // Find element and enter Valid confirm password
        driver.findElement(By.id("account_form_password_confirmation")).sendKeys("123456abcd");

    }

    //---------------------------------------------------WILKO----------------------------------------------------------

    // Using Junit annotation
    @Test
     public void RegisterWilko()
     {
         //create an instance of the chrome driver.
       System.setProperty("webdriver.chrome.driver", "src\\test\\java\\BrowserDrivers\\chromedriver.exe");
         // object created for chrome driver
        driver = new ChromeDriver();
         //Maximize the window
         driver.manage().window().maximize();
         //Add implicitly wait
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.wilko.com/");
        WebDriverWait webDriverWait = new WebDriverWait(driver, 5);
        driver.findElement(By.xpath("//a[@class=\"navigation-account-link nav__links--anonymous\"]")).click();
         // Find element and enter Valid FirstName
        driver.findElement(By.id("register.firstName")).sendKeys("John");
         // Find element and enter Valid Lastname
        driver.findElement(By.id("register.lastName")).sendKeys("Smith");
         // Find element and enter Valid Email Id
        driver.findElement(By.id("register.email")).sendKeys("abcd123@gmail.com");
         // Find element and enter Valid Password
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("12323aaa");
         // Find element and enter Valid Confirm Password
        driver.findElement(By.xpath("//input[@id=\"register.checkPwd\"]")).sendKeys("12323aaa");


      }

    //---------------------------------------------------TESCO----------------------------------------------------------

    // Using Junit annotation
    @Test
    public void registerTesco()
    {
        //create an instance of the chrome driver.
        System.setProperty("webdriver.chrome.driver","src\\test\\java\\BrowserDrivers\\chromedriver.exe");
        // object created for chrome driver
        driver = new ChromeDriver();
        //Maximize the window
        driver.manage().window().maximize();
        //Add implicitly wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.tesco.com/");
        driver.findElement(By.xpath("//span[@class=\"announcement-close-icon\"]")).click();
        driver.findElement(By.xpath("//a[@title=\"Sign in\"]")).click();
        driver.findElement(By.xpath("//a[text()=\"Register for an account\"]")).click();
        // Find element and enter Valid email address
        driver.findElement(By.name("username")).sendKeys("abcd123@gmail.com");
        // Find element and enter Valid Password
        driver.findElement(By.id("password")).sendKeys("Abc@123");
        // Find element and enter Valid Firstname
        driver.findElement(By.name("first-name")).sendKeys("John");
        // Find element and enter Valid lastname
        driver.findElement(By.name("last-name")).sendKeys("Smith");
        // Find element and enter Valid Phone number
        driver.findElement(By.name("phone-number")).sendKeys("07589632356");
        // Find element and enter Valid postcode
        driver.findElement(By.name("postcode")).sendKeys("Ha49ds");
        // Find element and enter click on submit button
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    }
    //-------------------------------------------------NEW LOOK--------------------------------------------------------

    // Using Junit annotation
    @Test
    public void registerNewlook()
    {
        //create an instance of the chrome driver.
        System.setProperty("webdriver.chrome.driver","src\\test\\java\\BrowserDrivers\\chromedriver.exe");
        // object created for chrome driver
        driver = new ChromeDriver();
        //Maximize the window
        driver.manage().window().maximize();
        //Add implicitly wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.newlook.com/uk");
        // Find element and click on My Coount
        driver.findElement(By.xpath("//div/a[@href=\"/uk/my-account\"]")).click();
        // Find element and click on Create My Account
        driver.findElement(By.xpath("//button[text()=\"CREATE AN ACCOUNT\"]")).click();
        // Find element and enter email address
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("123abcd@gmail.com");
        // Find element and enter Valid Password
        driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("123abcd");
        // Find element and enter Valid Firstname
        driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("John");
        // Find element and enter Valid Lastname
        driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Smith");
        driver.findElement(By.xpath("//*[@id=\"registerForm\"]/div[8]/button")).click();
    }
}

//END OF PROGRAMME