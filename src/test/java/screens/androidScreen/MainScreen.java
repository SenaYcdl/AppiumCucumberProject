package screens.androidScreen;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;


import java.time.Duration;

public class MainScreen {
    public MainScreen(){

        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)),this);
    }

    @AndroidFindBy(xpath = "(//android.widget.ImageView)[1]")
    public MobileElement mainScreenTitle;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='API Demos']")
    public MobileElement apiDemosButton;


    public boolean isMainScreenDisplayed(){

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return mainScreenTitle.isDisplayed();
    }
}