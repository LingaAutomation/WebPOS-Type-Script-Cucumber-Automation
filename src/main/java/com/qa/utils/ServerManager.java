package com.qa.utils;



import java.io.File;
import java.util.HashMap;


public class ServerManager {
//    private static ThreadLocal<AppiumDriverLocalService> server = new ThreadLocal<>();
//    TestUtils utils = new TestUtils();
//
//    public AppiumDriverLocalService getServer(){
//        return server.get();
//    }
//
//
//    public void startServer(){
//        utils.log().info("starting appium server...");
//        AppiumDriverLocalService server = MacGetAppiumService();
//        server.start();
//        if(server == null || !server.isRunning()){
////            utils.log().fatal("Appium server not started. ABORT!!!");
//            throw new AppiumServerHasNotBeenStartedLocallyException("Appium server not started. ABORT!!!!");
//        }
//        //    server.clearOutPutStreams();
//        this.server.set(server);
//        utils.log().info("Appium server started...");
//    }
//
//    public AppiumDriverLocalService getAppiumServerDefault(){
//        return AppiumDriverLocalService.buildDefaultService();
//    }
//
//    public AppiumDriverLocalService MacGetAppiumService(){
//        GlobalParams params = new GlobalParams();
//        HashMap<String, String> environment = new HashMap<String, String>();
//        environment.put("PATH", "/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/bin:usr/local/bin:/usr/bin:/bin:/usr/sbin:/sbin:/usr/local/go/bin:/Library/Apple/usr/bin:/Users/enginbasaran/Library/Android/sdk/emulator:/Users/enginbasaran/Library/Android/sdk/tools:/Users/enginbasaran/Library/Android/sdk/tools/bin:/Users/enginbasaran/Library/Android/sdk/platform-tools");
//        environment.put("ANDROID_HOME", "/Users/enginbasaran/Library/Android/sdk");
//        environment.put("JAVA_HOME", "/Library/Java/JavaVirtualMachines/jdk-11.0.16.1.jdk/Contents/Home");
//        return AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
//                .usingDriverExecutable(new File("/opt/homebrew/bin/node" ))
//                .withAppiumJS(new File("/opt/homebrew/lib/node_modules/appium/build/lib/main.js"))
//                .usingAnyFreePort()
//                .withArgument(GeneralServerFlag.SESSION_OVERRIDE)
//                .withLogFile(new File(params.getPlatformName() + "_"
//                        + params.getDeviceName() + File.separator + "Server.log")));
//    }
}




