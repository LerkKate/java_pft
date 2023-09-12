package ru.stqa.pft.addressbook;

import org.openqa.selenium.*;
import org.testng.annotations.Test;

public class CroupCreationTests extends TestBase {

    @Test
    public void testUntitledTestCase() throws Exception {
        gotoGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("test1", "test2", "test3"));
        submitGroupCreation();
        returnToGroupPage();
        wd.findElement(By.linkText("Logout")).click();
    }

}
