package pages;

import base.DriverMgr;
import elements.LoginElements;
import org.openqa.selenium.WebDriver;

public class LoginPage extends LoginElements {

    DriverMgr driverMgr = new DriverMgr();
    WebDriver driver = driverMgr.getDriver();

    public void openWebsite() {
        driver.get("https://www.amazon.com/");
    }
}
