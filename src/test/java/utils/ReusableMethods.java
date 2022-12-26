package utils;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class ReusableMethods {

    public static void tapOnElementWithText(String text) {
        List<MobileElement> mobileElementList = Driver.getAppiumDriver().findElementsByClassName("android.widget.TextView");
        for (MobileElement page: mobileElementList) {
            if (page.getText().equals(text)){
                page.click();
            }else{
                scrollWithUiScrollable(text);
            }
            break;
        }
    }

    //ikinci alternatif bir method
    public static void clickOnElementWithText(String elementText) throws InterruptedException {
        Thread.sleep(4000);
        List<MobileElement> mobileElementList = Driver.getAppiumDriver().findElementsByXPath("//android.widget.TextView[@text='"+elementText+"']");
        if (mobileElementList.size()>0){
            mobileElementList.get(0).click();
        }else scrollWithUiScrollable(elementText);
    }


    public static boolean isElementPresent(String text) {
        boolean elementFound = false;
        List<MobileElement> mobileElementList = Driver.getAppiumDriver().findElementsByXPath("//android.widget.TextView[@text='" + text + "']");
        for (MobileElement el : mobileElementList) {
            if (el.getText().equals(text)) {
                waitToBeVisible(el, 10);
                if (el.isDisplayed()) {
                    elementFound = true;
                }
            }
        }
        return elementFound;
    }

    public static void wait(int second) {
        try {
            Thread.sleep(second * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void tapOn(MobileElement element) {
        waitToBeClickable(element, 10);
        element.click();
    }

    public static void enterText(MobileElement element, String text) {
        waitToBeClickable(element, 10);
        element.sendKeys(text);
    }

    public static void enterText(MobileElement element, String text, boolean needClear) {
        waitToBeClickable(element, 10);
        if (needClear) {
            element.clear();
        }
        element.sendKeys(text);
    }

    public static boolean isElementPresent(MobileElement mobileElement) {
        boolean elementFound = false;
        waitToBeVisible(mobileElement, 10);
        if (mobileElement.isDisplayed()) {
            elementFound = true;
        }
        return elementFound;
    }

    public static void waitToBeVisible(MobileElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getAppiumDriver(), timeout);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitToBeClickable(MobileElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getAppiumDriver(), timeout);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void scrollWithUiScrollable(String elementText) {
        AndroidDriver<MobileElement> driver = (AndroidDriver) Driver.getAppiumDriver();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+elementText+"\"))");
        tapOn(driver.findElementByXPath("//android.widget.TextView[@text='" + elementText + "']"));
    }

    public static void scrollDownToBeVisible(MobileElement element) {

    }

    public static void scrollUpToBeVisible(MobileElement element) {

    }

    public static void swipeFromElementToElement(MobileElement el1, MobileElement el2) {

    }
//attribute check


}