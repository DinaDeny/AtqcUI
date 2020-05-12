package com.atqc.tests;

import framework.AllureListener;
import framework.DriverActions;
import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.GooglePage;

public class SiteRanorexTest1 {

    @Epic("Add First and Last Name")
    @Feature("Ranorex Test with First and Last Name ")
    @Listeners(AllureListener.class)
    public class SiteRanorexTest extends BaseTest {

        GooglePage newSitePage;

        @Test
        @Story("STORY-02")
        @TmsLink("00002")
        @Description("Test for entering First and Last name")
        @Issue("JIRA-2")
        public void openGooglePage() {

            DriverActions.open("https://www.ranorex.com/web-testing-examples/vip/");
            newSitePage = new GooglePage();
            newSitePage.inputFirstNameParameters("Ross");
            newSitePage.inputLastNameParameters("Geller");

        }

    }
}
