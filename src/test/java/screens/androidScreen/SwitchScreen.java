package screens.androidScreen;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class SwitchScreen {
    public SwitchScreen(){

        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()),this);
    }
    @AndroidFindBy(id = "android:id/checkbox")
    public MobileElement checkBox;

    @AndroidFindBy(xpath = "(//android.widget.Switch)[1]")
    public MobileElement firstSwitch;

    @AndroidFindBy(xpath = "(//android.widget.Switch)[2]")
    public MobileElement secondSwitch;


}