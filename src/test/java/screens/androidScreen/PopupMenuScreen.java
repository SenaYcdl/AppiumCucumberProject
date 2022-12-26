package screens.androidScreen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;


public class PopupMenuScreen {
    public PopupMenuScreen() {

        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()), this);
    }

    @AndroidFindBy(className = "android.widget.Button")
    public MobileElement makePopupButton;

    @AndroidFindBy(xpath = "//android.widget.Toast")
    public MobileElement popupMessage;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Search']")
    public MobileElement searchButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='WebView']")
    public MobileElement webViewButton;
}