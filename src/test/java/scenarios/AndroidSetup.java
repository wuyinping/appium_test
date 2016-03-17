package scenarios;


import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AndroidSetup {
    protected AndroidDriver driver;
    String app_package_name = "com.duoku.platform.demo.single:id/";

    protected void prepareAndroidForAppium() throws MalformedURLException {
        File appDir = new File(System.getProperty("user.dir") + "/apps");
        File app = new File(appDir, "DKSingleSDK.apk");
//        File app = new File(appDir, "Flipkart.3.0.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("device","Android");

        //mandatory capabilities
        capabilities.setCapability("deviceName","Android");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","5.0");

        //other caps
        capabilities.setCapability("app", app.getAbsolutePath());
        driver =  new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
}
