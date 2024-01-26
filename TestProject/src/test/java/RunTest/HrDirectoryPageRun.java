package RunTest;

import Pages.HrDirectoryLocatorPage;
import org.testng.annotations.Test;

public class HrDirectoryPageRun extends LoginPageRun {
    @Test(priority = 2, enabled = true)
    public void createemployee() throws InterruptedException {
        HrDirectoryLocatorPage hrDirectoryLocatorPage=new HrDirectoryLocatorPage(driver);
        hrDirectoryLocatorPage.CreateEmployee();

    }
}
