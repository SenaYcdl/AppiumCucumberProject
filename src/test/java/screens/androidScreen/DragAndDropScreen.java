package screens.androidScreen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class DragAndDropScreen {
    public DragAndDropScreen() {

        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()), this);
    }

    @AndroidFindBy(id = "com.touchboarder.android.api.demos:id/drag_dot_1")
    public MobileElement firstDot;

    @AndroidFindBy(id = "com.touchboarder.android.api.demos:id/drag_dot_2")
    public MobileElement secondDot;

    @AndroidFindBy(id = "com.touchboarder.android.api.demos:id/drag_dot_3")
    public MobileElement thirdDot;

    @AndroidFindBy(id = "com.touchboarder.android.api.demos:id/drag_dot_hidden")
    public MobileElement hiddenDot;

}