package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase{
  
  @Test
  public void testGroupDeletion() throws Exception {
    app.gotoGroupPage();
    app.wd.get("http://localhost/addressbook/group.php");
    app.selectGroup();
    app.deletSelectedGroups();
    app.returnToGroupPage();
    app.wd.findElement(By.linkText("Logout")).click();
  }

}
