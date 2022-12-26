package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import screens.Screens;
import utils.Driver;
import utils.ReusableMethods;

import java.util.Set;

public class ApiDemosStepDefinition extends ReusableMethods {

    Screens screens = new Screens();
    @Given("upload to app")
    public void uploadToApp() {

        Driver.getAppiumDriver();

    }

    @Then("user goes to page")
    public void userGoesToPage() {

        Assert.assertTrue(isElementPresent(screens.mainScreen().mainScreenTitle));

    }

    @And("user click to API demos")
    public void userClickToAPIDemos() {

        tapOn(screens.mainScreen().apiDemosButton);

    }

    @And("user on the API demos screen")
    public void userOnTheAPIDemosScreen() {

        Assert.assertTrue(isElementPresent(screens.apiDemosScreen().apiDemosTitle));

    }

    @And("user click to Preference button")
    public void userClickToPreferenceButton() {

        tapOn(screens.apiDemosScreen().preference);

    }

    @Then("user on the Preference page")
    public void userOnThePreferencePage() {

        Assert.assertTrue(isElementPresent(screens.preferenceScreen().preferenceScreenTitle));

    }

    @And("user click to Preference dependencies button")
    public void userClickToPreferenceDependenciesButton() {

        tapOn(screens.preferenceScreen().preferenceDependencies);

    }

    @And("user click to Wifi setting check box")
    public void userClickToWifiSettingCheckBox() {

        if (screens.preferenceDependenciesScreen().checkBox.getAttribute("checked").equals("false")) {
            tapOn(screens.preferenceDependenciesScreen().checkBox);
        }
    }

    @And("user click to Wifi settings")
    public void userClickToWifiSettings() {

        tapOn(screens.preferenceDependenciesScreen().wifiSettings);

    }

    @Then("user wifi setting")
    public void userWifiSetting() {

        Assert.assertTrue(isElementPresent(screens.preferenceDependenciesScreen().cancelButton));

    }

    @And("kullanici {string} yazdi")
    public void kullaniciYazdi(String text) {
        enterText(screens.preferenceDependenciesScreen().textBox, text);
    }

    @And("kullanici Switches tikladi")
    public void kullaniciSwitchesTikladi() {
        tapOn(screens.preferenceScreen().switchButton);
    }

    @And("kullanici check box tikladi")
    public void kullaniciCheckBoxTikladi() {
        tapOn(screens.switchScreen().checkBox);
    }

    @And("kulanici switch butonuna tikladi")
    public void kulaniciSwitchButonunaTikladi() {
        tapOn(screens.switchScreen().firstSwitch);
    }

    @And("check box secili olmali")
    public void checkBoxSeciliOlmali() {
        if (screens.preferenceDependenciesScreen().checkBox.getAttribute("checked").equals("false")) {
            tapOn(screens.switchScreen().checkBox);
        }
    }

    @And("ilk switch butonu kapali")
    public void ilkSwitchButonuKapali() {
        if (screens.switchScreen().firstSwitch.getText().equals("ON")) {
            tapOn(screens.switchScreen().firstSwitch);
        }
    }

    @And("ikici switch butonu acik")
    public void ikiciSwitchButonuAcik() {
        if (screens.switchScreen().secondSwitch.getText().equals("NO")) {
            tapOn(screens.switchScreen().secondSwitch);
        }
    }

    @And("kullanici {string} butununa tikladi")
    public void kullaniciButununaTikladi(String text) {
        tapOnElementWithText(text);

    }

    @Then("kullanici {string} ekraninda")
    public void kullaniciEkraninda(String text) {
        isElementPresent(text);
    }

    @And("{int} saniye bekle")
    public void saniyeBekle(int saniye) {
        wait(saniye);
    }

    @And("kullici make popup butonuna tikladi")
    public void kulliciMakePopupButonunaTikladi() {
        tapOn(screens.popupMenuScreen().makePopupButton);
    }

    @Then("popup mesaji onayla")
    public void popupMesajiOnayla() {
        String message = screens.popupMenuScreen().popupMessage.getAttribute("name");
        Assert.assertTrue(message.contains("Search"));
        System.out.println("tam mesaj = " + message);
    }

    @And("kullanici Search butununa tikladi")
    public void kullaniciSearchButununaTikladi() {
        tapOn(screens.popupMenuScreen().searchButton);
//        wait(3);
    }

    @And("kullanici Webview butununa tikladi")
    public void kullaniciWebviewButununaTikladi() {
        System.out.println("webview tiklamada once ====>" + Driver.getAppiumDriver().getContext());

        scrollWithUiScrollable("WebView");

        System.out.println("webview tiklamada sonraki ====>" + Driver.getAppiumDriver().getContext());
        Set<String> allContext = Driver.getAppiumDriver().getContextHandles();

        wait(5);
        for (String each : allContext) {
            System.out.println(each);
            if (each.contains("WEBVIEW")) {
                Driver.getAppiumDriver().context("WEBVIEW");
            }
        }
        //app haa Native bu yuzden teste devam edemedik

        System.out.println("son durum ====>" + Driver.getAppiumDriver().getContext());

    }


}
