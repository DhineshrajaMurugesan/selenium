package com.kg.definitions;

//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

@RunWith(Cucumber.class)
public class dropdown {
    public static WebDriver driver;
    @Given("^I am at  sample html page$")
    public void i_am_at_sample_html_page() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-notifications");
        options.addArguments("disable-infobars");
        System.setProperty("webdriver.chrome.driver", "D:\\seleniumdrivers\\chromedriver.exe");
        driver = new ChromeDriver(options);
        // driver.get("http://only-testing-blog.blogspot.in/p/mouse-hover.html");
        driver.get("https://www.microsoft.com/en-in");
        driver.manage().window().maximize();
    }

    @When("^I select menus from dropdown$")
    public void i_select_menus_from_dropdown() 
    {
  
    Actions actions = new Actions(driver);
   driver.findElement(By.xpath("//*[@id='More-navigation']")).click();
   WebElement moveonmenu = driver.findElement(By.xpath("//*[@id='More-navigation']"));
   actions.moveToElement(moveonmenu).moveToElement(driver.findElement(By.xpath("//*[@id='shellmenu_20']"))).click().perform();
   
   driver.findElement(By.id("navigation-products")).click();
   WebElement moveonmenu1 = driver.findElement(By.id("navigation-products"));
   actions.moveToElement(moveonmenu1).moveToElement(driver.findElement(By.xpath("//*[@id='menu-category-iot']"))).click().perform();

     PGGGGGGGGGggytjjj
        // Select mydrpdwn = new Select(driver.findElement(By.id("drop1")));
        // mydrpdwn.selectByVisibleText("Audi");
        // Select dropdown2 = new Select(driver.findElement(By.xpath("//*[@id='drop2']")));
        // dropdown2.selectByValue("pomogranete");
        // Select listbox = new Select(driver.findElement(By.xpath("//*[@id='drop3']")));
        // listbox.deselectByVisibleText("hibiscus");
        // Select dropdown3 = new Select(driver.findElement(By.xpath("//*[@id='drop3']")));
        // dropdown3.deselectByValue("hibiscus");
        // Select dropdown3 = new Select(driver.findElement(By.xpath("//*[@id='drop3']")));
        // dropdown3.deselectAll();
        
    }

    @Then("^I press exit$")
    public void i_press_exit() {
        
        // JavascriptExecutor javascript = (JavascriptExecutor) driver;
        // javascript.executeScript("alert('Test Case Execution Is ended Now..');");
       
    }

}