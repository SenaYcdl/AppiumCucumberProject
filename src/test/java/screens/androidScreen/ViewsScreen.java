package screens.androidScreen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class ViewsScreen {
    public ViewsScreen(){

        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()),this);
    }
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Views']")
    public MobileElement viewsTitle;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Drag and Drop']")
    public MobileElement dragDropButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Switches']")
    public List<MobileElement> switchesButton;

}