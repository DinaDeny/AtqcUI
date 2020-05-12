package framework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.SiteRanorexPage;

import java.util.concurrent.TimeUnit;

public class AppTest {
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

    @Test()
    public void myTest2() {

        SiteRanorexPage siteRanorexPage = new SiteRanorexPage(driver);
        siteRanorexPage.addUser("Ross", "Geller");
    }


    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

