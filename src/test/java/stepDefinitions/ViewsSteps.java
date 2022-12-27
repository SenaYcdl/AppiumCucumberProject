package stepDefinitions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Dimension;
import screens.Screens;
import utils.Driver;
import utils.ReusableMethods;


import java.time.Duration;
import java.util.List;

public class ViewsSteps extends ReusableMethods {
    Screens screens = new Screens();
    TouchAction touchAction = new TouchAction(Driver.getAppiumDriver());

    @And("kullanici Views butonuna tikladi")
    public void kullaniciViewsButonunaTikladi() {
        tapOn(screens.apiDemosScreen().views);
    }

    @Then("kullanici Views ekraninda")
    public void kullaniciViewsEkraninda() {
        Assert.assertTrue(isElementPresent(screens.viewScreen().viewsTitle));
    }

    @And("kullanici Drag and Drop butonuna tikladi")
    public void kullaniciDragAndDropButonunaTikladi() {
        tapOn(screens.viewScreen().dragDropButton);
    }

    @When("kullanici birinci topu ikici topun ustune brakti")
    public void kullaniciBirinciTopuIkiciTopunUstuneBrakti() {
        touchAction.longPress(ElementOption.element(screens.dragAndDropScreen().firstDot))
                .moveTo(ElementOption.element(screens.dragAndDropScreen().secondDot)).release().perform();
    }

    @Then("kullanici dorduncu top gorecek")
    public void kullaniciDorduncuTopGorecek() {
        Assert.assertTrue(isElementPresent(screens.dragAndDropScreen().hiddenDot));
    }

    @And("kullanici {int} tiklasin")
    public void kullaniciTiklasin(int saat) {
        tapOn(screens.dateWidgetsScreen().num9);
        wait(4);
    }

    @And("kulanici {int} ten {int} e yesil topu kaydirsin")
    public void kulaniciTenEYesilTopuKaydirsin(int dakika1, int dakika2) {
        touchAction.press(ElementOption.element(screens.dateWidgetsScreen().num15))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)))
                .moveTo(ElementOption.element(screens.dateWidgetsScreen().num45)).release().perform();
    }

    @And("kullanici {string} butununa uzun basti")
    public void kullaniciButununaUzunBasti(String text) {
        touchAction.longPress(LongPressOptions.longPressOptions()
                        .withElement(ElementOption.element(Driver.getAppiumDriver().findElementByXPath("//android.widget.TextView[@text='" + text + "']"))))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3))).release().perform();
    }

    @And("kullanici Switches butonun tiklasin")
    public void kullaniciSwitchesButonunTiklasin() {
        List<MobileElement> list;
        do {
            list = screens.viewScreen().switchesButton;

            Dimension dimension = Driver.getAppiumDriver().manage().window().getSize();
            int start_x = (int) (dimension.width * 0.5);
            int start_y = (int) (dimension.height * 0.8);
            int end_x = (int) (dimension.width * 0.5);
            int end_y = (int) (dimension.height * 0.2);

            TouchAction touchAction = new TouchAction(Driver.getAppiumDriver());

            touchAction.press(PointOption.point(start_x, start_y))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(end_x, end_y)).release().perform();
            wait(3);
        } while (list.size() == 0);

        tapOn(screens.viewScreen().switchesButton.get(0));

    }

    @And("kullanici {string} button tiklasin")
    public void kullaniciButtonTiklasin(String text) {

        scrollWithUiScrollable(text);
    }
}