package Selenium_For_PE;

import java.io.File;
import java.net.MalformedURLException;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Start_And_Stop_The_Appium_Server {

    static AppiumDriverLocalService server;
    static String mainJSpath = "C:/Users/user/AppData/Roaming/npm/node_modules/appium/build/lib/main.js";

    public static void start() {
        if (server == null) {
            AppiumServiceBuilder builder = new AppiumServiceBuilder();
            builder.withIPAddress("127.0.0.1")
                    .usingPort(4723)
                    .withAppiumJS(new File(mainJSpath))
                    .usingDriverExecutable(new File("C:/Program Files/nodejs/node.exe"));
            server = AppiumDriverLocalService.buildService(builder);
            server.start();
        }
    }

    public static void stop() {
        if (server.isRunning()) {
            server.stop();
            server = null;
        }
    }
    public static void main(String[] args) throws InterruptedException, MalformedURLException {
     	start();
		stop();
	}

}