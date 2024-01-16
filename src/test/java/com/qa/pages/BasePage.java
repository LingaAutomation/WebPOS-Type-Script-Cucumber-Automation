package com.qa.pages;

import com.qa.utils.TestUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class BasePage extends TGglobalElement {
    public WebDriver driver;
    TestUtils utils = new TestUtils();

    public BasePage() {

            this.driver = DriverSteup.driver;

           PageFactory.initElements(driver, this);
    }

    public void waitForVisibility(WebElement e) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(e));
    }

    public void waitForVisibility(By e) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(e));
    }

    public void clear(WebElement e) {
        waitForVisibility(e);
        e.clear();
    }

    public void click(WebElement e) {
        waitForVisibility(e);
        e.click();
    }

    public void click(WebElement e, String msg) {
//        waitForVisibility(e);
//        utils.log().info(msg);
        e.click();
    }

    public void click(By e, String msg) {
        waitForVisibility(e);
        utils.log().info(msg);
        driver.findElement(e).click();
    }

    public void sendKeys(WebElement e, String txt) {
        // waitForVisibility(e);
        e.sendKeys(txt);
    }

    public void sendKeys(WebElement e, String txt, String msg) {
        //waitForVisibility(e);
//        utils.log().info(msg);
        e.sendKeys(txt);
    }

    public String getAttribute(WebElement e, String attribute) {
        waitForVisibility(e);
        return e.getAttribute(attribute);
    }

    public String getAttribute(By e, String attribute) {
        waitForVisibility(e);
        return driver.findElement(e).getAttribute(attribute);
    }

    public String getText(WebElement e, String msg) {
        String txt;

                txt = e.getText();
//        utils.log().info(msg + txt);
        return txt;
    }

//    public String getText(By e, String msg) {
//        String txt;
//        switch (new GlobalParams().getPlatformName()) {
//            case "Android":
//                txt = getAttribute(e, "text");
//                break;
//            case "iOS":
//                txt = getAttribute(e, "label");
//                break;
//            default:
//                throw new IllegalStateException("Unexpected value: " + new GlobalParams().getPlatformName());
//        }
//        utils.log().info(msg + txt);
//        return txt;
//    }

//    public void closeApp() {
//        ((InteractsWithApps) driver).closeApp();
//    }

//    public void launchApp() {
//        ((InteractsWithApps) driver).launchApp();
//    }

//    public WebElement andScrollToElementUsingUiScrollable(String childLocAttr, String childLocValue) {
//        return (WebElement) (driver).findElementByAndroidUIAutomator(
//                "new UiScrollable(new UiSelector()" + ".scrollable(true)).scrollIntoView("
//                        + "new UiSelector()." + childLocAttr + "(\"" + childLocValue + "\"));");
//    }

//    public WebElement iOSScrollToElementUsingMobileScroll(WebElement e) {
//        RemoteWebElement element = ((RemoteWebElement) e);
//        String elementID = element.getId();
//        HashMap<String, String> scrollObject = new HashMap<String, String>();
//        scrollObject.put("element", elementID);
////	  scrollObject.put("direction", "down");
////	  scrollObject.put("predicateString", "label == 'ADD TO CART'");
////	  scrollObject.put("name", "test-ADD TO CART");
//        scrollObject.put("toVisible", "sdfnjksdnfkld");
////        driver.executeScript("mobile:scroll", scrollObject);
//        return e;
//    }

