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

import static org.testng.Assert.assertTrue;


public class SiteRanorexTest {
    private WebDriver driver;

    @BeforeClass
    public void innitDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.ranorex.com/web-testing-examples/vip/");
    }
    @Test(dataProvider = "addUsersInfo")
    public void myTest(String firstName, String lastName) {

        SiteRanorexPage siteRanorexPage = new SiteRanorexPage(driver);
        siteRanorexPage.addUser(firstName, lastName);
        siteRanorexPage.selectCategory("Sport");
        siteRanorexPage.clickSaveButton();
        //фейлится тест с этим асёртом
        // assertTrue(siteRanorexPage.checkThatUserAdded(firstName));
    }

    @DataProvider(name = "addUsersInfo")
    public Object[][] dataProviderMethod() {
        return new Object[][] {
                { "Ross", "Geller" }};
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

