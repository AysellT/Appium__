import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class HepsiBurada {

    @Test
    public void setUp() throws MalformedURLException, InterruptedException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName","Android");
        caps.setCapability("platformVersion","11.0");
        caps.setCapability("deviceName","PIXEL");
        caps.setCapability("automationName","UiAutomator2");
        caps.setCapability("app","/Users/gamlibaykus/Desktop/QA/Appium__/src/Apps/Hepsiburada_ Online Shopping_5.7.1_Apkpure.apk");

        AndroidDriver<AndroidElement> driver =  new AndroidDriver<AndroidElement>(new URL("http:127.0.0.1:4723/wd/hub"),caps);
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

        driver.findElement(By.id("com.pozitron.hepsiburada:id/etSearchBox")).click();
        driver.findElement(By.id("com.pozitron.hepsiburada:id/etSearchBox")).sendKeys("iphone 14" );
        driver.findElement(By.id("com.pozitron.hepsiburada:id/search_suggestion_title")).click();

    }
}

