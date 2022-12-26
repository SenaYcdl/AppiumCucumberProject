package screens.androidScreen;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class PreferenceDependenciesScreen {
    public PreferenceDependenciesScreen(){

        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()),this);
    }

    @AndroidFindBy(id = "android:id/checkbox")
    public MobileElement checkBox;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='WiFi settings']")
    public MobileElement wifiSettings;

    @AndroidFindBy(id = "android:id/button2")
    public MobileElement cancelButton;

    @AndroidFindBy(id = "android:id/button1")
    public MobileElement okButton;

    @AndroidFindBy(id = "android:id/edit")
    public MobileElement textBox;

}