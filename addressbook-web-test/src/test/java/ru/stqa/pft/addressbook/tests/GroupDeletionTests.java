package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase{
  
  @Test
  public void testGroupDeletion() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    app.wd.get("http://localhost/addressbook/group.php");
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deletSelectedGroups();
    app.getGroupHelper().returnToGroupPage();
    app.wd.findElement(By.linkText("Logout")).click();
  }

}
