import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Day01_Calulator {

        @Test
        public void app() throws MalformedURLException {

            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability("platformName","Android");
            desiredCapabilities.setCapability("platformVersion","11.0");
            desiredCapabilities.setCapability("deviceName","PIXEL");
            desiredCapabilities.setCapability("automationName","UiAutomator2");
            desiredCapabilities.setCapability("app","/Users/gamlibaykus/Desktop/QA/Appium__/src/Apps/Calculator_8.3 (477856174)_Apkpure.apk");

            AndroidDriver<AndroidElement> driver =  new AndroidDriver<AndroidElement>(new URL("http:127.0.0.1:4723/wd/hub"),desiredCapabilities);

            //ıd kullanarak locate'ler alindi
            driver.findElementById("com.google.android.calculator:id/digit_9").click(); // 9 rakamina tiklandi
            driver.findElementById("com.google.android.calculator:id/op_mul").click(); // X isaretine tiklandi
            driver.findElementById("com.google.android.calculator:id/digit_9").click(); //9 rakamina tiklandi
            driver.findElementById("com.google.android.calculator:id/eq").click(); // = isaretine tiklandi
            String actualSonuc = driver.findElementById("com.google.android.calculator:id/result_final").getText();
            String expectedSonuc = "81";
            Assert.assertEquals(actualSonuc , expectedSonuc);

            //
            driver.findElementByAccessibilityId("7").click(); // 7 rakamina tiklandi


        }

}