//    public By iOSScrollToElementUsingMobileScrollParent(WebElement parentE, String predicateString) {
//        RemoteWebElement parent = (RemoteWebElement) parentE;
//        String parentID = parent.getId();
//        HashMap<String, String> scrollObject = new HashMap<String, String>();
//        scrollObject.put("element", parentID);
////	  scrollObject.put("direction", "down");
//        scrollObject.put("predicateString", predicateString);
////	  scrollObject.put("name", "test-ADD TO CART");
////        scrollObject.put("toVisible", "sdfnjksdnfkld");
////        driver.executeScript("mobile:scroll", scrollObject);
//        By m = MobileBy.iOSNsPredicateString(predicateString);
//        System.out.println("Mobilelement is " + m);
//        return m;
//    }


    public WebElement scrollToElement(WebElement element, String direction) throws Exception {
        Dimension size = driver.manage().window().getSize();
        int startX = (int) (size.width * 0.5);
        int endX = (int) (size.width * 0.5);
        int startY = 0;
        int endY = 0;
        boolean isFound = false;

        switch (direction) {
            case "up":
                endY = (int) (size.height * 0.4);
                startY = (int) (size.height * 0.6);
                break;

            case "down":
                endY = (int) (size.height * 0.6);
                startY = (int) (size.height * 0.4);
                break;
        }

        for (int i = 0; i < 5; i++) {
            if (find(element, 1)) {
                isFound = true;
                break;
            } else {
                swipe(startX, startY, endX, endY, 800);
            }
        }
        if (!isFound) {
            throw new Exception("Element not found");
        }
        return element;
    }

    public By scrollToElement(By element, String direction) throws Exception {
        Dimension size = driver.manage().window().getSize();
        int startX = (int) (size.width * 0.5);
        int endX = (int) (size.width * 0.5);
        int startY = 0;
        int endY = 0;
        boolean isFound = false;

        switch (direction) {
            case "up":
                endY = (int) (size.height * 0.4);
                startY = (int) (size.height * 0.6);
                break;

            case "down":
                endY = (int) (size.height * 0.6);
                startY = (int) (size.height * 0.4);
                break;
        }

        for (int i = 0; i < 5; i++) {
            if (find(element, 1)) {
                isFound = true;
                break;
            } else {
                swipe(startX, startY, endX, endY, 1000);
            }
        }
        if (!isFound) {
            throw new Exception("Element not found");
        }
        return element;
    }

    public boolean find(final WebElement element, int timeout) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
            return wait.until(new ExpectedCondition<Boolean>() {
                @Override
                public Boolean apply(WebDriver driver) {
                    if (element.isDisplayed()) {
                        return true;
                    }
                    return false;
                }
            });
        } catch (Exception e) {
            return false;
        }
    }

    public boolean find(final By element, int timeout) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
            return wait.until(new ExpectedCondition<Boolean>() {
                @Override
                public Boolean apply(WebDriver driver) {
                    if (driver.findElement(element).isDisplayed()) {
                        return true;
                    }
                    return false;
                }
            });
        } catch (Exception e) {
            return false;
        }
    }

    public void swipe(int startX, int startY, int endX, int endY, int millis) throws InterruptedException {
//        TouchAction t = new TouchAction((PerformsTouchActions) driver);
//        t.press(point(startX, startY)).waitAction(waitOptions(ofMillis(millis))).moveTo(point(endX, endY)).release()
//                .perform();
        JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("window.scrollBy(0,350)", "");
    }

//    public String elementGetText(WebElement e, String msg) {
//        String txt;
//        switch (new GlobalParams().getPlatformName()) {
//            case "Android":
//                txt = e.getAttribute("text");
//                break;
//            case "iOS":
//                txt = e.getAttribute("label");
//                break;
//            default:
//                throw new IllegalStateException("Unexpected value: " + new GlobalParams().getPlatformName());
//        }
//        utils.log().info(msg + txt);
//
//        return txt;
//    }

    public void elementClick(WebElement e, String msg) {

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(e));
        e.click();
       // try{
//        utils.log().info(msg);
//         }catch (Exception execp){
//         execp.printStackTrace();
//        }
    }
