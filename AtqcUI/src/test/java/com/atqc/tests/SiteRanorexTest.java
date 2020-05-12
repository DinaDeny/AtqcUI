package com.atqc.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.SiteRanorexPage;

import java.util.concurrent.TimeUnit;


public class SiteRanorexTest {
    private WebDriver driver;

    @BeforeClass
    public void innitDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.ranorex.com/web-testing-examples/vip/");
    }
    @Test()
    public void myTest() {

        SiteRanorexPage siteRanorexPage = new SiteRanorexPage(driver);
        siteRanorexPage.addUser("Ross", "Geller");
    }

    @DataProvider(name = "addUsersInfo")
    public Object[][] dataProviderMethod() {
        return new Object[][] { { "Ross", "Geller123" }, { "Monica", "Geller123" } };
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

