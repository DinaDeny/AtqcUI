package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SiteRanorexPage {

    private WebDriver driver;

    public SiteRanorexPage(WebDriver driver) {
        this.driver = driver;
    }

    private By firstNameLocator = By.id("FirstName");
    private By lastNameLocator = By.id("LastName");
    private By CategoryLocator = By.id("Category");
    private By ButtonLocator = By.id("Save");

    public SiteRanorexPage enterFirstName(String firstName) {
        WebElement firstNameField = driver.findElement(firstNameLocator);
        return this;
    }
    public SiteRanorexPage enterLastName (String lastName) {
        WebElement lastNameField = driver.findElement(lastNameLocator);
        return this;
    }
    /*public SiteRanorexPage selectCategory () {
        driver.findElement(CategoryLocator);
        SiteRanorexPage siteRanorexPage = selectCategory();
    }*/


    public SiteRanorexPage clickSaveButton(){
        driver.findElement(ButtonLocator).click();
        return new SiteRanorexPage(driver);
    }

    public SiteRanorexPage addUser(String firstName, String lastName){
        enterFirstName(firstName);
        enterLastName(lastName);
        return clickSaveButton();
    }
}