public void findAndClickMobileElement(String selectorPath,String injector, String selectorName) throws Exception {
//    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));



//    String elementXPath = utils.stringFormatInjector(selectorPath, injector);
//    switch (selectorName) {
//        case TestUtils.XPath:
//            try {
//
//                wait.until(ExpectedConditions.elementToBeClickable(By.id(elementXPath)));
//
//                if (!driver.findElements(By.xpath(elementXPath)).isEmpty()) {
//
////                        wait.until(ExpectedConditions.elementToBeClickable((By.xpath(elementXPath))));
//                    driver.findElementByXPath(elementXPath).click();
//
//
//                } else {
//
//                        wait.until(ExpectedConditions.elementToBeClickable((By.xpath(elementXPath))));
//                   scrollToElementCategory("up");
//                    Thread.sleep(500);
//                    driver.findElementByXPath(elementXPath).click();
//
//                }
//            } catch (Exception e) {
//                scrollToElementCategory("down");
//                driver.findElementByXPath(elementXPath).click();
////                utils.log().info("Xpath" +  String.valueOf(element) + "element not found");
//
//            }
//            break;
//        case TestUtils.Accessibility:
//            try {
//                wait.until(ExpectedConditions.elementToBeClickable(By.id(elementXPath)));
//
//                if (!driver.findElements(By.xpath(elementXPath)).isEmpty()) {
//                    //                       wait.until(ExpectedConditions.elementToBeClickable((By.xpath(elementXPath))));
//                    driver.findElementByXPath(elementXPath).click();
//
//                } else {
//                    scrollToElementCategory("up");
//                    wait.until(ExpectedConditions.elementToBeClickable(By.id(elementXPath)));
//                    driver.findElementByXPath(elementXPath).click();
//
//
//                }
//            } catch (Exception e) {
//              scrollToElementCategory("up");
//                    wait.until(ExpectedConditions.elementToBeClickable(By.id(elementXPath)));
//                    driver.findElementByXPath(elementXPath).click();
//            }
//            break;
//        default:
//            utils.log().info("please choose correct selector as mentioned in TestUtils constants");
//            break;
//
//    }
}

    public void  findandclick(String selectorPath, String injector, String selectorName) {

//        WebElement element;
//        WebDriverWait wait = new WebDriverWait(driver, TestUtils.driverWAIT);
//        String elementXPath = utils.stringFormatInjector(selectorPath, injector);
//        switch (selectorName) {
//            case TestUtils.XPath:
//                try {
//
//                    wait.until(ExpectedConditions.elementToBeClickable((By.xpath(elementXPath))));
//
//                    if (!driver.findElements(By.xpath(elementXPath)).isEmpty()) {
//
////                        wait.until(ExpectedConditions.elementToBeClickable((By.xpath(elementXPath))));
//                        driver.findElementByXPath(elementXPath).click();
//
//
//                    } else {
//
////                        wait.until(ExpectedConditions.elementToBeClickable((By.xpath(elementXPath))));
//
//                        Thread.sleep(1000);
//                            driver.findElementByXPath(elementXPath).click();
//
//                    }
//                } catch (Exception e) {
//
//                    utils.log().info("Xpath" + elementXPath + "element not found");
//
//                }
//                break;
//            case TestUtils.Accessibility:
//                try {
//                    wait.until(ExpectedConditions.elementToBeClickable((By.id(elementXPath))));
//
//                    if (!driver.findElements(By.id(elementXPath)).isEmpty()) {
//                        //                       wait.until(ExpectedConditions.elementToBeClickable((By.xpath(elementXPath))));
//                            driver.findElement(By.id(elementXPath)).click();
//
//                    } else {
//
//                        wait.until(ExpectedConditions.elementToBeClickable((By.id(elementXPath))));
//                            driver.findElement(By.id(elementXPath)).click();
//
//
//                    }
//                } catch (Exception e) {
//                    utils.log().info("Xpath" + elementXPath + "element not found");
//
//                }
//                break;
//            default:
//                utils.log().info("please choose correct selector as mentioned in TestUtils constants");
//                break;
//
//        }
    }


    public String findAndGetText(String selectorPath, String injector, String selectorName) {
        String text="";
//        WebElement element;
//        WebDriverWait wait = new WebDriverWait(driver, TestUtils.driverWAIT);
//        String elementXPath = utils.stringFormatInjector(selectorPath, injector);
//        switch (selectorName) {
//            case TestUtils.XPath:
//                try {
//
//                    wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(elementXPath))));
//
//                    if (!driver.findElements(By.xpath(elementXPath)).isEmpty()) {
//
////                        wait.until(ExpectedConditions.elementToBeClickable((By.xpath(elementXPath))));
//                         text=driver.findElementByXPath(elementXPath).getText();
//
//
//                    } else {
//
////                        wait.until(ExpectedConditions.elementToBeClickable((By.xpath(elementXPath))));
//
//                        Thread.sleep(1000);
//                         text=driver.findElementByXPath(elementXPath).getText();
//
//                    }
//                } catch (Exception e) {
//
//                    utils.log().info("Xpath" + elementXPath + "element not found");
//
//                }
//                break;
//            case TestUtils.Accessibility:
//                try {
//                    wait.until(ExpectedConditions.visibilityOfElementLocated((By.id(elementXPath))));
//
//                    if (!driver.findElements(By.id(elementXPath)).isEmpty()) {
//                        //                       wait.until(ExpectedConditions.elementToBeClickable((By.xpath(elementXPath))));
//                         text=driver.findElement(By.id(elementXPath)).getText();
//
//                    } else {
//
//                        wait.until(ExpectedConditions.elementToBeClickable((By.id(elementXPath))));
//                         text=driver.findElement(By.id(elementXPath)).getText();
//
//
//                    }
//                } catch (Exception e) {
//                    utils.log().info("Xpath" + elementXPath + "element not found");
//
//                }
//                break;
//            default:
//                utils.log().info("please choose correct selector as mentioned in TestUtils constants");
//                break;
//
//        }
        return text;
    }



    public void  findandclick_Skeys(String selectorPath, String injector, String selectorName,String KeyVal,String keyText) {

//        WebElement element;
//        WebDriverWait wait = new WebDriverWait(driver, TestUtils.driverWAIT);
//        String elementXPath = utils.stringFormatInjector(selectorPath, injector);
//        switch (selectorName) {
//            case TestUtils.XPath:
//                try {
//
//                    wait.until(ExpectedConditions.elementToBeClickable((By.xpath(elementXPath))));
//
//                    if (!driver.findElements(By.xpath(elementXPath)).isEmpty()) {
//
////                        wait.until(ExpectedConditions.elementToBeClickable((By.xpath(elementXPath))));
//                        if(KeyVal!="SKeys"){
//                            driver.findElementByXPath(elementXPath).click();
//                        }else{
//                            driver.findElementByXPath(elementXPath).sendKeys(keyText);
//
//                        }
//
//                    } else {
//
////                        wait.until(ExpectedConditions.elementToBeClickable((By.xpath(elementXPath))));
//
//                        Thread.sleep(1000);
//                        if(KeyVal!="SKeys"){
//                            driver.findElementByXPath(elementXPath).click();
//                        }else{
//                            driver.findElementByXPath(elementXPath).sendKeys(keyText);
//
//                        }
//                    }
//                } catch (Exception e) {
//
//                    utils.log().info("Xpath" + elementXPath + "element not found");
//
//                }
//                break;
//            case TestUtils.Accessibility:
//                try {
//                    wait.until(ExpectedConditions.elementToBeClickable((By.id(elementXPath))));
//
//                    if (!driver.findElements(By.id(elementXPath)).isEmpty()) {
//                        //                       wait.until(ExpectedConditions.elementToBeClickable((By.xpath(elementXPath))));
//                        if(KeyVal!="SKeys"){
//                            driver.findElement(By.id(elementXPath)).click();
//                        }else{
//                            driver.findElement(By.id(elementXPath)).sendKeys(keyText);
//
//                        }
//                    } else {
//
//                        wait.until(ExpectedConditions.elementToBeClickable((By.id(elementXPath))));
//                        if(KeyVal!="SKeys"){
//                            driver.findElement(By.id(elementXPath)).click();
//                        }else{
//                            driver.findElement(By.id(elementXPath)).sendKeys(keyText);
//                        }
//
//                    }
//                } catch (Exception e) {
//                    utils.log().info("Xpath" + elementXPath + "element not found");
//
//                }
//                break;
//            default:
//                utils.log().info("please choose correct selector as mentioned in TestUtils constants");
//                break;
//
//        }
    }

    public void  findandclickM(By selectorPath) {
//        WebElement element;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TestUtils.driverWAIT));
                try {

                    wait.until(ExpectedConditions.elementToBeClickable(selectorPath));

                    if (!driver.findElements(selectorPath).isEmpty()) {

//                        wait.until(ExpectedConditions.elementToBeClickable((By.xpath(elementXPath))));

                        driver.findElement(selectorPath).click();

                    } else {

//                        wait.until(ExpectedConditions.elementToBeClickable((By.xpath(elementXPath))));

                        Thread.sleep(1000);
                        driver.findElement(selectorPath).click();

                    }
                } catch (Exception e) {

                    utils.log().info("Xpath" + selectorPath + "element not found");

        }
    }

    public String  findAndGetTextM(By selectorPath) {
//        WebElement element;
        String text="";
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TestUtils.driverWAIT));
        try {

            wait.until(ExpectedConditions.visibilityOfElementLocated(selectorPath));

            if (!driver.findElements(selectorPath).isEmpty()) {

//                        wait.until(ExpectedConditions.elementToBeClickable((By.xpath(elementXPath))));

                text=driver.findElement(selectorPath).getText();

            } else {

//                        wait.until(ExpectedConditions.elementToBeClickable((By.xpath(elementXPath))));

                Thread.sleep(10000);
                text=driver.findElement(selectorPath).getText();

            }
        } catch (Exception e) {

            utils.log().info("Xpath" + selectorPath + "element not found");

        }
        return text;
    }

    // Function to merge partial xpath and related injector (name,value,etc)
    public WebElement mergeAndFindElement(String selectorPath, String injector, String selectorName) {

            WebElement element = FindAndSelectElement(selectorPath, injector, selectorName, 0);

        return element;
    }

    // Method to find and get the element
    public WebElement FindAndSelectElement(String selectorPath, String injector,
                                              String selectorName, int iteration) {
        WebElement element=findElement(selectorPath, injector, selectorName);


        return element;
    }

    public void SelectPickerWheelValue(String pickerClass, String selectedText, TestUtils.Order order, String msg) {
        // find pickerWheel
//        WebElement pickerWheel = (WebElement) driver.findElementByXPath(pickerClass);
//
//        // limit search time to avoid infinite loops
//        String resultText;
//        boolean isDisplayed = false;
//        Long startTime = System.currentTimeMillis() + 30 * 1000; // 30 sec MAX
//        do {
//            resultText = pickerWheel.getText();
//
//            if (resultText.equals(selectedText)) {
//                isDisplayed = true;
//
//            } else {
//                if (!selectPickerWheelInIOS(pickerWheel, order)) {
//                    isDisplayed = false;
//                }
//            }
//        } while (!isDisplayed && System.currentTimeMillis() < startTime); // 30 sec MAX
//
//        if (!isDisplayed) {
//            utils.log().info("The expected text is not available. Expected Text: " +
//                    selectedText + ", Moving order:" + order.name().toLowerCase());
//        } else {
//            utils.log().info(msg);
//        }
    }

