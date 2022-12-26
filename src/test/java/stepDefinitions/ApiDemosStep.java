package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import screens.Screens;
import utils.Driver;
import utils.ReusableMethods;

public class ApiDemosStep extends ReusableMethods {
    Screens screens = new Screens();

    @Given("App yuklensin")
    public void app_yuklensin() {
        Driver.getAppiumDriver();
    }

    @And("kullanici ana ekranda")
    public void kullaniciAnaEkranda() {
        Assert.assertTrue(isElementPresent(screens.mainScreen().mainScreenTitle));
    }
}