package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RanorexPage {

    private WebDriver driver;

    public RanorexPage(WebDriver driver) {
        this.driver = driver;
    }

    private By firstNameLocator = By.id("FirstName");
    private By lastNameLocator = By.id("LastName");
    private By CategoryLocator = By.id("Category");
    private By ButtonLocator = By.id("Save");

    public RanorexPage enterFirstName(String firstName) {
        WebElement firstNameField = driver.findElement(firstNameLocator);
        return this;
    }
    public RanorexPage enterLastName (String lastName) {
        WebElement lastNameField = driver.findElement(lastNameLocator);
        return this;
    }
    public RanorexPage selectCategory () {
        driver.findElement(CategoryLocator).isSelected();
        return new RanorexPage(driver);
    }
    public RanorexPage clickSaveButton(){
        driver.findElement(ButtonLocator).click();
        return new RanorexPage(driver);
    }
}