//    public boolean selectPickerWheelInIOS(WebElement element, TestUtils.Order order) {
//        HashMap<String, Object> pickerOptions = new HashMap<>();
//        pickerOptions.put("order", order.name().toLowerCase());
//        pickerOptions.put("offset", "0.1"); // tap offset
//        pickerOptions.put("element", element.getId()); // pickerWheel element
//        try {
//            driver.executeScript("mobile: selectPickerWheelValue", pickerOptions);
//            return true;
//        } catch (Exception ex) {
//            // skip the exception
//        }
//        return false;
//    }



    public List<WebElement> selectAndFindElements(String selectorPath) {
        List<WebElement> elements = FindAndSelectElements(selectorPath,0);
//        //Wait default
//        int iteration = 1;
//        do {
//            try {
//                if (iteration != 1) {
//                    // wait 1 sec
//                    Thread.sleep(1000);
//                }
//            } catch (InterruptedException e) {
//                // handling InterruptedException
//            }
//
//            iteration++;
//            // Get the element
//            elements = FindAndSelectElements(selectorPath,iteration);
//        } while (elements == null && iteration < TestUtils.driverWAIT);

        return elements;


    }

    public List<WebElement> FindAndSelectElements(String selectorPath, int iteration) {
        List<WebElement> elements = findElements(selectorPath);

//        try {
//            // Get the element
//            elements = findElements(selectorPath);
//        } catch (Exception ex) {
//
//            if (iteration == TestUtils.driverWAIT) {
//                // log the exception
//                utils.log().info(ex.getMessage());
//            }
//
//            elements = null;
//        }

        return elements;
    }

    public List<WebElement> findElements(String selectorPath) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TestUtils.driverWAIT));
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(selectorPath))));

        List<WebElement> elements = (List<WebElement>) driver.findElements(By.xpath(selectorPath));
        return elements;
    }


    // Method to find the element
    public WebElement findElement(String selectorPath, String injector, String selectorName) {
        WebElement element = null;
//        WebDriverWait wait = new WebDriverWait(driver, TestUtils.driverWAIT);
//        String elementXPath = utils.stringFormatInjector(selectorPath, injector);
//        switch (selectorName) {
//            case TestUtils.XPath:
//                try {
//
//                    element = (WebElement) driver.findElementByXPath(elementXPath);
//
//                    if(!driver.findElements(By.xpath(elementXPath)).isEmpty()) {
//                        wait.until(ExpectedConditions.elementToBeClickable((By.xpath(elementXPath))));
//                        return element;
//                    }
//
//                    else
//                    {
//
//                        wait.until(ExpectedConditions.elementToBeClickable((By.xpath(elementXPath))));
//                        driver.findElement(By.xpath(elementXPath));
//                        return element;
//                    }
//                }catch(Exception e){
//                    utils.log().info("element not found");
//                    element = (WebElement) wait.until(new Function<WebDriver,WebElement>() {
//                        public WebElement apply(WebDriver arg0) {
//                            return driver.findElement(By.xpath(elementXPath));}
//                    });
//                }
//
//                break;
//            case TestUtils.Accessibility:
//                String accXPath = utils.stringFormatInjector(selectorPath, injector);
//                try {
//
////                    wait.until(ExpectedConditions.visibilityOfElementLocated((By.name(accXPath))));
//                    element = (WebElement) driver.findElementByAccessibilityId(accXPath);
//
//                    if(!driver.findElements(By.id(accXPath)).isEmpty()) {
//                        wait.until(ExpectedConditions.elementToBeClickable((By.id(accXPath))));
//                        return element;
//                    }
//
//                    else
//                    {
//
////                        Thread.sleep(1000);
//
////                        wait.until(ExpectedConditions.visibilityOfElementLocated((By.name(accXPath))));
//                        wait.until(ExpectedConditions.elementToBeClickable((By.id(accXPath))));
//
//                        driver.findElement(By.id(accXPath));
//                        return element;
//                    }
//                }
//                catch(Exception e){
//                        utils.log().info("element not found");
//                        element = (WebElement) wait.until(new Function<WebDriver,WebElement>() {
//                            public WebElement apply(WebDriver arg0) {
//                                return driver.findElementByAccessibilityId(accXPath);}
//                        });
//                    }
//                break;
//            case TestUtils.Name:
//                String elmName = utils.stringFormatInjector(selectorPath, injector);
//                wait.until(ExpectedConditions.visibilityOfElementLocated((By.name(elmName))));
//                element = (WebElement) driver.findElementByName(elmName);
//                break;
//            default:
//                element = null;
//                utils.log().info("please choose correct selector as mentioned in TestUtils constants");
//                break;
//        }

        return element;
    }

    public WebElement scrollToElementPayments(WebElement element, String direction) throws Exception {

            Dimension size = driver.manage().window().getSize();
            int startX = (int) (size.width * 0.5);
            int endX = (int) (size.width * 0.5);
            int startY = 0;
            int endY = 0;
            boolean isFound = false;

            switch (direction) {
                case "up":
                    endY = (int) (size.height * 0.4);
                    startY = (int) (size.height * 0.6);
                    break;

                case "down":
                    endY = (int) (size.height * 0.6);
                    startY = (int) (size.height * 0.4);
                    break;
            }

            for (int i = 0; i < 6; i++) {
                if (find(element, 1)) {
                    isFound = true;
                    break;
                } else {
                    swipe(startX, startY, endX, endY, 800);
                }
            }
            if (!isFound) {
                throw new Exception("Element not found");
            }
            return element;
        }


    public void scrollToElementCategory(String direction) throws Exception {
        Dimension size = driver.manage().window().getSize();
        int startX = (int) (size.width * 0.5);
        int endX = (int) (size.width * 0.5);
        int startY = 0;
        int endY = 0;

        switch (direction) {
            case "up":
                endY = (int) (size.height * 0.2);
                startY = (int) (size.height * 0.4);
                break;

            case "down":
                endY = (int) (size.height * 0.6);
                startY = (int) (size.height * 0.4);
                break;
        }
        swipe(startX, startY, endX, endY, 200);
    }

    public void scrollToElementPayments(String direction) throws Exception {
        Dimension size = driver.manage().window().getSize();
        int startX = (int) (size.width * 0.5);
        int endX = (int) (size.width * 0.5);
        int startY = 0;
        int endY = 0;

        switch (direction) {
            case "up":
                endY = (int) (size.height * 0.2);
                startY = (int) (size.height * 0.4);
                break;

            case "down":
                endY = (int) (size.height * 0.6);
                startY = (int) (size.height * 0.4);
                break;
        }
        swipe(startX, startY, endX, endY, 100);
    }

    public boolean isElementExists() {
        try {
            driver.getTitle().wait();
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    // Function to merge partial xpath and related injector (name,value,etc)
    public WebElement mergeAndFindMobileElement(By selectorPath) {
        WebElement element = FindAndSelectMobileElement( selectorPath, 0);

//        //Wait default
//        int iteration = 1;
//        do {
//            try {
//                if (iteration != 1) {
//                    // wait 1 sec
//                    Thread.sleep(1000);
//                }
//            } catch (InterruptedException e) {
//                // handling InterruptedException
//            }
//
//            iteration++;
//            // Get the element
//            element = FindAndSelectMobileElement( selectorPath, iteration);
//        } while (element == null && iteration < TestUtils.driverWAIT);

        return element;
    }

    // Method to find and get the element
    public WebElement FindAndSelectMobileElement(By selectorPath, int iteration) {
        WebElement element = findMobileElement(selectorPath);

//        try {
//            // Get the element
//            element = findMobileElement(selectorPath);
//        } catch (Exception ex) {
//
//            if (iteration == TestUtils.driverWAIT) {
//                // log the exception
//                utils.log().info(ex.getMessage());
//            }
//
//            element = null;
//        }

        return element;
    }

    // Method to find the element
    public WebElement findMobileElement(By selectorPath) {

//        WebElement element;
////        String elementXPath = utils.stringFormatInjector(selectorPath);
//        WebDriverWait wait = new WebDriverWait(driver, TestUtils.driverWAIT);
//
//        try{
//
////        wait.until(ExpectedConditions.visibilityOfElementLocated(selectorPath));
//
//        element = (WebElement) driver.findElement(selectorPath);
//            if(!driver.findElements(selectorPath).isEmpty()) {
//                wait.until(ExpectedConditions.elementToBeClickable(selectorPath));
//                return element;
//            }
//
//            else
//            {
//                wait.until(ExpectedConditions.elementToBeClickable(selectorPath));
//                driver.findElement(selectorPath);
//                return element;
//            }
//
//
//        }
//        catch (Exception e) {
//
//            utils.log().info("element not found");
//            element = (WebElement) wait.until(new Function<WebDriver,WebElement>() {
//                public WebElement apply(WebDriver arg0) {
//                    return driver.findElement(selectorPath);}
//            });
//
//        }
//


        //coded on 11 December - Author Sridhar
        /*try {

            wait.until(ExpectedConditions.visibilityOfElementLocated(selectorPath));
            element = (WebElement) driver.findElement(selectorPath);

        }
        catch(Exception e){
            utils.log().info("element not found");
            element = (WebElement) wait.until(new Function<WebDriver,WebElement>() {
                public WebElement apply(WebDriver arg0) {
                    return driver.findElement(selectorPath);}
            });
        }*/
        WebElement element;
//        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TestUtils.driverWAIT));
            wait.until(ExpectedConditions.visibilityOfElementLocated(selectorPath));


            element = (WebElement) driver.findElement(selectorPath);

            
//        }
////        return element;
//        catch (Exception e) {
//             utils.log().info(selectorPath + " is not displayed ");
//
//        }
        return element;
    }

    public String elementGetText(WebElement e, String text) {
        return e.getText();
    }

    public void listScroller(String accessibilityId, int startX, int startY, int endX, int endY, int millis) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TestUtils.driverWAIT));
        int iteration = 0;
        boolean isVisible = false;

        while (!isVisible && iteration < 10) {
            try {
                iteration++;
                // Check mobile element visibility
                wait.until(ExpectedConditions.visibilityOfElementLocated((By.id(accessibilityId))));
                isVisible = true;
            } catch (Exception ex) {
                isVisible = false;
                swipe(startX, startY, endX, endY, millis);
            }
        }
    }

    public void listScroller1(WebElement Xpath, int startX, int startY, int endX, int endY, int millis) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TestUtils.driverWAIT));
        int iteration = 0;
        boolean isVisible = false;

        while (!isVisible && iteration < 10) {
            try {
                iteration++;
                // Check mobile element visibility
                wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(String.valueOf(Xpath)))));
                isVisible = true;
            } catch (Exception ex) {
                isVisible = false;
                swipe(startX, startY, endX, endY, millis);
            }
        }
    }

    public WebElement Select_RandomTable(WebDriver driver) throws Exception
    {

//		if(driver.findElement(By.xpath(Utility.getXpathProperty(""))).isDisplayed())
//		{
//
//		}
        WebElement randomTab;



        if(driver.findElement(By.xpath("//div[@class='child']/button")).isDisplayed())
        {
//            test.log(LogStatus.INFO, "Table Layout is displayed");
        }
        else
        {
            if(driver.findElement(By.xpath("//p[.='You not created any Floors in your Store']")).isDisplayed())
            {

                //Click the Done button
                driver.findElement(By.xpath("//span[.='Done']/..")).click();

//                test.log(LogStatus.INFO, "Here Floor is not created");
            }

        }

        List<WebElement> TableList=driver.findElements(By.xpath("//div[@class='child']/button"));


        int tableSize=TableList.size();


        int randomTable=ThreadLocalRandom.current().nextInt(1, tableSize);

        System.out.println("Table No is : "+randomTable);
        try
        {
            Thread.sleep(2000);
            driver.findElement(By.xpath("//div[@class='child']/button["+randomTable+"]")).click();
        }
        catch(Exception lk) {}
        randomTab=driver.findElement(By.xpath("//div[@class='child']/button["+randomTable+"]"));

        return randomTab;

    }

    public void Select_RandomMenuItems(WebDriver driver) throws Exception
    {

        for(int i=1;i<=3;i++)
        {
            List<WebElement> MenuList=driver.findElements(By.xpath("//button[contains(@id,'menu-item')]"));


            int MenusSize=MenuList.size()-1;


            int randomMenu= ThreadLocalRandom.current().nextInt(1, MenusSize-1);

            //Remove Comment lines
	/*	Thread.sleep(1000);
	    JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement menuEle=driver.findElement(By.xpath("//button[@id='menu-item-"+randomMenu+"']"));
		js.executeScript("arguments[0].scrollIntoView(true);", menuEle);
		menuEle.click();
		*/
		/*
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement menuEle=driver.findElement(By.xpath("//div[@id='catAndMenuDiv']/div/div[3]/button["+randomMenu+"]"));
		js.executeScript("arguments[0].scrollIntoView(true);", menuEle);
		menuEle.click();
	*/

            JavascriptExecutor js=(JavascriptExecutor)driver;
            WebElement menuEle=driver.findElement(By.xpath("//div[contains(@class,'menuItem')]/button["+randomMenu+"]"));
            js.executeScript("arguments[0].scrollIntoView(true);", menuEle);
            menuEle.click();
		/*
		Reading_Excel_With_2_Menu_Item sw = new Reading_Excel_With_2_Menu_Item();
		sw.select_Some_MenuItems(driver, test);
		*/
            try
            {

                if(driver.findElement(By.xpath("//*[contains(@class,'modifier_content')]")).isDisplayed())
                {


                    List<WebElement> ModList=driver.findElements(By.xpath("//*[contains(@class,'modifier_content')]/ion-col[1]/button"));


                    int ModSize=ModList.size();


                    int randomMod=ThreadLocalRandom.current().nextInt(1, ModSize);



                    JavascriptExecutor js1=(JavascriptExecutor)driver;
                    WebElement modEle=driver.findElement(By.xpath("//*[contains(@class,'modifier_content')]/ion-col[1]/button["+randomMod+"]"));
                    js1.executeScript("arguments[0].scrollIntoView(true);", modEle);
                    modEle.click();



                    driver.findElement(By.xpath("//button[contains(.,'Done')]")).click();
                }
                if(driver.findElement(By.xpath("//*[contains(@class,'conversational_content')]")).isDisplayed())
                {


                    List<WebElement> ModList=driver.findElements(By.xpath("//*[contains(@class,'conversational_content')]/ion-col[1]/button"));


                    int ModSize=ModList.size();


                    int randomMod=ThreadLocalRandom.current().nextInt(1, ModSize);



                    JavascriptExecutor js1=(JavascriptExecutor)driver;
                    WebElement modEle=driver.findElement(By.xpath("//*[contains(@class,'conversational_content')]/ion-col[1]/button["+randomMod+"]"));
                    js1.executeScript("arguments[0].scrollIntoView(true);", modEle);
                    modEle.click();



                    driver.findElement(By.xpath("//button[contains(.,'Done')]")).click();
                }


            }
            catch(Exception cj)
            {

                try {
                    if (driver.findElement(By.xpath("//button[contains(.,'Done')]")).isDisplayed()) {

                        driver.findElement(By.xpath("//button[contains(.,'Done')]")).click();

                    }
                }catch (Exception e) {

                }

            }
        }

    }
}


