package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
/*
@Log4j

public class SiteRanorexPage extends BasePage {


    @FindBy(id = "FirstName")
    private WebElement firstNameField;

    @Step("Input name: Monica")
    public void inputFirstNameParameters(String firstNameParams) {
        firstNameField.sendKeys(firstNameParams);
        log.info("First Name parameters was entered");
    }

    @FindBy(id = "LastName")
    private WebElement lastNameField;

    @Step("Input last name: Geller")
    public void inputLastNameParameters(String lastNameParams){
        lastNameField.sendKeys(lastNameParams);
        log.info("Last Name parameters was entered");
    }
}
*/


public class SiteRanorexPage {

    private WebDriver driver;
    private String Category;

    public SiteRanorexPage(WebDriver driver) {
        this.driver = driver;
    }

    private By firstNameLocator = By.id("FirstName");
    private By lastNameLocator = By.id("LastName");
    private By CategoryLocator = By.id("Category");
    private By ButtonLocator = By.id("Save");


    public SiteRanorexPage enterFirstName(String firstName) {
        WebElement firstNameField = driver.findElement(firstNameLocator);
        firstNameField.sendKeys(firstName);
        return this;
    }
    public SiteRanorexPage enterLastName (String lastName) {
        WebElement lastNameField = driver.findElement(lastNameLocator);
        lastNameField.sendKeys(lastName);
        return this;
    }
    public SiteRanorexPage selectCategory (String category) {
       Select select = new Select(driver.findElement(CategoryLocator));
       select.selectByValue(category);
       return this;
    }

    public SiteRanorexPage clickSaveButton(){
        driver.findElement(ButtonLocator).click();
        return new SiteRanorexPage(driver);
    }


    public SiteRanorexPage addUser(String firstName, String lastName){
        enterFirstName(firstName);
        enterLastName(lastName);
        return clickSaveButton();
    }

    public boolean checkThatUserAdded(String firstName) {
        String builtXpath = String.format("//td[text()='%s']", firstName);
        return driver.findElement(By.xpath(builtXpath)).isDisplayed();
    }
}


