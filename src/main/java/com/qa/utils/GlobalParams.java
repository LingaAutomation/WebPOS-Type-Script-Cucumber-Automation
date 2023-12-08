package com.qa.utils;

import java.io.IOException;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.util.Random;


public class GlobalParams {
//    private static ThreadLocal<String> platformName = new ThreadLocal<String>();
//    private static ThreadLocal<String> udid = new ThreadLocal<String>();
//    private static ThreadLocal<String> deviceName = new ThreadLocal<String>();
//    private static ThreadLocal<String> systemPort = new ThreadLocal<String>();
//    private static ThreadLocal<String> chromeDriverPort = new ThreadLocal<String>();
//    private static ThreadLocal<String> wdaLocalPort = new ThreadLocal<String>();
//    private static ThreadLocal<String> webkitDebugProxyPort = new ThreadLocal<String>();
//
//    public void setPlatformName(String platformName1){
//        platformName.set(platformName1);
//    }
//
//    public String getPlatformName(){
//        return platformName.get();
//    }
//
//    public String getUDID() {
//        return udid.get();
//    }
//
//    public void setUDID(String udid2) {
//        udid.set(udid2);
//    }
//
//    public String getDeviceName() {
//        return deviceName.get();
//    }
//
//    public void setDeviceName(String deviceName2) {
//        deviceName.set(deviceName2);
//    }
//
//    public String getSystemPort() {
//        return systemPort.get();
//    }
//
//    public void setSystemPort(String systemPort2) {
//        systemPort.set(systemPort2);
//    }
//
//    public String getChromeDriverPort() {
//        return chromeDriverPort.get();
//    }
//
//    public void setChromeDriverPort(String chromeDriverPort2) {
//        chromeDriverPort.set(chromeDriverPort2);
//    }
//
//    public String getWdaLocalPort() {
//        return wdaLocalPort.get();
//    }
//
//    public void setWdaLocalPort(String wdaLocalPort2) {
//        wdaLocalPort.set(wdaLocalPort2);
//    }
//
//    public String getWebkitDebugProxyPort() {
//        return webkitDebugProxyPort.get();
//    }
//
//    public void setWebkitDebugProxyPort(String webkitDebugProxyPort2) {
//        webkitDebugProxyPort.set(webkitDebugProxyPort2);
//    }
//    public static boolean available(int port) {
//        if (port < 4000 || port > 11100) {
//            throw new IllegalArgumentException("Invalid start port: " + port);
//        }
//
//        ServerSocket ss = null;
//        DatagramSocket ds = null;
//        try {
//            ss = new ServerSocket(port);
//            ss.setReuseAddress(true);
//            ds = new DatagramSocket(port);
//            ds.setReuseAddress(true);
//            return true;
//        } catch (IOException e) {
//        } finally {
//            if (ds != null) {
//                ds.close();
//            }
//
//            if (ss != null) {
//                try {
//                    ss.close();
//                } catch (IOException e) {
//                   // should not be thrown
//                }
//            }
//        }
//        return false;
//    }
//
//
//    public void initializeGlobalParams(){
//        GlobalParams params = new GlobalParams();
//        params.setPlatformName(System.getProperty("platformName", "iOS"));
////        params.setUDID(System.getProperty("udid", "00008020-0015790C26A2402E"));
////        params.setDeviceName(System.getProperty("deviceName", "Linga"));//
//        params.setUDID(System.getProperty("udid", "00008020-0015790C26A2402E"));
//        params.setDeviceName(System.getProperty("deviceName", "Ragav's 1"));//
////        params.setUDID(System.getProperty("udid", "00008020-000E713E0E3B402E"));
////        params.setDeviceName(System.getProperty("deviceName", "iPad2"));//
////        params.setUDID(System.getProperty("udid", "00008030-00022C1E2207402E"));
////        params.setDeviceName(System.getProperty("deviceName", "iPad3"));//
//
//        switch(params.getPlatformName()){
//            case "Android":
//                params.setSystemPort(System.getProperty("systemPort", "10000"));
//                params.setChromeDriverPort(System.getProperty("chromeDriverPort", "11000"));
//                break;
//            case "iOS":
//                Random r = new Random();
//                int low = 4000;
//                int high = 11000;
//                int result = r.nextInt(high-low) + low;
//                if(available(result))
//                {
//                    String numb = String.valueOf(result);
//                    TestUtils utils=new TestUtils();
//                    utils.log().info("PORT Number is - "+numb);
//                    params.setWdaLocalPort(System.getProperty("wdaLocalPort", numb));
//                    params.setWebkitDebugProxyPort(System.getProperty("appium:webkitDebugProxyPort", "11000"));
//                }
//                else {
//
//                    initializeGlobalParams();
//
////                    params.setWdaLocalPort(System.getProperty("wdaLocalPort", numb));
////                    params.setWebkitDebugProxyPort(System.getProperty("appium:webkitDebugProxyPort", "11001"));
//                }
//                break;
//            default:
//                throw new IllegalStateException("Invalid Platform Name!");
//        }
//    }
}