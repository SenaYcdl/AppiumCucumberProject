package utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {
    private static AppiumDriver<MobileElement> appiumDriver;



    public static AppiumDriver getAppiumDriver()  {
        URL appiumServerURL = null;
        try {
            appiumServerURL = new URL("http:127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        if (appiumDriver == null) {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, ConfigReader.getProperty("automationName"));
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, ConfigReader.getProperty("platformName"));
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, ConfigReader.getProperty("platformVersion"));
            desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, ConfigReader.getProperty("deviceName"));
            desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\sena_\\IdeaProjects\\AppiumCucumber\\src\\apps\\apiDemos.apk");
            desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, true);
            desiredCapabilities.setCapability("autoAcceptAlert",true);
            desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"60000");

            if (ConfigReader.getProperty("platformName").equals("Android")) {

                assert appiumServerURL != null;
                appiumDriver = new AndroidDriver(appiumServerURL,desiredCapabilities);
            } else if (ConfigReader.getProperty("platformName").equals("iOS")) {
                assert appiumServerURL != null;
                appiumDriver = new IOSDriver(appiumServerURL,desiredCapabilities);
            } else {
                throw new UnsupportedOperationException("Invalid Platform Name " + ConfigReader.getProperty("platformName"));
            }
        }
        appiumDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return appiumDriver;
    }


    public static void quitAppiumDriver(){
        if (appiumDriver != null) {
            appiumDriver.quit();
            appiumDriver = null;
        }
    }
}