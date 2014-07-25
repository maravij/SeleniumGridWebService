/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.seleniumGridUI.util;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author vkumar
 */
public class Constants {

    public final static String SELENIUM_JAVA_CLIENT_LOCATION = "\\\\filesrv\\public\\public files\\SeleniumSetUp\\selenium-server-standalone-2.42.0.jar";
    public final static String SELENIUM_CHROMEDRIVER_LOCATION = "\\\\filesrv\\public\\public files\\SeleniumSetUp\\ChromeDriver2.10\\chromedriver.exe";
    public final static String SELENIUM_IEDRIVER_LOCATION = "\\\\filesrv\\public\\public files\\SeleniumSetUp\\IEDriver2.42.0\\IEDriverServer.exe";
    public final static String SELENIUM_PHANTOMJS_LOCATION = "\\\\filesrv\\public\\public files\\SeleniumSetUp\\phantomjs-1.9.7\\phantomjs.exe";
    public final static String SELENROID_JAVA_CLIENT_LOCATION_WINDOWS = "\\\\filesrv\\public\\public files\\SeleniumSetUp\\selendroid-standalone-0.9.0-with-dependencies.jar";
    public final static String SELENIUM_REMOTE_WEBDRIVER_URL_FORMAT = "http://%s:%s/wd/hub";

    public final static List MAC_MACHINE = Arrays.asList("andreass-mbp.as24.local");
    public final static String SELENIUM_JAVA_CLIENT_LOCATION_MAC = "/Volumes/SeleniumSetUp/selenium-server-standalone-2.42.0.jar";
    //public final static String IOS_Driver_JAVA_CLIENT_LOCATION_MAC = "/Volumes/SeleniumSetUp/ios-server-standalone-0.6.6-SNAPSHOT.jar";
    public final static String IOS_Driver_JAVA_CLIENT_LOCATION_MAC = "Downloads/ios-server-standalone-0.6.6-SNAPSHOT.jar";
    public final static String SELENROID_JAVA_CLIENT_LOCATION_MAC = "/Volumes/SeleniumSetUp/selendroid-standalone-0.10.0-with-dependencies.jar";
    public final static String TEMP_FILE_LOCATION_MAC = "C:\\Temp";
    
    public final static String NETWORK_USER_NAME = "zzqaadmin";
    public final static String NETWORK_PASSWORD = "as24test";
    public final static String NETWORK_DOMAIN = "DEV";
}
