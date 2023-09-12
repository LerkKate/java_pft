package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase{
  
  @Test
  public void testGroupDeletion() throws Exception {
    gotoGroupPage();
    wd.get("http://localhost/addressbook/group.php");
    selectGroup();
    deletSelectedGroups();
    returnToGroupPage();
  }

}
