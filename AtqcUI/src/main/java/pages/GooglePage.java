package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static framework.Wait.waitUntilVisible;

@Log4j
public class GooglePage extends BasePage {

    @FindBy(name = "Search")
    private WebElement searchField;

    @Step("Input search parameters: {0}")
    public void inputSearchParameters(String searchParams) {
        waitUntilVisible(searchField);
        searchField.click();
        searchField.sendKeys(searchParams);
        log.info("Search parameters was entered");
    }
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

    @FindBy (id = "Category")
    private WebElement Category;

    @Step ("Select Category")
    public void selectCategoryParameters(String categoryParams){
        selectCategoryParameters("Politics");
        log.info("Category parameters was selected");
    }

}

