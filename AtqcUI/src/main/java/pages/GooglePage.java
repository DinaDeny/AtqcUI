package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static framework.Wait.waitUntilVisible;

@Log4j
public class GooglePage extends BasePage {

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
